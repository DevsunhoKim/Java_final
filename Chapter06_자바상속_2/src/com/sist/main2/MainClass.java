package com.sist.main2;
// 변수,메소드 오버라이딩 => 덮어쓴다  
/*
 *   오버라이딩 
 *   -------
 *   1) 메소드명이 동일 
 *   2) 상속
 *   3) 매개변수가 동일 
 *   4) 리턴형 동일 
 *   5) 축소는 불가능 , 확대는 가능 (접근지정어) 
 *      ---------------------
 *      private < default < protected < public 
 */
class Super{
	int number=10;
	void display()
	{
		System.out.println("Super:display Call...");
	}
}
class Sub extends Super // Super를 확장해서 새로운 클래스를 만든다 
{
	int number=20;
	void display() 
	{
		System.out.println("Sub:display Call...");
	}
	/*
	 *   void display()
	     {
		   System.out.println("Super:display Call...");
	     }
	     //  변경이 가능 => 오버라이딩 
	 */
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Super su=new Super();
        System.out.println("super.number="+su.number);
        Sub sub=new Sub();
        System.out.println("sub.number="+sub.number);
        
        Super su1=new Sub();
        System.out.println("super.number="+su1.number);*/
        // 클래스 선언에 따라서 해당 데이터를 제어 
        // Super생성 => Super에 있는 변수
		// Super / Sub / Sub=Super
		Super s1=new Super();
		s1.display();// Super
		//***
		Sub sub=new Sub();
		sub.display();// Sub
		//***
		Super s2=new Sub();
        s2.display();// Sub
        
        /*
         *     멤버변수 : 선언된 클래스형 
         *       Super s=new Super()  ===> Super가 가지고 있는 변수 제어 
         *       Sub sub=new Sub() ==> Sub가 가지고 있는 변수 제어
         *       Super s=new Sub() ==> Super가 가지고 있는 변수 제어 
         *     메소드 
         *       Super s=new Super() ==> Super
         *       Sub sub=new Sub() ==> Sub
         *       Super s=new Sub() ==> Sub
         *        => 동적 바인딩 
         *           생성자에 따라서 메소드 주소값이 변경
         *           생성자에 따라서 메소드 변경 , 변수는 변경이 안된다  
         *       ------------------------ 메소드는 생성자 타입 
         */
	}

}