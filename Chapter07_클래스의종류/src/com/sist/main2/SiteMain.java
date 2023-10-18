package com.sist.main2;
import java.util.*;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Map map=new HashMap();
		map.put("c1", new MemberController());
		map.put("c1", new BoardController());
		map.put("c1", new MovieController());
		map.put("c1", new MusicController());
		map.put("c1", new SeoulController());
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 회원관리");
			System.out.println("2. 게시판");
			System.out.println("3. 영화");
			System.out.println("4. 음악");
			System.out.println("5. 서울 여행");
			System.out.println("6. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택 :");
			int menu=scan.nextInt();
			
			if(menu==6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			
			Controller c=(Controller)map.get("c"+menu);
			c.execute();
			
			/*
			if(menu==1)
			{
				MemberController mc= new MemberController();
				mc.execute();
			}
			else if(menu==2)
			{
				BoardController bc=new BoardController();
				bc.execute();
			}
			else if(menu==3)
			{
				MovieController mc=new MovieController();
				mc.execute();
			}
			else if(menu==4)
			{
				MusicController mc=new MusicController();
				mc.execute();
			}
			else if(menu==5)
			{
				SeoulController sc=new SeoulController();
				sc.execute();
			}
			else if(menu==6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			*/
			
			}
			
		}
	}


