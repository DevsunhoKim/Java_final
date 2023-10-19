package com.sist.main;

import java.awt.List;

/*
 *  7장 정리
 *  --------  JSP , Spring , Spring Boot => 기본 자바
 *            => HTML/CSS/JavaScript
 *            => 데이터 저장 => 오라클 / MySQL
 *               ------------------------ 데이터 분석 (Python)
 *   ***인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 *               ----- 강제화
 *               
 *     interface I
 *     {
 *     	 void aaa()
 *       void bbb()
 *       void ccc()
 *       de
 *     }
 *     class A implements I
 *     {
 *     	 void aaa()
 *       void bbb()
 *       void ccc()
 *       void ddd()
 *     }
 *     class B implements I
 *     {
 *       void aaa()
 *       void bbb()
 *       void ccc()
 *       void eee()
 *     }
 *     class C implements I
 *     {
 *       void aaa()
 *       void bbb()
 *       void ccc()
 *       void kkk()
 *     }
 *      인터페이스로 관리할 수 없다 ==>
 *     I i=new A() => i를 가지고 A가 가지고 있는 메소드를 제어
 *      => 접근할 수 없는 메소드
 *     I i=new B() => i를 가지고 B가 가지고 있는 메소드를 제어
 *     I i=new C() => i를 가지고 C가 가지고 있는 메소드를 제어
 *     
 *     ===> A,B,C 가 유형이 같은 경우 한개의 이름으로 제어
 *        목적 => 서로 다른 클래스를 묶어서 관리
 *              ------------ 관련
 *              => 관리 (소스 코딩이 간결)
 *              => 인터페이스의 메소드
 *              예) 
 *                           DriverManager
 *                                |
 *                 -------------------------------------
 *                 |     |       |    |    |      |    |               
 *                 오라클 ,MySQL,MSSQL, DB2,SQLITE 사이베이스 ...
 *                 VARCHAR VARCHAR2
 *                 CLOB     TEXT
 *                 NUMBER   INT / DOUBLE
 *                 => SQL => ANSI(표준화)
 *     			컬렉션 (CRUD)
 *            Collection
 *               |
 *          ------------------
 *          |
 *        List
 *          |
 *        ----------------------------------
 *        |       |           |       |     |
 *      ArrayList Vector LinkedList Stack Queue
 *    
 *    1) 인터페이스 vs 추상클래스
 *      ---------------------------------------------------------
 *                   인터페이스                 추상클래스
 *      ---------------------------------------------------------
 *      구현메소드     선언된 메소드              선언된 메소드/구현 메소드
 *               1.8)
 *                구현된 메소드 사용
 *                = default
 *                (접근지정어가 아니다)
 *        public default void aaa();
 *                =static
 *                 =>접근시에 반드시 인터페이스명으로만
 *                   접근이 가능
 *      ---------------------------------------------------------
 *      인스턴스변수    사용할 수 없음                사용이 가능
 *                  => 공용                   private 벼수 가능
 *                  => 상수형 변수만 사용이가능
 *                  => public (only)
 *                  => openjdk
 *                     jdk => 1.9(private 가능)
 *                    => C/C++ => exe
 *                    => 오라클에서 필요한 것(윈도우)                 
 *      ---------------------------------------------------------
 *      생성자        생성자가 없다(메모리 할당불가)           생성자가 있다
 *      ---------------------------------------------------------
 *      접근범위       모든 내용을 공개                  한정한다 (모든 접근지정어 사용)
 *                => 메소드 ,변수
 *      ---------------------------------------------------------
 *      상속          다중 상속                        단일 상속
 *                  implements                    extends
 *                     |
 *                  interface => class
 *                            |
 *                          implements
 *                  => 사용자 정의 라이브러리
 *                    => 단일 상속이 중심이다
 *                  => 윈도우 : 여러개 받는 경우가 있다
 *                  interface => interface
 *                            |
 *                            extends
 *     -----------------------------------------------------------
 *     *** 공통점 : new를 이용해서 메모리 할당이 불가능하다
 *               => 상속을 내려서 상속받은 클래스가 구현해서 사용
 *    
 *     *** 목적 : 서로 다른 클래스를 연결해서 사용이 가능
 *              관련된 클래스를 모아서 사용할 때 주로 사용
 *     
 *     *** 실생활
 *        ==>110V ==> 220V => 어댑터
 *        => 컴퓨터 : 마우스 ,키보드
 *           업체가 여러개
 *           --------
 *           MS => 인터페이스 전송
 *      ------------------------------------------------------------
 *      인터페이스 구성요소
 *      public interface interface명
 *      {
 *       -------------------------------
 *       상수 : 반드시 초기값 설정 (명시적으로 설정)
 *       int a=10;
 *             --
 *       -------------------------------
 *        구현이 안된 메소드 : 프로그램에 맞게 구현
 *        개발자가 알아서 구현
 *        (public abstract) void method();
 *       -------------------------------
 *        구현이 된 메소드
 *        => 공통으로 사용되는 부분
 *          => 필요시 마다 변경해서 사용
 *          (public) default void method() {}
 *                   -------- 접근지정어가 아니라 구현된 메소드
 *          (public) static void method() {}
 *          ====> 인터페이스명.메소드명()
 *                ------------------
 *       -------------------------------
 *      }
 *        *** 기능추가가 있는 경우에는 default를 사용한다
 *                            ----------  
 *                   
 */
interface I
{
	public static void display()
	{
		System.out.println("I : display() call...");
	}
}
class A
{
	public static void aaa()
	{
		System.out.println("A : aaa() call...");
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
 // 구현(상속) ==> class (단일상속) , interface (다중상속)
{
	public void ccc()
	{
		// display(); ==> 오류
		I.display(); //인터페이스의 static메소드 => 인터페이스 명으로만 접근
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
