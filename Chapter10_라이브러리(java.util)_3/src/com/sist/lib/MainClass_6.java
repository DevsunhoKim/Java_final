package com.sist.lib;
import java.util.*;
/*
 *  ArrayList<클래스> 
 *           ------
 *           | 기본형 ==> Integer , String
 *            => 사용자 정의 클래스
 *            ArrayList<Music>
 *            ArrayList<Movie>
 *            AtrryList<Food> ..
 *            ------------------------ Object => 형변환
 */
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("=================");
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길수");
		names2.add("박문수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("성춘향");
		for(String name:names2)
		{
			System.out.println(name);
		}
		
		System.out.println("=================");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 다른 컬렉션에 있는 내용 복사
		for(String name:temp)
		{
			System.out.println(name);
		}
		
		System.out.println("=================");
		temp.retainAll(names2);// 같은 데이터를 추가 (교집합)
		for(String name:temp)
		{
			System.out.println(name);
		}
		// 오라클 에서는 JOIN / INTERSECT
		
		
		
		
		
	}

}
