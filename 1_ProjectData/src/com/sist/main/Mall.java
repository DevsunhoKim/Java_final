package com.sist.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Mall {
    public static void main(String[] args) {
        String url = "https://egnmall.kr/kwa-ABS_goods_v-657-1009003";
        try {
            // Connect to the website and get the HTML document
            Document document = Jsoup.connect(url).get();

            // Extract product information
            String productName = document.select("h4").text();
            String imageSrc = document.select("p img[src]").attr("src");

            // Extract detail URL from the provided HTML structure
            Elements detailElements = document.select(".swiper-slide-active img[src]");
            String detail = detailElements.attr("src");

            String price = document.select("span.price_unit").text();
            String origin = document.select("span[style*=font-size]").text();
            String productCode = document.select("tr:contains(상품코드) td").text();
            String deliveryFee = document.select("tr:contains(배송비) td").text();
            String manufacturer = document.select("tr:contains(제조사) td").text();

            // Print the extracted information
            System.out.println("Product Name: " + productName);
            System.out.println("Image URL: " + imageSrc);
            System.out.println("Detail URL: " + detail);
            System.out.println("Price: " + price);
            System.out.println("Origin: " + origin);
            System.out.println("Product Code: " + productCode);
            System.out.println("Delivery Fee: " + deliveryFee);
            System.out.println("Manufacturer: " + manufacturer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
