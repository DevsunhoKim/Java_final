package com.sist.exception;
/*
 *  다중 catch => 에러마다 따로 처리
 *   
 *  ==> 에러 코드 ==> 계층 구조 확인 => 크기 (순서)  
 *   try
 *   {
 *   }catch (Exception e)
 *   {
 *   }catch (NullPointerException e)
 *   {
 *   }catch (NumberFormatException e)
 *   
 *                  Throwble
 *                  --------
 *                      |
 *            ---------------------
 *            |                   |
 *           Error              Exception
 *                                |
 *                            ----------------
 *                            |              |
 *                          IOException     RuntimeException
 *                          SQLException     |
 *                                          NumberFormatException
 *                                          ...
 *     
 */
// 문자열을 입력 ==>  정수 변환 ==> 배열에 첨부 ==> 배열에 있는 값
import java.util.*; 
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		String s1=scan.next();
		// <input type=text>
		System.out.println("정수 입력 :");
		String s2=scan.next();
		
		try
		{
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
			
			
		}catch (NumberFormatException e)
		{
			System.out.println("정수 변환을 할 수 없습니다");
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 벗어났습니다");
		}catch (ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e)
		{
			System.out.println("기타 에러 발생 ...");
		}
		
		System.out.println("프로그램 종료!!");
		//RuntimeException , Throwable
		// SQLException
		
	}

}
