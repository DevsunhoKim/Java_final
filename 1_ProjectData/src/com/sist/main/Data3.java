package com.sist.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Data3 {

    public static void main(String[] args) {
        // Base URL for the detail pages
        String detailPageBaseUrl = "https://www.visitbusan.net/schedule/view.do?boardId=BBS_0000009&menuCd=DOM_000000204012000000&dataSid=";

        // Iterate over detail pages with sequence numbers between 2000 and 2999
        for (int detailPageId = 2000; detailPageId <= 2999; detailPageId++) {
            String detailPageUrl = detailPageBaseUrl + detailPageId;

            // Call the method to extract detail page info for the current detail page
            extractDetailPageInfo(detailPageUrl, detailPageId);
        }
    }

    private static void extractDetailPageInfo(String url, int sequenceNumber) {
        try {
            Document document = Jsoup.connect(url).get();

            // Check if there is a valid sequence number
            if (sequenceNumber >= 2000 && sequenceNumber <= 2999) {
                // Extract event details
                Elements eventElements = document.select("div.tit_view_sub p, div.tit_view_sub3 ul li, div.tit_view_sub2 a, td.bbs_content");

                // Check if there are elements before accessing them
                if (!eventElements.isEmpty()) {
                    // Extract data from elements
                    String eventName = eventElements.size() > 0 ? eventElements.get(0).text() : "";
                    String eventDate = eventElements.size() > 1 ? eventElements.get(1).text() : "";
                    String homepage = eventElements.size() > 2 ? eventElements.get(2).select("a").attr("href") : "";
                    String content = eventElements.size() > 3 ? eventElements.get(3).html() : "";

                    // Output the details including the sequence number
                    System.out.println("Sequence Number: " + sequenceNumber);
                    System.out.println("Event Name: " + eventName);

                    // Extract and print start and end dates without 'Date: ' prefix
                    String[] dateParts = eventDate.split("~");
                    if (dateParts.length == 2) {
                        String startDate = dateParts[0].trim().replace("Date: ", "");
                        String endDate = dateParts[1].trim();
                        System.out.println("Start Date: " + startDate);
                        System.out.println("End Date: " + endDate);
                    } else {
                        System.out.println("Invalid date format: " + eventDate);
                    }

                    // Extract and print additional details excluding anchor tags
                    Elements additionalDetails = document.select("div.tit_view_sub2 + p").not("a");
                    for (Element detail : additionalDetails) {
                        String text = detail.text().trim();

                        // Handle different cases based on the content
                        if (text.startsWith("Venue:")) {
                            String venue = text.replace("Venue:", "").trim();
                            System.out.println("Venue: " + venue);
                        } else if (text.startsWith("Festival Contents:")) {
                            String festivalContents = text.replace("Festival Contents:", "").trim();
                            System.out.println("Festival Contents: " + festivalContents);
                        } else {
                            // Add more conditions as needed for other details
                            System.out.println("Unknown Detail: " + text);
                        }
                    }

                    // Extract and print image link
                    Element imageElement = document.select("td.bbs_content img").first();
                    String imageLink = (imageElement != null) ? "https://www.visitbusan.net/" + imageElement.attr("src") : "";
                    System.out.println("Image Link: " + imageLink);

                    // Modify the homepage value to crawl http://gwangallimdrone.co.kr/
                    homepage = (homepage != null && !homepage.isEmpty()) ? "http://gwangallimdrone.co.kr/" : "";
                    System.out.println("Homepage: " + homepage);

                    System.out.println("Event Content: " + content);
                    System.out.println("------------------------------");
                } else {
                    // No need to print a message if no event details were found
                    //System.out.println("No event details found on the page: " + url);
                }
            } else {
                // Print null for invalid sequence numbers
                System.out.println("Invalid sequence number: " + sequenceNumber);
            }

        } catch (IOException e) {
            // Handle the IOException here
            e.printStackTrace();
        } catch (RuntimeException e) {
            // Handle other runtime exceptions here
            e.printStackTrace();
        }
    }







    
}
