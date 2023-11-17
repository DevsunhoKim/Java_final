package com.sist.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Data1 {

    public static void main(String[] args) {
    	 
    	
        String url = "https://www.bexco.co.kr/kor/CMS/EventScheduleMgr/view.do?mCode=MN214&&event_seq=12161";

        try {
            Document document = Jsoup.connect(url).get();

            // Extract event information
            Element eventElement = document.selectFirst("div.EventVtop");
            String eventName = eventElement.select("h3.subject span.stit").text();
            String eventDate = eventElement.select("span.date").text();
            String eventTime = eventElement.select("span.time").text();
            String eventLocation = eventElement.select("a.place").text();

            // Extract hosting information
            Element hostingElement = document.selectFirst("div.infoBox");

            String organizer = extractTextByIndex(hostingElement, 0);
            String admissionFee = extractTextByIndex(hostingElement, 1);
            String phoneNumber = extractTextByIndex(hostingElement, 2);
            String email = extractTextByIndex(hostingElement, 3);
            String homepage = extractTextByIndex(hostingElement, 4);

           
            // Print or use the extracted information
            System.out.println("Event Name: " + eventName);
            System.out.println("Date: " + eventDate);
            System.out.println("Time: " + eventTime);
            System.out.println("Location: " + eventLocation);
            System.out.println("Organizer: " + organizer);
            System.out.println("Admission Fee: " + admissionFee);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
            System.out.println("Homepage: " + homepage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static String extractTextByIndex(Element parentElement, int index) {
        Elements elements = parentElement.select("ul.infolist li span.ltxt");
        return (index < elements.size()) ? elements.get(index).text() : "";
    }
}
