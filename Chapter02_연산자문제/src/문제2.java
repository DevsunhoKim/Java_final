/*
 *   산술연산자 
 *   + , - , * , / , %
 *  ---         --- ---
 *   +
 *    => 덧셈 , 문자열 결합 
 *             "" => 문자열 
 *             => 웹 , 윈도우 (네트워크) => 데이터형이 없다 (문자열)
 *   /
 *    => 나눗셈 , 0으로 나눌 수 없다 , 정수/정수=정수
 *   %
 *    => 나머지 : 부호(왼쪽부호)
 *    
 *       -5%2  => -1
 *       -1-4/2
 *       5%2
 *       1+4/2
 *       
 *       -5*-2 => 10
 *       
 *   형변환 : 자동 , 강제 
 *          ---- 연산처리 => 연산 같은 데이터형만 가능 
 *           int + double
 *           ---
 *           double 
 *           
 *           int + (int)double
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b);  //8
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  //4
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  //12
	    System.out.printf("나누기 연산 결과: %d \n", a/b); // 3
	    System.out.printf("나머지 연산 결과: %d \n", a%b);//0

	}

}
