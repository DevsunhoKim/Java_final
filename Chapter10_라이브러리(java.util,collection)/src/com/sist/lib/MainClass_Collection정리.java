package com.sist.lib;
/*
 * 컬렉션 프레임워크
 *   => 균집 => (다수의 데이터)를 쉽게 관리할 수 있게 만든 라이브러리
 *                            ----
 *                          데이터 관리 : 추가 , 수정 , 삭제 , 읽기
 *                          -------- 파일 , 오라클 
 *                                   ---- -----
 *                                   | select(읽기),
 *                                     insert(추가),
 *                                     update(수정)
 *                                     delete(삭제)
 *                             | read(),write(),delete()
 *                    1. 읽기 => file은 한 줄씩 => 구분자
 *                    2. 오라클 => 원하는 데이터만 가지고 올 수 있다
 *   => 동적 메모리 할당(자동으로 크기가 변경) => 크기 지정하지 않는다
 *                 ----------- 가변형 (메모리 누수방지)
 *   => 자동으로 인덱스 번호 관리 
 *   
 *  => 컬렉션의 종류
 *    List : ArrayList
 *     => 순서가 지정
 *     => 중복을 허용
 *     => 주요 메소드
 *        1) 추가 : add(object)
 *        2) 삭제 : remove(int index)
 *        3) 수정 : set(int index,Object)
 *        4) 읽기 : get(int index,Object)
 *        5) 비어있는지 확인 : isEmpty*(
 *        6) 전체삭제 : claer()
 *        7) 저장된 갯수: size()
 *        8) 두개의 List가 있는 경우
 *          => 교집합 => retainAll()
 *          => 합집합 => addAll()
 *          => 차집합 => removeAll()
 *     *** Arrays.asList() => 배열 => ArrayList로 변경    
 *      
 *    Set : HashSet
 *     => 순서가 없다
 *     => 중복을 허용하지 않는다
 *     ** null 값을 추가할 수 있다 (한 번만 가능)
 *     => 장르별 , 부서별 , 상품별 ....
 *     => List에서 중복데이터를 제거할 때
 *     => 주요 메소드
 *        1) 추가 : add()
 *        2) 삭제 : remove(Object)
 *        3) 존재여부 : isEmpty()
 *        4) = 일반 for 문 사용 불가 => for~each 구문만 사용
 *        5) 갯수 : size()
 *        
 *    Map : HashMap
 *     = 두 개를 동시에 저장 (key,value)
 *     = 도서 , 클래스 관리 , 데이터 전송 관리 ,SQL 관리
 *     = 저장 : put
 *     = 읽기 : get
 *     = 저장된 키 읽기 : keySet
 *     = 저장된 값 읽기 : value
 *     = 크기 : size
 *     ---------------------clear()
 *     
 *     *** 전체를 한 곳에 모아서 출력 / 관리 ==> iterator
 *     
 *     제네릭 :
 *      프로그램 : 데이터 관리 
 *              --------
 *               데이터 저정 방법 : 변수 , 배열 , 클래스 , 컬렉션 , 파일 , 데이터베이스
 *               | => 데이터형을 통일
 *               | => 이미 만들어진 클래스(데이터형) 
 *                     ------------ 라이브러리
 *                     | 라이브러리=> 지정하는 리턴형 매개변수의 데이터형을 변경하고 싶을 때
 *                               => 프로그램 개발시 마다 형변환
 *                               => 필요시마다 데이터형을 변경
 *                               => 보완 => 제네릭
 *                               => 라이브러리에 있는 데이터형을 프로그램에 맞게 사용
 *     사용법  <> => 클래스<데이터형> => 리턴형 / 매개변수 변경
 *    => 단점 : 기본형은 사용이 불가 => Wrapper 클래스로 변환해서 사용
 *    int , long , double , boolean
 *    Integer Long Double Boolean
 *    => 호환성이 좋다 => 기본형과 동일하게 사용
 *    
 *    Properties
 *     자바에서 => 제어 파일명 : .txt , .properties
 *                        .xml
 *                        .csv ==> R -> 데이터베이서의 백업
 *                        .json
 *                       -------- 각 업체에서 라이브러리 제공
 *                             
 */
import java.io.*;
import java.util.*;
public class MainClass_Collection정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("C:\\Users\\ksssk\\git\\Java_final\\Chapter10_라이브러리(java.util,collection)\\src\\com\\sist\\lib\\sutudent.properties"));
		String name=prop.getProperty("name");
		String phone=prop.getProperty("phone");
		String adrr=prop.getProperty("address");
		System.out.println(name +" "+phone+" "+adrr);
		Properties props=System.getProperties();
		System.out.println(props.getProperty("java.version"));
		System.out.println(props.getProperty("user.language"));
		
		
		
		}catch(Exception ex) {}
	}

}
