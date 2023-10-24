package com.sist.lib;
import java.util.*;
/*
 *  Random => 임의의 수를 추출할 때 사용
 *            ------- JVM 에서
 *            => Math.ramdom() => double
 *  => int nextInt(int bound)
 *                     -----
 *                   100 => 0~99 +1
 *         nextInt(100)+1 ===> 1~100
 */
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z 까지 알파벳을 임의로 10개 출력
		Random r=new Random();
		/*
		for(int i=0;i<=10;i++)
		{
			char c=(char)(r.nextInt(26)+65);
			System.out.print(c+" ");
		}
		*/
		/*
		for(int i=1;i<=6;i++)
		{
			int lotto=r.nextInt(45)+1;
			System.out.print(lotto+" ");
		}
		*/
		int day=r.nextInt(7)+7; // 7~13
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			if(rr>=24)
			{
				System.out.println(rr+" ");
			}
			
		}
		
	}

}
