package com.sist.exception;
class MyException extends Exception{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a=21;
		//catch 안에서는 인식하는 예외클래스는 라이브러리로 만들어진
		// 예외만 인식 => 직접 호출해야 사용이 가능
		// ==> 호출 : throw new 생성자("관련 메세지")
		if(a%3==0) 
		{
			throw new MyException(a+"는(은) 3의 배수를 사용할 수 없습니다");
		}
		// ==> 검색 (한글=>모음 , 문자열) => if
		}catch (MyException m) 
		{
			System.out.println(m.getMessage());
		}catch (Exception ex)
		{
			ex.printStackTrace(); //에러 위치가 확인 됨
			//System.out.println(m.getMessage()); => 에러 메세지만 전송
		}
	}

}
