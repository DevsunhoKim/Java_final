package com.sist.lib;
// => 메소드 340p
// => 검색 => 
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		// 정수만 메모리에 저장해서 관리
		/*
		 * Wrapper => 기본형을 클래스형으로
		 *              => 기능을 부여
		 *              => 제네릭을 사용할 수 있게 만듦
		 *   => 장점은 Wrapper 클래스와 기본형 호환
		 *   Integer => 10,20,30...
		 *   Integer i=10; ==> int Interger 모두 사용가능
		 *   
		 */
		//추가 => add()
		//list.add(Integer.valueOf(10));
		list.add(10);  // 0
		list.add(20);  // 1
		list.add(30);  // 2
		list.add(40);  // 3
		list.add(50);  // 4
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		System.out.println("=================");
		list.add(3,60);
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		System.out.println("=================");
		
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환 필요 없음
			System.out.println(i+":"+val);
		}
		// 인덱스 번호는 0부터 시작 ==> list.size() 갯수
		// 인덱스 초과하면 오류발생
		// for
		System.out.println("=================");
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("=================");
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재여부:"+list.isEmpty());
		// 데이터가 없는가? ==> false (데이터 있음) / true (데이터 없음)
		System.out.println("=================");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재여부:"+list.isEmpty());
	}

}
