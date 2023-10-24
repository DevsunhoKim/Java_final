package com.sist.lib;
/*
 *  1. java.util
 *   => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *   => 반드시 import 를 사용한다
 *    1) 날짜 
 *       Date/Calendar ==> Date 에 없는 기능 확장 Calendar
 *            --------- 예약
 *    2) 문자열 분해
 *       StringTokenizer
 *    3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *       ------- 컬렉션 (*****)
 *               ----- 가변형 (크기를 결정하지 않는다)
 *       표준화 (모든 개발자가 동일하게 사용)
 *       => CRUD => 읽기 / 쓰기 / 수정 / 삭제
 *       Collection => interface
 *           |
 *   -------------------------------------
 *   |               |                   |
 *   List           Set                 Map ==> 인터페이스
 *                                      = 순서를 가지고 있지 않다 
 *                                      = 키.값으로 저장
 *                                      = 데이터 중복 허용
 *                                      = 키는 중복할 수 없다
 *                                      = 클래스 관리 (스프링)
 *                  = 순서를 가지고 있지 않다
 *                  = 데이터 중복을 허용하지 않는다
 *   = 데이터의 중복허용
 *   = 순서를 가지고 있다(index)
 *   = 데이터베이스 사용시에 주로사용(***)
 *   
 *   List
 *   ----
 *    | List 를 구현한 클래스
 *    ----------------------------------------
 *    |                 |                    |
 *  **ArrayList      Vector               LinkdeList
 *                                           |
 *                                          Queue
 *    
 *    ArrayList : 오라클에 있는 데이터를 저장해서 제어
 *                ------------------------
 *                      |
 *                     브라우저 전송
 *                  => 데이터베이스 관련 => 비동기 방식
 *   
 *    Vector : 동기 방식 => 네트워크 (사용자 정보 => IP,PORT)
 *     **** Vector 의 단점을 보완한 것이 ArrayList
 *     
 *    LinkedList : C호환 => 수정 , 삭제 , 추가 
 *    
 *     *** 매소드가 동일 
 *                                          
 *    Set
 *    ----
 *    | Set 을 구현하는 클래스
 *    ----------------------------
 *    |                          |
 *    HashSet                  TreeSet
 *    
 *    
 *    Map
 *    ----
 *    | Map 을 구현하는 클래스
 *    -------------------------------
 *    |                             |
 *    HashMap                      HashTable
 *    
 *    Random : 난수 발생
 *    
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		for(Object name:list)
		{
			System.out.println(name);
		}
	}

}
