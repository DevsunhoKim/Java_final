package com.sist.main2;

class Movie
{
	// 공통성
	/*
	 *   예약을 한다
	 *   영화 목록을 보여준다
	 *   상세보기
	 *   결제
	 *   영화 추천
	 */
	void reserve()
	{
		System.out.println("예약을 한다");
	}
	void list()
	{
		System.out.println("영화 목록을 보여준다");
	}
	void detail()
	{
		System.out.println("영화 상세보기를 한다");
	}
	void recommand()
	{
		System.out.println("영화 추천 기능 수행");
	}
}
class CGV extends Movie
{
	// 기능 추가
	@Override
	public void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약");
	}

	
	
}
class MegaBox extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}
	// 확장 => Movie가 가지고 있는 메소드 => 다른 기능 추가
	public void print()
	{
		System.out.println("MegaBox:print() Call");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		// 한 개의 객체만 생성 => 상위 클래스
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 한 개의 객체 이용
		Movie mm=new CGV(); // Movie안에 있는 메소드를 호출
		                    // 메소드 호출 시 오버라이딩을 하면 변경된 메소드 호출
		mm.reserve();
		// 생성자와 클래스가 다른 경우 => 오버라이딩 메소드를 호출
		mm=new MegaBox(); // mm은 print()를 호출할 수 없음
		mm.reserve();
		/*
		 *   생성자와 클래스명이 다른 경우
		 *   Moive m=new CGV()
		 *   -----   ---------
		 *   m을 통해 접근 시 Movie 안에 있는 메소드와 멤버변수에만 접근 가능
		 *   
		 *   class Movie
		 *   {
		 *       int a;
		 *       void print(){movie}
		 *   }
		 *   class CGV extends Movie
		 *   {
		 *       int b;
		 *       void aaa(){}
		 *       --------------
		 *       int a; => 멤버변수 오버라이딩
		 *       void print(){cgv} => 메소드 오버라이딩
		 *       --------------
		 *   }
		 *   
		 *   Movie m=new CGV();
		 *           ---------
		 *              | 주소 변경
		 *   m ==> a, print() => CGV가 가지고 있는 print()
		 *   
		 *   1) 변수 => 클래스명
		 *   2) 메소드 => 생성자
		 *   
		 *   ==> 100개
		 *   ==> 분리
		 *   ==> 한 개의 객체로 제어 ==> Object
		 *   ==> 배열
		 *   Object[] obj={10, "aaa", 10.5, 'A', new Movie()} => 모든 데이터형이 가능
		 */
		// Object o=10;
		// int i=(int)o;
		
		Object o=new CGV();
		
		CGV cc=(CGV)o;
		
		// 자바에서 => 클래스 객체를 리턴하는 메소드가 많이 존재 
		//          ------------- Object
	}

}