package com.sist.main;
// 객체 대입
class Human
{
	int age;
	String name;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		// hong (age,name) => hong.age , hong.name
		hong.age=20; // 메모리에 저장
		hong.name="홍길동"; // => 쓰기 => setXxx
		
		// 변수(멤버변수,정적변수,지역변수,매개변수) => 읽기 / 쓰기 => getter / setter
		
		System.out.println(hong.age);  // 읽기 ==> getXxx
		System.out.println(hong.name);
		
		Human shim=hong;
		// 대입이 가능하다 ==> 메모리 주소를 대입 ==> 같은 메모리를 제어 
		
	}

}
