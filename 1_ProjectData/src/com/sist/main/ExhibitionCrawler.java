package com.sist.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExhibitionCrawler {

    public static void main(String[] args) {
        // Iterate through the page indices from 800 to 1900
        for (int pageIndex = 800; pageIndex <= 1900; pageIndex++) {
            String exhibitionUrl = "https://www.showala.com/ex/ex_detail.php?idx=" + pageIndex;

            try {
                Document document = Jsoup.connect(exhibitionUrl).get();

                // Extract information from the correct <ul> with class "ba_info"
                Element baInfoUl = document.selectFirst("div.ba_info ul");
                if (baInfoUl != null) {
                    String exhibitionName = getValue(baInfoUl, "li.kor_tit");
                    String exhibitionNameEnglish = getValue(baInfoUl, "li.eng_tit");
                    String exhibitionField = getValue(baInfoUl, "li.work_cate p.des");
                    String exhibitionItems = getValue(baInfoUl, "li.ex_cate p.des");

                    // Traverse to the parent div for the homepage link
                    Element parentDiv = baInfoUl.parent();
                    String homepage = getValue(parentDiv, "li.homp a.des");

                    // Extract information from the remaining <li> elements
                    String startDate = getValue(baInfoUl, "li.date p.des").split(" ~ ")[0];
                    String endDate = getValue(baInfoUl, "li.date p.des").split(" ~ ")[1];
                    String venue = getValue(baInfoUl, "li.where p.des");
                    String detailedLocation = getValue(baInfoUl, "li.where + li p.des");
                    String industry = getValue(baInfoUl, "li.work_cate p.des");

                    // Extract URL from the div with class "exb_img_sns"
                    Element exbImgSnsDiv = document.selectFirst("div.exb_img_sns");
                    String imageUrl = exbImgSnsDiv != null ? exbImgSnsDiv.selectFirst("div.exb_img_wrap").attr("style") : "";
                    imageUrl = imageUrl.substring(imageUrl.indexOf("('") + 2, imageUrl.indexOf("')"));

                    // Extract host, subjectivity, and support
                    String host = getValue(baInfoUl, "li.opener p.des");
                    String subjectivity = getValue(baInfoUl, "li.found p.des");
                    String support = getValue(baInfoUl, "li.support p.des");

                    // Check if the keywords are present in the relevant fields
                    if (containsKeyword(exhibitionName, "부산", "busan")
                            || containsKeyword(exhibitionNameEnglish, "부산", "busan")
                            || containsKeyword(venue, "벡스코", "bexco")) {
                        // Output the extracted information
                        System.out.println("고유번호: " + pageIndex);
                        System.out.println("전시회명: " + exhibitionName);
                        System.out.println("영문명: " + exhibitionNameEnglish);
                        System.out.println("전시 분야: " + exhibitionField);
                        System.out.println("전시 품목: " + exhibitionItems);
                        System.out.println("홈페이지: " + homepage);
                        System.out.println("시작일: " + startDate);
                        System.out.println("종료일: " + endDate);
                        System.out.println("개최장소: " + venue);
                        System.out.println("상세장소: " + detailedLocation);
                        System.out.println("산업분야: " + industry);
                        System.out.println("이미지URL: " + imageUrl);
                        System.out.println("주최: " + host);
                        System.out.println("주관: " + subjectivity);
                        if (support != null && !support.isEmpty()) {
                            System.out.println("Support: " + support);
                        }
                  
                        System.out.println("--------------------------------------");
                    }
                } else {
                   // System.out.println("Error: Could not find ba_info ul for page index " + pageIndex);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getValue(Element element, String selector) {
        Elements selectedElements = element.select(selector);
        if (!selectedElements.isEmpty()) {
            return selectedElements.text();
        } else {
            //System.out.println("Warning: No elements found for selector '" + selector + "'");
            return "";
        }
    }
    private static boolean containsKeyword(String text, String... keywords) {
        for (String keyword : keywords) {
            if (text.toLowerCase().contains(keyword.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

   
}