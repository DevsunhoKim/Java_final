// 산술연산자 
// 변수의 재사용 
/*
 *   1. 변수 선언 
 *      데이터형 변수명;  => 선언과 동시에 초기화
 *      int a;            int a=20;(****) => 명시적인 초기화
 *   2. 초기값
 *      a=20;
 *   3. 값을 변경 
 *      a=100;
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a;   
		   int b;   
		   a=3;   
		   b=a+5;
		 //  ---- 3+5
		 // --
		   System.out.println("a의 값:"+ a);   
		   System.out.println("b의 값:"+b);   

	}

}
