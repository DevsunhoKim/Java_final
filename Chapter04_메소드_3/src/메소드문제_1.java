/*
 *  정수 한개를 입력 받아서 => 짝수/홀수 => 출력
 */

import java.util.Scanner;
public class 메소드문제_1 {
	
	
	
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
		if(a%2==0)
			res=a+"는()은 짝수입니다";
		else
			res=a+"는()은 홀수입니다";
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
		
		process();
		// TODO Auto-generated method stub
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		
		String res="";
		if(a%2==0)
			res=a+"는()은 짝수입니다";
		else
			res=a+"는()은 홀수입니다";
		
		System.out.println(res);
		*/
			
		
	}

}
