/*
 *   1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
        십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라
        결과)
             2자리수 정수 입력(10~99) >> 77 
             10의 자리와 1의 자리가 같습니다
        => 조건문 
        단일 조건문 / 선택조건문 / 다중조건문 => 형식 , 순서 
        -----------------------------
        연산자 => 어떤 연산자 => 결과값?
        ------- 비교연산자 , 논리연산자 , 부정연산자 
        단일조건문 
        -------
          if(조건문)  => 오류(예외처리) => 사전에 오류방지 , 값입력 유도 
          {
             조건이 true일때만 수행 
          }
          => 수행 => 건너뛴다 
        선택조건문 ==> 삼항연산자 
        -------
          if(조건문)
          {
             // 사용자  , 회원 => 마이페이지
             조건문이 true일때 수행 
          }
          else
          {
             // 관리자 , 게스트 => 관리자페이지
             조건문이 false일때 수행 
          }
          
         다중조건문 => 조건에 맞는 문장만 수행  ==> switch~case
         -------
          if(조건문)
          {
             조건이 true일때 => 수행 => 종료 
             false일때 밑에 조건문을 찾는다
             
          }
          else if(조건문)
          {
             조건이 true일때 => 수행 => 종료 
             false일때 밑에 조건문을 찾는다
          }
          else
          {
             해당 조건이 없는 경우에 처리 문장 
          }
          ==============================
          선택문 
          switch(정수,문자,문자열)
                         -----
          {
             case 값:
               처리문장 
               break;
             --
             --
             --
             default:
               처리문장 ==> 생략
          }

 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BufferedReader
        Scanner scan=new Scanner(System.in);
        // enter , space
        System.out.print("2자리수 정수 입력(10~99) >>");
        int num=scan.nextInt();
        if(num%11==0)
        {
        	System.out.println("10의 자리와 1의 자리가 같습니다");
        	
        }
        else
        {
        	System.out.println("10의 자리와 1의 자리가 다르다");
        }
	}

}
