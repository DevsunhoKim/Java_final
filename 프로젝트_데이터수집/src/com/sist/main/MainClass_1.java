package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String html="<html>"+"<body>"+"<div id=aaa>"+
		   "<div class=bbb> Hello Java</div>"+"<a href=daum.net>"+"</a>"
					+"<div id=ccc>"+
           "<div class=ddd> Hello Java2</div>"+"<img src=aaa.png>"+
		   "</div>"+"<div class=kkk>"+"<div>Java</div>"+"</div>"+
		   "<div class=kkk>"+"<div>Oracle</div>"+"</div>"+
		   "<div class=kkk>"+"<div>Spring</div>"+"</div>"+
		   "<div class=kkk>"+"<div>C</div>"+"</div>"+
		   "</body>"+"</html>";
	    Document doc=Jsoup.parse(html,"UTF-8");
	    //System.out.println(doc);
	    Element elem=doc.selectFirst("div#aaa div.bbb");
	    System.out.println(elem.text());
	    Element elem2=doc.selectFirst("div#ccc img");
	    System.out.println(elem2.attr("src"));
	    System.out.println(elem2.text());
	    Elements div=doc.select("div.kkk div");
	    for (int i=0;i<div.size();i++)
	    {
	    	System.out.println(div.get(i).text());
	    }
	    
	    
		}catch(Exception ex) 
		{}
	}

}
