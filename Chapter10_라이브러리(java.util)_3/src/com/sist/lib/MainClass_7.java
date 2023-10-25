package com.sist.lib;
/*
 *  List => add,remove,set,size,getmisEmpty
 *  => List가 여러개 있는 경우 (JOIN)
 *   containsAll : 두 개 List가 있는 경우 중복된 데이터를 모아서 관리 
 *   retainAll : 두 개 List에서 중복된 데이터만 남긴다
 *   ---------- 장바구니 => 중복 구매
 *  *** addAll : 데이터 전체를 복사
 *  *** subList : 부분적 데이터 복사
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			list.add(r.nextInt(100)+1);
		}
		System.out.println("==========================");
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n==========================");
		// 부분적으로 데이터 추출 : subList
		
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 4));
		// end-1  0123
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		for (int i:list2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n==========================");
		
		// 정렬 
		Collections.sort(list);
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n==========================");
		
		// 같은 데이터 추출
		System.out.println(list.retainAll(list2));
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		// 전체 복사
		System.out.println("\n==========================");
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list);
		for(int i:list3)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
