package com.sist.io;
/*
 *  데이터 저장 ===== 데이터 가공 ===== 데이터 출력
 *  변수 : 한개       연산자          도스출력
 *  배열             제어문          윈도우***
 *  클래스           ---- 메소드     브라우저
 *  ---- 메모리
 *  파일 *** 
 *  => 업로드 , 다운로드 , Open API
 *  오라클 (RDBMS)
 *   = JDBC =DBCP = ORM
 *                  (라이브러리 : 바이바티스,JPA)
 *  --------------------------------------------
 *  사용자 정의 클래스
 *  + 라이브러리 
 *  ---------------------------------한개의 프로그램 완성
 *  라이브러리
 *  = java.lang  => Object,String,Math,Wrapper
 *                  **StringBuffer
 *  = java.util => Date,StringTokenizer
 *                 List , Map
 *                 ** Set , Calendar
 *  = java.io => File , FileInputStream,FileOutputStream
 *               FileReader , FileWriter
 *               => BufferdReader
 *               ** ObjectInputStream,ObjectOutputStream
 *  = java.net => URL / URLEncoder / Socket
 *  = java.sql => Connection , Statement , ResultSet
 *  *** java.text => DecimalFormat m SimpleDateFormat
 *  
 *  자바 => 2차 자바 : 브라우저 (Web)
 *     => 3차 자바 : Spring(핵심)  
 *  ----------------------------------------
 *  
 *  1) IO
 *    Input/Output => 입출력
 *    ------------
 *     = 메모리
 *     = 파일
 *     = 네트워크
 *     -----------> 클래스가 동일
 *    
 *    입출력 방식
 *    -------
 *    
 *    메모리 (데이터 저장) ====== 자바 응용프로그램 ========= 화면 출력
 *                     |                      |
 *                   InputStream           OutputStream
 *                     |                      |
 *                    일반파일(.zip,.png)       Writer
 *                     => 1byte => 바이트스트림  
 *                    문자저장(.txt,.dat)
 *                     => 2byte=> 문자스트림
 *                    ** 영어외의 다른 언어
 *                    => 한글자당 2byte
 *                       Reader
 *                    
 *    파일 , 네트워크 
 *  ----------------------------------------------------------
 *      *** 스트림은 데이터 이동 통로
 *          ----- 읽기 / 쓰기 => 단방향 통신 => 두개 프로그램 동시에 수행 (쓰레드)
 *          => 네트워크
 *          => 웹에서는 이미 서버가 만들어져 있다.
 *             => 기능 추가 (톰캣=자바엔진=테스트서버)
 *                       ---- 50명
 *      바이트 스트림 (1byte) => 업로드 , 다운로드 , 카페 ...
 *       InputStream        OutputStream
 *         |                        |
 *       **FileInputStream       **FileOutputStream
 *       FilterInputStream     FilterOutputStream
 *         |                        |
 *      ** BufferedInputStream   ** BufferedOutputStream
 *      => 메모리에 전체를 저장 (속도가 빠름)
 *       **ObjectInputStream      **ObjectOutputStream
 *      => 객체 단위 저장 (***)
 *    
 *     문자 스트림 (2byte) => 파일제어 (한글) => 파일읽기/쓰기
 *       Reader             Writer
 *        |                  |
 *       **FileReader        **FileWriter
 *        |                  |
 *      ** BufferedReader    BufferedWriter
 *   
 *   ***** 독립적인 클래스
 *        File : file , directory => 포함
 *        
 *   ***** 
 *     바이트 스트림 (1byte씩 송수신) => 자료실 (업로드 , 다운로드)
 *               => 갤러리게시판 , 후기게시판
 *     문자 스트림  (2byte씩 송수신) => 한글파일 읽기 , 한글 저장
 *               ** 한글은 1글자당 2byte => UTF-8
 *                  ------------------------- Git 언어 통일
 *     보조 스트림  읽는 속도,쓰는 속도를 빨리하기 위해 미리 메모리에 올려놓고 시작
 *              String / StringBuffer
 *           => Buffered ~
 *           => 전체를 메모리로 이동 => 메모리에 제어
 *      파일
 *       File => 정보
 *       파일 읽기 : FileInputStream / FileReader
 *        => String은 저장이 불가능
 *           => byte[] 로 변경해서 저장
 *       파일 쓰기 :FileOuetputStream / FileWriter
 *         => String 자체를 저장
 *       네트워크 
 *         => OutputStream (1byte)
 *         => BufferedReader (2byte로 변환후 수신)
 *      
 *     ==> 메소드 : read() , write(), close()
 *     ==> IO는 반드시 예외처리한다 (체크 예외처리)
 *     
 *     *** File => 일반 클래스
 *        
 *         => 파일의 정보 읽기 => 생성자를 이용
 *          => file
 *           new File("경로명\\파일명")
 *          => directory
 *       	 new File("경로명")
 *       
 *        => 주요 메소드
 *          1) 파일 특성
 *             = 읽기 전용 => boolean canRead()
 *             = 쓰기 전용 => boolean canWrite()
 *             = 숨김 파일 => boolean isHidden()
 *          2) 파일 정보
 *             = 파일명 :*** String getName()
 *             = 경로명 + 파일명 :*** String getPath()
 *             = 경로명 : String getParent()
 *             = 파일 크기 : *** long length()
 *             = 수정일 : long lastModified()
 *          3) 파일 종류
 *             = 파일 : boolean isFile()
 *             = 폴더 : boolean isDirectory()
 *          4) 파일 , 디렉토리 만들기
 *             = createNewFile() => 파일 만들 경우
 *             = *** mkdir()
 *          5) 삭제
 *             = *** delete() => 폴더 삭제시에 파일이 존재하면 삭제가 안됨
 *               rm 파일명 , rm -rf 
 *               => AWS (리눅스=명령어)
 *          6) 존재여부 확인 
 *             = ***boolean exists()
 *          7) 폴더에 있는 모든 파일 읽기
 *             = ***File[] listFiles()   
 *          8) 파일 크기
 *             Byte => KB => MB 
 *                   ----
 *                   파일크기/1024 => (파일크기/1024)/1024
 *          
 *             
 *        
 */
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("c:\\javaDev");
		
		File[] list=dir.listFiles();
		//출력
		for(File f:list)
		{
			if(f.isFile())
			{
				System.out.println(f.getName()+"file");
			}
			else 
			{
				System.out.println(f.getName()+"directory");
			}
		}
	}

}
