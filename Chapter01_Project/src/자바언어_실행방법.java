/*
 *  2page 
 *  자바 언어의 특징 
 *  -------------
 *    1) 실행방법 
 *       = 컴파일 방식  ==> 2진파일로 변경 (컴퓨터가 인식하는 언어)
 *                       C/C++...,Java
 *                       기계어 
 *           *** 자바의 특징 
 *               컴파일 
 *                 C/C++ => 컴파일시 운영체제마다 다른 컴파일을 한다
 *                       => 컴파일된 내용이 다르다 
 *                 Java => 운영체제마다 동일  
 *                 => 컴파일된 파일 : 바이너리 코드 
 *                                ------------
 *                                 One Write
 *       = 인터프리터 방식 ==> 한줄씩 번역해서 실행 
 *                 HTML / CSS 
 *       = 보안 => 두번을 검색하기 때문에 (소스 검증)
 *         => 보안의 뛰어나다 : => 인증 시스템 
 *         => 동원 증권 : 자바 => 시스템 구축 
 *         
 *                  자바소스 
 *                    |
 *                   JVM => 파일 (dll)
 *                    |
 *              -------------- 
 *              |     |      |
 *            리눅스   윈도우  MAC
 *        = 실행과정 
 *                 기계어로 변경 (javac)      한줄씩 번역(java)
 *        A.java =============== A.class ============> Hello Java
 *        프로그래머 코딩     |      바이너리 코드     |
 *                       컴파일                인터프리터
 *        => 편집기 : 이클립스 , 인텔리J(파이참)
 *                  --------------- 어시스트
 *                    |
 *                   javac+javac => ctrl+f11
 *           -------------------------
 *                      |
 *           자바 파일 목록|
 *                      |   소스 코딩 
 *                      |
 *           -------------------------
 *              OUTPUT : 화면 출력 
 *           -------------------------
 *           다운로드 : eclipse.org => J2EE
 *       6page : 개발환경 구축 
 *               JDK => 17 (이상 버전은 한글 제어에 문제)
 *               https://jdk.java.net
 *               --> 스프링 (14)
 *                   스프링 (STS => 3 , STS => 4 : Boot)
 *                         FrameWork+Boot
 *        => JDK 환경 설정 
 *           -----------
 *           path : c:\jdk-17.0.2\bin
 *           classpath :  .;c:\jdk-17.0.2\lib
 *        => 11page 
 *           이클립스로 파일 생성 
 *           => 프로젝트 폴더 만들기 
 *           => src => 자바파일 생성 
 *                     ------ class파일 생성 
 *           => 주의점 
 *              파일명과 클래스명이 반드시 동일해야 사용이 가능
 *              대소문자를 구분한다 
 *              => 언어 (대소문자를 구분한다) 
 *              
 *              문법사항은 아니고 약속
 *           => 클래스명은 첫자를 대문자 , 새로운 단어 결합 첫자를 대문자 
 *              ----------------------------- 헝거리언식 표현법
 *           => 변수 , 메소드 => 소문자 
 *              상수 => 전체를 대문자 
 *           => {} 일치 
 *           => 명령어 종료시 ;
 *              
 *           => 모든 자바파일은 main이 있어야 실행이 가능 
 *           
 *           => 주석 (번역이 안되는 코드)
 *              // 한줄 주석    
 *           => ctrl+shift+/ 주석 
 *           => ctrl+shift+\ 주석을 풀때 
 *           => 화면 출력 
 *              sysout => ctrl+space 
 *                        -----------
 *                        
 *           자바의 구성도 
 *           class A  ==> 클래스 시작 
 *           {
 *              public static void main(String[] arg) => 메인 시작
 *              {
 *                 System.out.println("Hello"); 화면 출력 
 *              } => 메인 종료
 *           } 클래스 종료
 */
public class 자바언어_실행방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
	}

}
