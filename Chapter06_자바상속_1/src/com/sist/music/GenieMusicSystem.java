package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * GenieMusicSystem
 *       |
 * MelonMusicSystem
 * 
 * => 접근지정어
 *    -------
 *    default => 패키지가 동일
 *    private => getter/setter => 접근이 가능
 *    protected => 패키지가 동일 / 상속을 받는 경우 패키지가 다를 수 있다
 *    public => 공개
 *    
 *    기본 => 모든 데이터는 은닉화
 */

public class GenieMusicSystem {
	protected Music[] musics=new Music[50];// 제어문 불가능
	protected String title="지니뮤직 Top50";
	
	// => 생성자 , 초기화 블록 
	// 인스턴스 초기화 블록 사용
	{
		//외부에서 데이터를 읽어온다 => 값을 초기화 시킨다 => 명시적초기화 X
		//---- 크롤링 , 파일 읽기 , 오라클 => 구현
		/*
		 * 초기화 블록
		 * => 인스턴스 블록 {} => 인스턴스 변수,static 변수 사용
		 * => static 블록 static{} : static 변수만 초기화
		 * => ------------------- 자동 인식 (호출하는 것이 아니다)
		 * => 상속의 예외 조건
		 * try ~ catch => 프로그램의 비정상 종료 방지
		 *             => 에러를 사전에 방지
		 * 
		 * try
		 * {
		 *  // 정상적으로 수행하는 문장
		 *  // 지금까지 코딩했던 모든 문장
		 * }catch (Exception ex){에러시 처리}
		 * => 에러를 무시하고 다음 문장을 수행한다
		 * network , 파일 , Oracle 연동 ==> 예외처리를 반드시 한다
		 * => 수정이 가능한 에러만 가능하다
		 *    메모리 부족 (X)
		 *    
		 *    에러 / 예외처리 
		 */
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// HTML을 저장하는 공간 , HTML 읽어서 데이터를 추출 (크롤링)
			// 데이터 저장 => HTML,JSON,XML => 데이터 추출 방식이 다르다
			/*
			 * HTML => tag/attribute  <>  </> <a/> => Markup Language
			 * 		   <a class="aaa">   </a>
			 *        ---                ----
			 *   태그를 읽는 방법
			 *   Element => tag
			 *   같은 태그를 여러개를 읽는 경우
			 *   Elements
			 *   
			 *   
			 *   ==> 구분자
			 *   	id==> 태그명#ID명 => 중복이 없는 경우
			 *     class==>태그명.클래스명 => 중복이 있는 경우
			 *   <table id="aaa"> ==> table#aaa
			 *   <table class="bbb> ==> table.bbb
			 *   
			 *   String[] arr={"aaa","bbb","ccc","ddd"};
			 *   arr[i]
			 */
			Elements
		}catch (Exception ex) {}
	}
	
	
}
