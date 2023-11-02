package com.sist.main;
import java.io.FileWriter;
import java.util.HashSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_4 {

    public static void main(String[] args) {
        try {
            int k = 1;
            HashSet<String> crawledImageURLs = new HashSet<>();

            for (int i = 1; i <= 5; i++) {
                Document doc = Jsoup.connect("https://www.yes24.com/Product/Category/BestSeller?categoryNumber=001&pageNumber=" + i).get();
                Elements link = doc.select("div.itemUnit span.img_grp a");

                for (int j = 0; j < link.size(); j++) {
                    try {
                        String subLink = "https://www.yes24.com" + link.get(j).attr("href");
                        System.out.println(subLink);
                        Document doc2 = Jsoup.connect(subLink).get();

                        // 이미지
                        Element poster = doc2.selectFirst("div.gd_tagGArea img");
                        String image = "";
                        try {
                            image = poster.attr("data-original");
                            if (crawledImageURLs.contains(image)) {
                                // 이미 크롤링한 이미지 URL인 경우 스킵
                                continue;
                            }
                            crawledImageURLs.add(image);
                        } catch (Exception ex) {
                            image = "이미지없음";
                        }

                        // 도서 정보 크롤링
                        Element title = doc2.selectFirst("h2.gd_name");
                        Element author = doc2.selectFirst("span.gd_pubArea span.gd_auth a");
                        Element publ = doc2.selectFirst("span.gd_pub");
                        Element score = doc2.selectFirst("span.gd_ratingArea em.yes_b");
                        Element price = doc2.selectFirst("strong.txt_num em.yes_b");

                        // 도서 정보를 "|" 문자로 구분하여 파일에 저장
                        String msg = k + "|" +
                                title.text() + "|" +
                                author.text() + "|" +
                                image + "|" +
                                publ.text() + "|" +
                                score.text() + "|" +
                                price.text() +
                                "\r\n";

                        FileWriter fw = new FileWriter("c:\\java_data\\book.txt", true);
                        fw.write(msg);
                        fw.close();
                    } catch (Exception ex) {
                        k--;
                    }
                    k++;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
