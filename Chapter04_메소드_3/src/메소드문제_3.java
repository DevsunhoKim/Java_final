/*
 * 1. 국어 영어 수학 점수 입력 => 총점 / 평균 
 * 
 * 점수 입력 , 총점 ,   , 출력
 */

import java.util.Scanner;
public class 메소드문제_3 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+"점수 입력 :");
		int num=scan.nextInt();
		return num;
		
		
	}
	
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static void print(int kor,int eng,int math,int total,double avg)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",kor,eng,math,total,avg);
	}
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor, eng, math);
		double avg=avg(total);
		print(kor, eng, math, total, avg);
		
	}
	static char score(int avg)
	{
		char c='A';
		switch(avg)
		{
		case 10:
		case 9:
			c='A';
		case 8:
			c='B';
		case 7:
			c='C';
		case 6:
			c='D';
		default:
			c='F';
		
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}	

}
