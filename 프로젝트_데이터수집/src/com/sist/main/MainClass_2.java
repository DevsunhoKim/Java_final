package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=
		Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("div.section_ranking strong.tit_item a");
			Elements poster=doc.select("div.section_ranking div.poster_movie img");
			Elements grade=doc.select("div.section_ranking span.txt_tag span");
			Elements avg=doc.select("div.section_ranking span.txt_grade");
			Elements rev=doc.select("div.section_ranking span.txt_append span.txt_num");
			
			/*
			 * 태그 사이에 <> **** <> 값을 가져올때는 text()
			 * 
			 * <a=****><> 값을 가져올때는 attr("****")
			 */
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(grade.get(i).text());
				System.out.println(avg.get(i).text());
				System.out.println(rev.get(i).text());
				System.out.println(title.get(i).attr("href"));
			}
			
		}catch(Exception ex) {}
	}

}
