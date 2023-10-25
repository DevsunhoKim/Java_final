package com.sist.music;
// 크롤링 => 데이터를 모아서 저장 => 메모리
// ==> 배열 / 컬렉션
// 크롤링 => 파일에 저장
// 크롤링 => 오라클
// ------------------ 브라우저 출력
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class MusicManager {
	// 뮤직 전체 데이터 => 클라이언트 접속자에게 공유 => static
	private static ArrayList<Music> list=new ArrayList<Music>();
	
	// 크롤링 => 초기화
	static
	{
		try
		{
			Document doc=
		Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//poster <img>
		Elements poster=doc.select("table.list-wrap a.cover img");
			//곡명
		Elements title=doc.select("table.list-wrap td.info a.title");
			//가수명
		Elements singer=doc.select("table.list-wrap td.info a.artist");
			//앨범
		Elements album=doc.select("table.list-wrap td.info a.albumtitle");
		
		for(int i=0;i<poster.size();i++)
		{
			Music music=new Music();
			music.setRank(i+1);
			music.setPoster("http:"+poster.get(i).attr("src"));
			// 속성 값
			music.setTitle(title.get(i).text());
			music.setSinger(singer.get(i).text());
			music.setAlbum(album.get(i).text());
			
			list.add(music);
		}
		}catch(Exception ex) {}
	}
	// 목록 출력
	public ArrayList<Music> musicAllData()
	{
		return list;
	}
	// 상세 보기
	public Music musicDetailData(int no)
	{
		Music music=new Music();
		for(Music m:list)
		{
			if(m.getRank()==no)
			{
				music=m;
				break;
			}
		}
		return music;
	}
	// 검색
	public ArrayList<Music> musicFindData(String title)
	{
		ArrayList<Music> arr=new ArrayList<Music>();
		for(Music m:list)
		{
			if(m.getTitle().contains(title))
			{
				arr.add(m);
			}
		}
		return arr;
		
	}
}
