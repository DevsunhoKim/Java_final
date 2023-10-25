package com.sist.student;
import java.util.*;
// 액션 클래스
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 학생관리 클래스
		StudentManager sm=new StudentManager();
		while(true)
		{
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 학생 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 추가하기");
			System.out.println("4. 수정하기");
			System.out.println("5. 삭제하기");
			System.out.println("6. 검색하기");
			System.out.println("7. 프로그램 종료");
			System.out.println("================");
			System.out.println("메뉴 선택 :");
			int menu=scan.nextInt();
			if(menu==7)
			{
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}
			else if(menu==1)
			{
				// 학생 정보를 받아서 출력
				ArrayList<Student> list=sm.studentAllData();
				for(Student s:list)
				{
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}
			else if(menu==2)
			{
				// 상세보기 출력
				System.out.print("상세보기 할 학번 선택 :");
				int hakbun=scan.nextInt();
				Student std=sm.studentDetailData(hakbun);
				System.out.println("학번:"+std.getHakbun());
				System.out.println("이름:"+std.getName());
				System.out.println("국어:"+std.getKor());
				System.out.println("영어:"+std.getEng());
				System.out.println("수학:"+std.getMath());
				System.out.println("총점:"+(std.getKor()+std.getEng()+
						std.getMath()));
				System.out.printf("평균:%.2f\n",(std.getKor()+std.getEng()+
						std.getMath())/3.0);
			}
			else if(menu==3)
			{
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.println("국어 점수 입력:");
				int kor=scan.nextInt();
				System.out.println("영어 점수 입력:");
				int eng=scan.nextInt();
				System.out.println("수학 점수 입력:");
				int math=scan.nextInt();
				Student std=new Student(sm.hakbunMaxData(),name,kor,eng,math);
				sm.studentInsert(std);
			}
			else if(menu==4)
			{
				System.out.println("수정할 학번 입력:");
				int hakbun=scan.nextInt();
				
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.println("국어 점수 입력:");
				int kor=scan.nextInt();
				System.out.println("영어 점수 입력:");
				int eng=scan.nextInt();
				System.out.println("수학 점수 입력:");
				int math=scan.nextInt();
				Student std=new Student(hakbun,name,kor,eng,math);
				sm.studentInsert(std);
			}
			else if(menu==5)
			{
				System.out.print("삭제할 학번 입력 :");
				int hakbun=scan.nextInt();
				sm.studentDelete(hakbun);
			}
			else if(menu==6)
			{
				System.out.println("이름 입력:");
				String name=scan.next();
				ArrayList<Student> list=sm.studentFindData(name);
				for(Student std:list)
				{
					System.out.println(std.getHakbun()+"."+std.getName());
				}
			}
			
		}
	}

}
