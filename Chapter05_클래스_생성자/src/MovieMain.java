import java.util.*;
import java.io.*;
// 사용자 정의 데이터형
class Movie{
	String rank;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
	
}
class MovieSysyem{
	static Movie[] movies=new Movie[1938];
	
	// 1. 데이터 저장(초기화) => 생성자
	MovieSysyem() {
		
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				data.append((char)i);
			}
			fr.close();
			String[] datas=data.toString().split("\n");
			//전체 문자열을 한 줄씩 잘라냄
			i=0;
			for(String ss:datas)
			{
				String[] s=ss.split("\\|");
				movies[i]=new Movie();
				movies[i].rank=s[0];
				movies[i].title=s[1];
				movies[i].genre=s[2];
				movies[i].poster=s[3];
				movies[i].actor=s[4];
				movies[i].regdate=s[5];
				movies[i].grade=s[6];
				movies[i].director=s[7];
				i++;
			}
		}catch(Exception ex) {}
	}
	// 2. 목록 출력 
	void list() {
		for(Movie m:movies)
		{
			System.out.println(m.rank+"."+m.title);
		}
	}
	// 3. 상세보기
	void detail(int mno)
	{
		//배열 => 인덱스 => 구분자는 필요 없다 => rank
		Movie m=movies[mno-1];
		System.out.println("===== 영화 상세 내용 =====");
		System.out.println("영화명 :"+m.title);
		System.out.println("감독 :"+m.director);
		System.out.println("장르 :"+m.genre);
		System.out.println("출연진 :"+m.actor);
		System.out.println("등급 :"+m.grade);
		System.out.println("개봉일 :"+m.regdate);
		System.out.println("순위 :"+m.rank);
	}
	// 4. 영화명 찾기
	void movieNameFind(String title)
	{
		System.out.println("===== 검색 결과 =====");
		for(Movie m:movies)
		{
			if(m.title.contains(title))
			{
				System.out.println(m.title);
			}
		}
		System.out.println("=====================");
	}
	// 5. 출연으로 찾기
	
	void movieActorFind(String actor)
	{
		for(Movie m:movies)
		{
			if(m.actor.contains(actor))
			{
				System.out.println(m.title+"("+m.actor+")");
			}
		}
	}
	// 6. 장르 찾기
	void movieGenreFind(String genre)
	{
		for(Movie m:movies)
		{
			if(m.genre.contains(genre))
			{
				System.out.println(m.title+"("+m.genre+")");
			}
		}
	}
}
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JSP
		MovieSysyem ms=new MovieSysyem();
		ms.list();
		System.out.println("=========================");
		Scanner scan=new Scanner(System.in);
		//System.out.println("영화 상세보기 선택 (1~1938)");
		//int mno=scan.nextInt();
		//ms.detail(mno);
		System.out.print("검색어 입력:");
		//String title=scan.next();
		//ms.movieNameFind(title);
		//String actor=scan.next();
		//ms.movieActorFind(actor);
		String genre=scan.next();
		ms.movieGenreFind(genre);
		
		
	}

}
