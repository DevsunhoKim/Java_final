/*
 * 프로그램 
 * 벤치마킹 ===> 요구사항 분석 ===> 데이터 저장 ===> 구현
 * -----
 *  사이트 한페이지 클래스 ==> new ===> method
 *  ---
 *   |
 *  상세보기 ----------------- new --------- 동작 (메뉴,버튼 ...)
 *  클래스
 *  ----
 *  명사적 특징 : 멤버변수
 *  동사적 특징 : 메소드
 *  -------------------- + 실제 클래스
 *  
 *  예) 학생
 *     학교이름 , 전공 , 학년 , 성별 , 이름 ... : 멤버변수
 *     수업을 듣는다 , 시험을 본다 , 게임을 한다 , 걷는다 : 메소드
 *     
 *  객체 => 현실세계/비현실세계를 특성화 한 것
 *                      ---- 공통적인 내용을 포함
 *                           --------
 *                           추상화 => 단순화
 *                           
 *   형식
 *   class ClassName
 *   {
 *   	----------------------
 *   	멤버변수 => 클래스 전체 사용 (전역변수)
 *   		   new를 이용할 때 따로 생성되는 변수 : 객체변수 , 인스턴스 ,객체
 *   		   ---
 *   		   컴파일 시에 자동으로 생성되는 변수 : 공유변수 , 정적변수
 *   		   --------------------- static
 *   		     => 메모리 공간이 1개만 생긴다
 *    	----------------------
 *    	생성자 => 필요시마다 사용
 *      ----------------------
 *      메소드 
 *      ----------------------
 *       => 기본형식
 *       => 순서는 상관 없다
 *   
 *   
 *   
 *   
 *   
 *   }
 */
// 클래스 설계
class Recipe
{
	String poster;
	String title;
	String chef;
	int score;
	String hit;
	int showUser;
	/*
	 *  String => null (주소를 가지고 있지 않은 상태)
	 *  int => 0 
	 *  double => 0.0
	 *  boolean => false
	 *  char => '\0'
	 */
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r1= new Recipe();
		/*
		System.out.println(r1.chef);
		System.out.println(r1.showUser);
		*/
		
		r1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2022/07/31/d804978cda6e3c8b4e3a94a1c19696041_m.jpg";
		r1.title="도시락 반찬으로 최고! 스팸감자조림♡";
		r1.chef="냠냠간단요리";
		r1.score=5;
		r1.hit="1.5";
		r1.showUser=10;
		
		System.out.println("=========레시피 정보=========");
		System.out.println("Poster:"+r1.poster);
		System.out.println("Title:"+r1.title);
		System.out.println("Chef:"+r1.chef);
		System.out.println("Score:"+r1.score);
		System.out.println("Hit:"+r1.hit);
		System.out.println("Show User:"+r1.showUser);
		System.out.println("평점: ★★★★★");
		
		
		Recipe r2= new Recipe();
		
		r2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2023/10/04/5461e570361e2a662f7ea5abb73e96c01_m.jpg";
		r2.title="새송이버섯소고기볶음 끼니마다 가족들이 이것만 찾아요~ ‼️";
		r2.chef="즐거운날랄라";
		r2.score=5;
		r2.hit="1297";
		r2.showUser=1;
		
		System.out.println("=========레시피 정보=========");
		System.out.println("Poster:"+r2.poster);
		System.out.println("Title:"+r2.title);
		System.out.println("Chef:"+r2.chef);
		System.out.println("Score:"+r2.score);
		System.out.println("Hit:"+r2.hit);
		System.out.println("Show User:"+r2.showUser);
		System.out.println("평점: ★★★★★");
		
	}

}
