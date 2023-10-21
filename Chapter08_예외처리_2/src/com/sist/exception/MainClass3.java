package com.sist.exception;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택적인 부분 ==> 오류 발생 시 제외
		//try
		//{
			for(int i=1;i<=10;i++)
			{
				try
				{
				int j=(int)(Math.random()*3);
				System.out.println("j=" + j);
				System.out.println("i=" + i + ", i/j=" + (i/j));
				// 제외 => continue;
				}catch(Exception ex) {}
			}
		//}catch(Exception ex) {}
	}

}