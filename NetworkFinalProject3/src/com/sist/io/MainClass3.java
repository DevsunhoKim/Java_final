package com.sist.io;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int k=1;
			for(int i=1;i<=5;i++)
			{	
				Document doc=Jsoup.connect("https://www.yes24.com/Product/Category/BestSeller?categoryNumber=001&pageNumber="+i+"&pageSize=24").get();
				Elements link=doc.select("div.itemUnit span.img_grp a");
				Elements poster=doc.select("em.img_bdr img");

				for(int j=0;j<link.size();j++)
				{
					try
					{
						String image=poster.get(j).attr("data-original");
						String subLink="https://www.yes24.com/"+link.get(j).attr("href");
						System.out.println(subLink);
						
						Document doc2=Jsoup.connect(subLink).get();
					
						//제목
						Element title=doc2.selectFirst("h2.gd_name");
						System.out.println(title.text());
					
						//작가
						Element author=doc2.selectFirst("span.gd_pubArea span.gd_auth a");
						System.out.println(author.attr("href"));
					
						//출판사
						Element publ=doc2.selectFirst("span.gd_pub");
						System.out.println(publ.text());
					
						//평점
						Element score=doc2.selectFirst("span.gd_ratingArea em.yes_b");
						System.out.println(score.text());
					
						//가격
						Element price=doc2.selectFirst("tr.accentRow");
						System.out.println(price.text());
					
						//이미지
						
						String msg=k+"|"
								+title.text()+"|"
								+author.text()+"|"
								+image + "|"
								+publ.text()+"|"
								+score.text()+ "\r\n";
						msg=msg.substring(0,msg.lastIndexOf("|"));
						msg+="\r\n";
				
						FileWriter fw=new FileWriter("c:\\java_data\\book.txt",true);
						fw.write(msg);
						fw.close();
					}catch(Exception ex) {k--;}
					k++;	
				}
			
			}
		}catch(Exception ex) {}

	}
}
