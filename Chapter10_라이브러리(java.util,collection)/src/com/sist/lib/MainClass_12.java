package com.sist.lib;
import java.util.*;
public class MainClass_12 {
	// 제네릭 => 매개변수 설정
	public static void display1(ArrayList<Integer> list)
	{
		for(int i:list)
			System.out.print(i+" ");
	}
	public static void display2(ArrayList<Double> list)
	{
		for(double d:list)
			System.out.print(d+" ");
	}
	public static void display3(ArrayList<String> list)
	{
		for(String s:list)
			System.out.print(s+" ");
	}
	public static void display4(ArrayList<?> list)
	{
		for(Object s:list)
		{
			System.out.println(s+" ");
		}
	}
	// display(double d) ==> display(10)
	//ArrayLsit<String> list=new ArrayList<String>();
	// display5(list); ==> Object
	public static void display5(ArrayList list)
	{
		for(Object s:list)
			System.out.println(s+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		display1(list);
		
		ArrayList<Double> list1 =new ArrayList<Double>();
		list1.add(10.0);
		list1.add(20.0);
		list1.add(30.0);
		list1.add(40.0);
		list1.add(50.0);
		
		display2(list1);
		
		ArrayList<String> list2 =new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		display3(list2);
		
		
	}

}
