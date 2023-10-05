/*
 *   사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 
 *   출력하는 프로그램을 작성
 */
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 키보드 입력값을 읽어온다 
		Scanner scan=new Scanner(System.in);
		//                      ----------- 키보드 입력 
		/*System.out.print("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		*/
		System.out.print("정수 두개 입력(10 20):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a-b);
		System.out.println(a*b);
		
	}

}
