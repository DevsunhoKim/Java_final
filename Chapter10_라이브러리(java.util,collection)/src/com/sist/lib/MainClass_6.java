package com.sist.lib;
// 멜론 : 곡명 , 지니뮤직 : 곡명 => 중복이 완된 노래만 추출
// 공통 / 차집합 / 교집합 / 합집합
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MainClass_6 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc =
	Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static Set<String> melonMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc =
	Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> genie=genieMusic();
		System.out.println("==================지니=============");
		for(String title:genie)
		{
			System.out.println(title);
		}
		System.out.println("==================멜론=============");
		Set<String> melon=melonMusic();
		System.out.println("==================지니=============");
		for(String title:melon)
		{
			System.out.println(title);
		}
		
		/*
		System.out.println("===== 지니 뮤직에만 있는 노래=====");
		// 차집합 => removeAll()
		// [1,2,3,4,5] -[1,2,3,6,7] =45
		*/
		
		/*
		System.out.println("=====  교집합 =====");
		genie.retainAll(melon);
		System.out.println("곡수:"+genie.size());
		for(String title:genie)
		{
			System.out.println(title);
		}
		*/
		
		System.out.println("===== 지니뮤직 + 멜론=====");
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		
		for(String title:list)
		{
			System.out.println(title);
		}
		System.out.println("===== 지니뮤직 + 멜론=====");
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);
		System.out.println("곡 개수:"+hap.size());
		for(String title:hap)
		{
			System.out.println(title);
		}
					
	}

}
