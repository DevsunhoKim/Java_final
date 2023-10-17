package com.sist.main2;
class Movie{
	// 공통성
	/*
	 *  예약을 한다
	 *  영화목록을 보여준다
	 *  상세보기
	 *  결제를 한다
	 *  영화 추천
	 */
	void reserve() {
		System.out.println("예약을 한다");
	}
	void list() {
		System.out.println("영화 목록을 버여준다");
	}
	void detail() {
		System.out.println("영화 상세보기를 한다");
	}
	void recommand() {
		System.out.println("영화 추천기능 수행");
	}
}
class CGV extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약");
	}

	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}
	
}
class MegaBox extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}
	// 확장 => Movie가 가지고 있는 메소드 외의 다른 기능추가
	public void print()
	{
		System.out.println("MegaBox:print Call...");
	}

	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommand() {
		// TODO Auto-generated method stub
		super.recommand();
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mm=new CGV(); //Movie 안에 있는 메소드를 호출
		                    // 메소드 호출시에 오버라이딩을 하면 => 변경된 메소드 호출
		
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		mm.reserve();//
		// 생성자와 클래스가 다른경우 => 오버라이딩 메소드를 호출한다
	}
	// 한개의 객체만 생성 => 상위 클래스
	// 상속을 받는 목적 => 관련된 클래스를 묶어서 한 개의 객체 이용

}
