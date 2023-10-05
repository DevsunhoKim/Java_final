import java.io.*;
import java.util.*;
/*
 *   라이브러리 
 *   --------
 *     java.lang : Object , String , StringBuffer , Math
 *                 Wrapper
 *     java.util : List, Set , Map 
 *     java.io   : 
 *     java.net 
 *     java.text 
 *     --------------------------------------------------
 */
public class 문자열_5 {
    static String movie;
    static
    {
    	try
    	{
    		FileReader fr=
    				new FileReader("c:\\javaDev\\movie.txt");
    		int i=0;
    		StringBuffer data=new StringBuffer();
    		while((i=fr.read())!=-1)//-1 (EOF)
    		{
    			data.append((char)i);
    		}
    		movie=data.toString();
    	}catch(Exception ex){}
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        //System.out.println(movie);
		String[] movieData=movie.split("\n");
		//System.out.println(movieData[0]);
		System.out.println("====== 영화 목록 =======");
		// 검색 
		// 송강호가 출연한 영화를 출력하시오 
		Scanner scan=new Scanner(System.in);
		//System.out.print("이름 입력:");
		//String name=scan.next();
		// 1990에 개봉한 영화 
		// 12세 이상 영화 
		System.out.print("등급 입력:");
		int grade=scan.nextInt();
		for(String movie:movieData)
		{
		    String[] detail=movie.split("\\|");
		    //if(detail[5].contains("1990"))
		    if(detail[6].startsWith(String.valueOf(grade)))
		    {
			    System.out.println("순위:"+detail[0]);
			    System.out.println("영화명:"+detail[1]);
			    System.out.println("장르:"+detail[2]);
			    System.out.println("출연:"+detail[4]);
			    System.out.println("개봉일:"+detail[5]);
			    System.out.println("등급:"+detail[6]);
			    System.out.println("감독:"+detail[7]);
			    System.out.println("--------------------------------");
		    }
		    
		}
	}

}







