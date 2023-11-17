package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Data2 {

    public static void main(String[] args) {
        String mainUrl = "https://www.bexco.co.kr/kor/CMS/EventScheduleMgr/list.do?robot=Y&mCode=MN214&page=";

        // Loop through pages
        for (int page = 1; page <= 141; page++) {
            String url = mainUrl + page;

            try {
                Document mainPageDocument = Jsoup.connect(url).get();
                Elements detailPageLinks = mainPageDocument.select("div.eventList a");

                // Loop through detail page links on the main page
                for (Element link : detailPageLinks) {
                    String detailPageUrl = link.attr("abs:href");

                    // Call method to extract information from detail page
                    extractDetailPageInfo(detailPageUrl);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
     
 // 입장료가 유효한지 확인하고 유효한 값 또는 "정보 없음"을 반환하는 도우미 메서드
    private static String getValidAdmissionFee(String admissionFee) {
        // "원"이나 "무료"와 같은 키워드를 확인하는 조건 추가
        if (admissionFee != null && (admissionFee.contains("원") || admissionFee.contains("무료"))) {
            return admissionFee;
        } else if (admissionFee != null && admissionFee.trim().toLowerCase().contains("information")) {
            // "information"이 포함되어 있으면 "정보 없음" 반환
            return "정보 없음";
        } else {
            // 그 외의 경우는 "정보 없음" 반환
            return "정보 없음";
        }
    }
    private static String extractEventNumber(Document document) {
        // Extract the event number from the end of the URL
        String url = document.location();
        String[] urlParts = url.split("/");
        String lastPart = urlParts[urlParts.length - 1];

        // Remove any non-numeric characters
        String eventNumber = lastPart.replaceAll("[^0-9]", "");

        return eventNumber;
    }

    private static String extractClassification(Document document) {
        Element eventIconElement = document.selectFirst("span.eventIcon");
        return eventIconElement != null ? eventIconElement.text() : "";
    }

    private static String extractPosterUrl(Document document) {
        // Extract the encoded poster URL from the HTML
        Element posterElement = document.selectFirst("div.EventVCont img");

        if (posterElement != null) {
            // Get the value of the 'src' attribute
            String encodedUrl = posterElement.attr("src");

            // Clean up the URL (remove unnecessary characters)
            String cleanedUrl = encodedUrl.replaceAll("&", "&");

            try {
                // Decode the URL
                String decodedUrl = URLDecoder.decode(cleanedUrl, "UTF-8");
                return decodedUrl;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "";
            }
        } else {
            return "";
        }
    }

    private static String extractTextContent(Document document) {
        // Extract text content from the specified div
        Element textContentElement = document.selectFirst("div.EventVContTxt div.EventViewtxt div.txt");
        return textContentElement != null ? textContentElement.text() : "";
    }

    private static void extractDetailPageInfo(String url) {
        try {
            Document document = Jsoup.connect(url).get();

            // 이벤트 정보 추출
            Element eventElement = document.selectFirst("div.EventVtop");
            String eventName = eventElement.select("h3.subject span.stit").text();
            String eventDate = eventElement.select("span.date").text();
            String eventTime = eventElement.select("span.time").text();
            String eventLocation = eventElement.select("a.place").text();

            // 추가 정보 추출
            String eventNumber = extractEventNumber(document);
            String classification = extractClassification(document);
            String posterUrl = extractPosterUrl(document);
            String textContent = extractTextContent(document);
            String imageURL = extractImageURL(document); 
            // 주최 정보 추출
            Element hostingElement = document.selectFirst("div.infoBox");

            // 최대 5개의 값을 저장할 배열 사용
            String[] additionalInfo = new String[5];
            additionalInfo[0] = extractTextByIndex(hostingElement, 0);
            additionalInfo[1] = extractTextByIndex(hostingElement, 1);
            additionalInfo[2] = extractTextByIndex(hostingElement, 2);
            additionalInfo[3] = extractTextByIndex(hostingElement, 3);
            additionalInfo[4] = extractTextByIndex(hostingElement, 4);

            // 추출한 정보를 출력하거나 사용합니다.
            System.out.println("이벤트 번호: " + eventNumber);
            System.out.println("이벤트 이름: " + eventName);
            System.out.println("날짜: " + eventDate);
            System.out.println("시간: " + eventTime);
            System.out.println("장소: " + eventLocation);
            System.out.println("분류: " + classification);
            System.out.println("포스터 (보류): " + posterUrl);
            System.out.println("이미지 URL: " + imageURL);
            System.out.println("본문 내용: " + textContent);
            System.out.println("주관 / 주최: " + getValidValue(additionalInfo[0]));
            System.out.println("입장료: " + getValidAdmissionFee(additionalInfo[1]));
            System.out.println("전화번호: " + getValidPhoneNumber(additionalInfo[2]));
            System.out.println("이메일: " + getValidEmail(additionalInfo[3]));
            System.out.println("홈페이지: " + getValidValue(additionalInfo[4]));
            System.out.println("--------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getValidPhoneNumber(String phoneNumber) {
        // 전화번호 형식을 확인하는 정규식
        String phoneRegex = "\\d{2,3}-\\d{3,4}-\\d{4}";

        // 만약 전화번호가 유효한 형식이면 반환, 아니면 "정보 없음" 반환
        if (phoneNumber != null) {
            // 전화번호에 포함된 공백 제거
            phoneNumber = phoneNumber.replaceAll("\\s", "");
            
            // 정규식을 이용해 유효성 검사
            if (phoneNumber.matches(phoneRegex)) {
                return phoneNumber;
            } else if (phoneNumber.toLowerCase().contains("information")) {
                // "information"이 포함되어 있으면 "정보 없음" 반환
                return "정보 없음";
            }
        }

        // 그 외의 경우는 "정보 없음" 반환
        return "정보 없음";
    }

    private static String getValidEmail(String email) {
        // 이메일 형식을 확인하는 정규식
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        return (email != null && email.matches(emailRegex)) ? email : "정보 없음";
    }

    private static String getValidValue(String value) {
        return (value != null && !value.trim().isEmpty()) ? value : "정보 없음";
    
    }
    private static String extractTextByIndex(Element parentElement, int index) {
        Elements elements = parentElement.select("ul.infolist li span.ltxt");
        return (index < elements.size()) ? elements.get(index).text() : "";
    }
    private static String extractImageURL(Document document) {
        // Extract the image URL from the specified div
        Element imgElement = document.selectFirst("div.imgBox img");
        return (imgElement != null) ? imgElement.attr("src") : "";
    }

}