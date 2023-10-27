package com.sist.lib;
import java.util.*;
// 중복데이터 제거
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names={
        	"홍길동","심청이","박문수","이순신","강감찬",
        	"춘향이","이산","홍길동","심청이","박문수"
        };
        // 배열을 컬렉션으로 변경 
        List<String> list=Arrays.asList(names);
        // 출력
        for(String name:list)
        {
        	System.out.println(name);
        }
        // 중복 제거 
        Set<String> set=new HashSet();
        set.addAll(list);// 데이터값을 저장 addAll()
        // 중복된 데이터는 set에 저장되지 않는다 => 중복 제거
        System.out.println("===========");
        for(String name:set)
        {
        	System.out.println(name);
        }
        System.out.println("===========");
        //list.clear();
        List<String> list2=new ArrayList<String>();
        list2.addAll(set);
        for(String name:list2)
        {
        	System.out.println(name);
        }
	}

}