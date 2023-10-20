package com.sist.main;
/*
 *   7장 정리
 *   ------ JSP, Spring, Spring-Boot => 기본 자바
 *          => HTML/CSS/JavaScript
 *          => 데이터 저장 => 오라클/MySQL
 *          ------------------------- 데이터 분석(파이썬)
 *          
 *   *** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어 ***
 *   interface I
 *   {
 *       void aaa();
 *       void bbb();
 *       void ccc();
 *       void default ddd();
 *       void default eee();
 *       void default kkk();
 *   }
 *   class A implements I
 *   {
 *       void aaa(){}
 *       void bbb(){}
 *       void ccc(){}
 *       void ddd(){}
 *   }
 *   class B implements I
 *   {
 *       void aaa(){}
 *       void bbb(){}
 *       void ccc(){}
 *       void eee(){}
 *   }
 *   class C implements I
 *   {
 *       void aaa(){}
 *       void bbb(){}
 *       void ccc(){}
 *       void kkk(){}
 *   }
 *   인터페이스로 관리할 수 없음
 *   I i=new A() => i를 가지고 A가 가지고 있는 메소드를 제어
 *   I i=new B() => i를 가지고 B가 가지고 있는 메소드를 제어
 *   I i=new C() => i를 가지고 C가 가지고 있는 메소드를 제어
 *   
 *   ===> A, B, C가 유형이 같은 경우 한 개의 이름으로 제어
 *        목적 => 서로 다른 클래스를 묶어서 관리
 *            => 관리(소스 코딩이 간결)
 *            => 인터페이스 메소드
 *            ex)
 *                        DriverManager
 *                             |
 *           --------------------------------------   
 *           오라클 MySQL MSSQL DB2 SQLITE 사이베이스...
 *           VARCHAR2  VARCHAR
 *           CLOB      TEXT
 *           NUMBER    INT/DOUBLE
 *           => SQL => ANSI(표준화)
 *           
 *                              컬렉션(CRUD)
 *                           Collection
 *                               |
 *                       ------------------
 *                       |
 *                      List
 *                       |
 *                   ---------------------------------
 *                   |       |        |        |     |
 *               ArrayList Vector LinkedList Stack Queue
 *   
 *   1) 인터페이스 VS 추상클래스
 *      -----------------------------------------------------------
 *                    인터페이스                          추상클래스
 *      -----------------------------------------------------------
 *       구현메소드   선언된 메소드                   선언된 메소드/구현 메소드
 *               public void display();
 *               1.8)
 *                 구현된 메소드 사용
 *                 = default
 *                   (접근지정어가 아님)
 *                   public default void display2();
 *                 = static
 *                   => 접근 시 반드시 인터페이스명으로만 접근 가능
 *      -----------------------------------------------------------
 *       인스턴스 변수  사용할 수 없음                      사용 가능
 *                  => 공용                       private 변수 가능
 *                  => 상수형 변수만 사용 가능
 *                  => public(only)
 *                  => open jdk
 *                     jdk => 1.9(private 가능)
 *                      => C/C++ => exe
 *                      => 오라클에서 필요한 것(윈도우)
 *      -----------------------------------------------------------
 *       생성자         없음                               있음
 *      -----------------------------------------------------------
 *       접근 범위    모든 내용을 공개                        한정
 *                 => 메소드, 변수
 *      -----------------------------------------------------------
 *       상속       다중 상속                             단일 상속
 *                implements                           extends
 *                interface => interface
 *                        extends
 *                interface => class
 *                       implements
 *                => 사용자 정의, 라이브러리
 *                   => 단일 상속 중심
 *                => 윈도우: 여러 개 받는 경우 있음
 *      ------------------------------------------------------------
 *       *** 공통점: new를 이용해서 메모리 할당 불가
 *                 => 상속을 내려서 상속받은 클래스가 구현해서 사용
 *           목적: 서로 다른 클래스를 연결해서 사용 가능
 *      ------------------------------------------------------------
 *       인터페이스의 구성요소
 *       public interface interface명
 *       {
 *           -------------------------------
 *            상수: 반드시 초기값 설정(명시적으로 설정)
 *            (public static final) int a=10;
 *           -------------------------------
 *            구현이 안된 메소드: 프로그램에 맞게 구현
 *            => 개발자가 알아서 구현
 *            (public abstract) void display();
 *           -------------------------------
 *            구현이 된 메소드
 *            => 공통으로 사용되는 부분
 *               => 필요시 변경해서 사용
 *            (public) default void method(){}
 *                     ------- 접근지정어가 아니라 구현된 메소드
 *            (public) static void method(){}
 *            ==> 인터페이스명.메소드명()
 *           -------------------------------
 *       }
 *       -------------------------------------------------------------
 *        *** 기능 추가 시 default 사용
 */
import java.util.*;

interface I
{
	public static final int a = 0;
	// public은 생략하면 컴파일러에 의해 자동으로 public 추가
	public static void display()
	{
		System.out.println("I:display() Call");
	}
}
class A
{
	public static void aaa()
	{
		System.out.println("A:aaa() Call");
	}
}
class B extends A
{
	public void bbb()
	{
		aaa();
		A.aaa();
	}
}
class C implements I
{
	public void ccc()
	{
		// display(); 오류
		I.display(); // 인터페이스의 static 메소드는 반드시 인터페이스명으로만 접근 가능
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("aaa");
		list.add("bbb");
		
	}

}