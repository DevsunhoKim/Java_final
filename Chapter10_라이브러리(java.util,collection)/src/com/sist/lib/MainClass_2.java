package com.sist.lib;
import java.util.*;
/*
 *   List 계열의 클래스 
 *        = 순서가 있다 (인덱스)
 *        = 데이터를 중복해서 저장 할 수 있다 
 *   ArrayList
 *    = 단방향 포인터(인덱스)를 가지고 있다 
 *      => 조회하기 편리하다 (성능이 좋다)
 *    = 검색이 빠르다 , 데이터 추가시에 뒤에 추가하면 속도가 빠르다 
 *    = 수정 , 중간에 추가 , 삭제가 느려지는 단점
 *      --------------------------------- 웹에서는 사용하지 않는다
 *    = 수정 , 삭제가 없는 프로그램에서 주로 이용 
 *      --------------------- 데이터베이스에서 주로 만들어진다 
 *      => 데이터를 모아서 전송(브라우저,윈도우)
 *   LinkedList
 *    = 양방향 포인터를 가지고 있다 
 *    = 수정 , 삭제 , 추가가 많은 경우에 주로 사용 
 *      => 윈도우 (애플리케이션) 
 *    = 단점 : 검색속도가 늦다
 *   Vector
 *    = 단방향 (ArrayList와 동일)
 *    = 동기 => 채팅 , 서버연결 , 사용자 정보를 저장 
 *      --- 비동기 : ArrayList는 Vector를 보완 
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> vec=new Vector<Integer>();
        /*
         *  List<String> list=new Vector<String>()
         *  List<String> list=new ArrayList<String>()
         *  List<String> list=new LinkedList<String>()
         */
        // 데이터 추가 ==> add(Object) => add(Integer)
        // Wrapper => 기본형과 동일하게 사용이 된다 
        // int i=10 , Integer i=10 => 오토박싱
        vec.add(Integer.valueOf(10));// => 0
        vec.add(20);// => 1
        vec.add(30);// => 2
        vec.add(40);// => 3
        vec.add(50);// => 4
        //vec.addElement(60);
        for(int i=0;i<vec.size();i++)
        {
        	int k=vec.get(i);//언박싱
        	// elementAt(index)
        	System.out.println(i+"=>"+k);
        }
        
        System.out.println("===== 삭제후 =====");
        // remove(int index) => 자동으로 인덱스 변경
        vec.remove(3); 
        // removeElementAt(index)
        
        for(int i=0;i<vec.size();i++)
        {
        	int k=vec.get(i);//언박싱
        	System.out.println(i+"=>"+k);
        }
        
        System.out.println("===== 수정후 =====");
        // set(index , 데이터)
        vec.set(2, 1000);
        
        for(int i=0;i<vec.size();i++)
        {
        	int k=vec.get(i);//언박싱
        	System.out.println(i+"=>"+k);
        }
        
        System.out.println("==== 데이터 갯수 확인 =====");
        System.out.println("총갯수:"+vec.size());
        System.out.println("==== 전체 삭제 ====");
        vec.clear();
        System.out.println("총갯수:"+vec.size());
        
        if(vec.isEmpty())
        {
        	System.out.println("접속자가 없습니다!!");
        }
        else
        {
        	System.out.println("접속자가 존재합니다");
        }
        
	}

}