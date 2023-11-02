package com.sist.exam;

public class MainClass_4 /*implements Runnable*/ {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Runnable r=()->
		{
			System.out.println("run call...");
		};
		Thread t=new Thread(r);
		t.start();
		*
		*
		*/
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run Call...");
			}
		};
		Thread t=new Thread(r);
		t.start();
		/*
		 * functuon aaa(){} => implements
		 * let aaa=function(){}
		 * let aaa=()=>{}
		 * 
		 * 메소드는 메소드명이 주소
		 */
	}

	

}
