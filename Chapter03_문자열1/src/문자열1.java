/*
 *   문자열 
 *   문자 '' => 한글자 저장 => char
 *       'a','b','c'==> 한번 저장이 가능 String => ""
 *   일반데이터형
 *     String name="홍길동"; ==> 제어 
 *   클래스형 
 *     기능 => 메소드 
 *   => 웹은 데이터형이 존재하지 않는다 => 문자열 
 *   "1"
 *   <input type=text>
 *   
 *   "맛있는 샤브칼국수♡♡ 2번째 방문 가족모두 만족~ 저번보다 더 맛있었다 끝까지 완벽♡_♡ 간장소스가 고추덕에 이미 최애맛..뭘 찍어두 맛남. 고기도 부드럽고 야채도 좋음! 칼국수가 부드럽고 중간 쯤 육수도 얼큰하고 진함. 볶음밥은 살짝 태운 듯 고슬하게 먹으면 맛있음♡ 담에 또 올게유*_*"
 */
import java.util.Scanner;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 저장 
		String name="홍길동";
		System.out.println(name);
		char a='홍';
		char b='길';
		char c='동';
		System.out.println(a+""+b+""+c);
		String addr="서울특별시 마포구 어울마당로5길 18 팜파스빌딩 1F";
		System.out.println(addr);
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String findData=scan.next();
		System.out.println(findData);
	}

}





