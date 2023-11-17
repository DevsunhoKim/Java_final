package com.sist.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExhibitionCrawler {

    public static void main(String[] args) {
        // Iterate through the page indices from 1 to 2000
        for (int pageIndex = 1; pageIndex <= 2000; pageIndex++) {
            String exhibitionUrl = "https://www.showala.com/ex/ex_detail.php?idx=" + pageIndex;

            try {
                Document document = Jsoup.connect(exhibitionUrl).get();

                // Extract information from the correct <ul> with class "ba_info"
                Element baInfoUl = document.selectFirst("div.ba_info ul");
                if (baInfoUl != null) {
                    String exhibitionName = getValue(baInfoUl, "li.kor_tit");
                    String exhibitionNameEnglish = getValue(baInfoUl, "li.eng_tit");
                    String exhibitionType = getValue(baInfoUl, "li.ex_type");
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

                    // Extract sponsor and sponsorship
                    String sponsor = getValue(baInfoUl, "li.opener2 p.des");
                    String sponsorship = getValue(baInfoUl, "li.found p.des");

                    // Output the extracted information
                    System.out.println("Page Index: " + pageIndex);
                    System.out.println("Exhibition Name: " + exhibitionName);
                    System.out.println("Exhibition Name (English): " + exhibitionNameEnglish);
                    System.out.println("Exhibition Type: " + exhibitionType);
                    System.out.println("Exhibition Field: " + exhibitionField);
                    System.out.println("Exhibition Items: " + exhibitionItems);
                    System.out.println("Homepage: " + homepage);
                    System.out.println("Start Date: " + startDate);
                    System.out.println("End Date: " + endDate);
                    System.out.println("Venue: " + venue);
                    System.out.println("Detailed Location: " + detailedLocation);
                    System.out.println("Industry: " + industry);
                    System.out.println("Image URL: " + imageUrl);
                    System.out.println("Host: " + host);
                    System.out.println("Subjectivity: " + subjectivity);
                    if (support != null && !support.isEmpty()) {
                        System.out.println("Support: " + support);
                    }
                    System.out.println("Sponsor: " + sponsor);
                    System.out.println("Sponsorship: " + sponsorship);
                    System.out.println("--------------------------------------");

                } else {
                    System.out.println("Error: Could not find ba_info ul for page index " + pageIndex);
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
            System.out.println("Warning: No elements found for selector '" + selector + "'");
            return "";
        }
    }
}
