package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExhibitionCrawler2 {

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

                    // Add conditions for specific exhibitions
                    if (exhibitionName.contains("KFA Franchise Startup Expo Busan")) {
                        // Crawl additional information for this exhibition
                        String host = getValue(baInfoUl, "li.opener p.des");
                        String subjectivity = getValue(baInfoUl, "li.opener2 p.des");
                        String support = getValue(baInfoUl, "li.found p.des");

                        // Extract sponsor and sponsorship from the correct <li> tags
                        Element sponsorLi = baInfoUl.selectFirst("li.opener2");
                        Element sponsorshipLi = baInfoUl.selectFirst("li.found");

                        // Output the additional information
                        System.out.println("Exhibition Name: " + exhibitionName);
                        System.out.println("Host: " + host);
                        System.out.println("Subjectivity: " + subjectivity);
                        System.out.println("Support: " + support);
                        System.out.println("Sponsor: " + sponsorLi.select("p.des").text());
                        System.out.println("Sponsorship: " + sponsorshipLi.select("p.des").text());
                        System.out.println("--------------------------------------");
                    } else {
                        // Extract information as usual for other exhibitions
                        String exhibitionNameEnglish = getValue(baInfoUl, "li.eng_tit");
                        String exhibitionType = getValue(baInfoUl, "li.ex_type");
                        String exhibitionField = getValue(baInfoUl, "li.work_cate p.des");
                        String exhibitionItems = getValue(baInfoUl, "li.ex_cate p.des");
                        // ... (your existing code for other exhibitions)
                    }
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