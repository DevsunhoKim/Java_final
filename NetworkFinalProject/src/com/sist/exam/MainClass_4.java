package com.sist.exam;

public class MainClass_4 /*implements Runnable*/{
	/*public void run()
	{
		System.out.println("run Call...");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainClass_4 m=new MainClass_4();
		//Thread t=new Thread(m);
		//t.start();

		/*Runnable r=()->{
			System.out.println("run Call...");
		};
		Thread t=new Thread(r);
		t.start();*/
	
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
		 *   function aaa(){} => implements
		 *   let aaa=function(){}
		 *   let aaa=()=>{} =>
		 *   메소드는 메소드명이 주소
		 */
	}

}