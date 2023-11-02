package com.sist.exam;
/*
 * Thread 
 * -------- 모든 프로그램에 한 개 이상 존재
 *             ------ 프로세스
 *         = 프로그램 안에서 여러개의 프로그램을 동시에 수행
 *         => main => Thread
 *   => 서버에는 반드시 쓰레드를 필요로 한다
 *      --- 여러명이 접근시에 통신부분을 따로 수행
 *      --- 클라이언트 <==> 쓰레드 : 멀티쓰레드
 *      
 *   => 사용처 (사용자 정의 쓰레드)
 *      1. 데이터 수집
 *      2. 네트워크 서버 => 서버를 여러개 수행
 *      3. 게임 (비행기...) => 비행기 , 총알
 *      4. 웹 서버
 *         -------- 아파치 // IIS => 톰캣(테스트용 => 웹서버)
 *                                  => WAS
 *      5. 데이터베이스 서버 : 오라클 (서버)
 *      ---- 서버는 한 개 수행 (사용자 요청에 대한 처리 ==> 쓰레드)
 *      
 *   => 사용자 정의 쓰레드
 *      => 서버 개발자
 *      => 서버측 사이드 (서버에서 동작하게 코딩) => Back-End
 *      => 방법 1
 *         쓰레드 상속
 *         public class MyThread extends Thread
 *         {
 *             Thread 확장
 *             쓰레드가 동작
 *             public void run()
 *             {
 *               => 동작 => 한 가지 일만 수행할 수 있게 만든다
 *             }
 *         }
 *      => 방법 2
 *         => 동작 (확장 없이)
 *         인터페이스 구현 => 윈도우에 주로 사용
 *         public class MyThread implements Runnable
 *         {
 *            public void run()
 *            { 
 *               확장 없이 동작만 ...
 *            }
 *            
 *         }
 *         
 *      => 방법 3
 *         익명의 함수  ()=>run : 람다식 (메소드명 없이 사용 => 코딩이 간결)
 *         단점 : 재사용(객체 지향을 벗어난다)
 *         Runnable r=()->{
 *            구현 
 *         }
 *       => JavaScript
 *          function aaa(){}
 *           let aaa=()=> {} ===> 선호 (람다 (X)) , 화살표 함수)
 *    => 쓰레드의 생명주기 (생성~소멸)
 *      쓰레드 생성 =>java.lang
 *      ***** run()은 호출되지 않는다
 *            start(){run()}
 *      new Thread() ===> start() =========> run()
 *      쓰레드 생성 ===> 대기 (쓰레드 필요한 자원 확보) ==> 쓰레드 동작 ===> 일지정지
 *                                                | interrupt() sleep()
 *                                             쓰레드 종료
 *                                             
 *      => start() => run() 수행
 *      => sleep() => 일시정지
 *      => interrupt() => 쓰레드 소멸
 *      => 쓰레드는 시분할 프로그램
 *               ---- 나눠서 작업
 *      
 *      예) 1~10 => 출력
 *      
 *         => new Thread() => 1
 *            1) JVM
 *               => 이름 부여 => Thread-0 => 변경
 *               => 우선순위 => 사용자 정의 => 5
 *               1~10 => 5
 *               10 =>  main
 *               1 => gc
 *         => new Thread() => 1
 *         => new Thread() => 1
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
		}
	}
}
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.start();  //Thread-0
		t2.start();  //Thread-1
		t3.start();  //Thread-2
	}

}
