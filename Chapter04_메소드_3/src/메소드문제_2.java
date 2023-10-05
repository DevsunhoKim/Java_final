/*
 * 정수 1개 입력 => 3의 배수인지 확인
 */

import java.util.Scanner;
public class 메소드문제_2 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		int a=scan.nextInt();
		return a;
		
		
	}
	static String check(int a)
	{
		String res="";
		if(a%3==0)
			System.out.println("3의배수 입니다");
		else
			System.out.println("3의배수가 아닙니다");
		return res;
	}
	
	static void print(String res)
	{
		System.out.println(res);
	}
	
	static void process()
	{
		int a=userInput();
		String res=check(a);
		print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
