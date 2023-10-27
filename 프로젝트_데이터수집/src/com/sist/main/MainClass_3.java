package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements link=doc.select("div.section_ranking strong.tit_item a");
			for(int i=0;i<link.size();i++)
			{
				try {
				//System.out.println(link.get(i).attr("href"));
				String subLink="https://movie.daum.net" + link.get(i).attr("href");
				System.out.println(subLink);
				Document doc2=Jsoup.connect(subLink).get();
				//제목
				/*
				 * <h3 class="tit_movie">
                	<span class="txt_tit">
                    그대들은 어떻게 살 것인가
                </span>
				 */
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				System.out.println(title.text());
				Element state=doc2.selectFirst("h3.tit_movie span.txt_state");
				System.out.println(state.text());
				/*
				 *   <div class="detail_cont">
            			<div class="inner_cont">
                        <dl class="list_cont">
                                <dt>개봉</dt>
                            <dd>2023.10.25</dd>
                        </dl>
                    <dl class="list_cont">
                        <dt>장르</dt>
                        <dd>애니메이션/어드벤처/판타지/드라마</dd>
                    </dl>
                    <dl class="list_cont">
                        <dt>국가</dt>
                        <dd>일본</dd>
                    </dl>
                        <dl class="list_cont">
                        <dt>등급</dt>
                        <dd>
                            전체관람가
                        </dd>
                        </dl>
                    <dl class="list_cont">
                    <dt>러닝타임</dt>
                    <dd>
                        123분
                    </dd>
                    </dl>
				 */
				Element dd1=doc2.select("div.detail_cont dl.list_cont dd").get(0);
				Element dd2=doc2.select("div.detail_cont dl.list_cont dd").get(1);
				Element dd3=doc2.select("div.detail_cont dl.list_cont dd").get(2);
				Element dd4=doc2.select("div.detail_cont dl.list_cont dd").get(3);
				Element dd5=doc2.select("div.detail_cont dl.list_cont dd").get(4);
				//Elements detail=doc2.select("div.detail_cont dl.list_cont dd");
				//System.out.println(detail);
				//String temp="";
				/*for(int j=0;j<detail.size();j++)
				{
					temp+=detail.get(j).text() + "|";
					System.out.println(detail.get(j).text());
				}*/
				System.out.println(dd1.text());
				System.out.println(dd2.text());
				System.out.println(dd3.text());
				System.out.println(dd4.text());
				System.out.println(dd5.text());
				
				Element poster=doc2.selectFirst("div.info_poster span.bg_img");
				String image="";
				/*image=image.substring(image.indexOf("(")+1, image.lastIndexOf(")"));
				System.out.println(image);*/
				try
				{
					image=poster.attr("style");
				}catch(Exception ex)
				{
					System.out.println("이미지 없음");
				}
				String msg=(i+1) + "|"
				           + title.text() + "|"
				           + state.text() + "|"
				           + image + "|"
				           + dd1.text() + "|"
				           + dd2.text() + "|"
				           + dd3.text() + "|"
				           + dd4.text() + "|"
				           + dd5.text() + "|" + "\r\n";
				//msg=msg.substring(0, msg.lastIndexOf("|"));
				//msg+="\r\n";
				
				FileWriter fw=new FileWriter("c:\\java_data\\movie.txt", true);
				fw.write(msg);
				fw.close();
				}catch(Exception ex) {}
			}
		}catch(Exception ex) {}
	}

}