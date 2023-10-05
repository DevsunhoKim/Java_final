/*
 *   정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지
 *   -------- 변수확인           ----------    ---------- 
     판단해보자.
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        num=scan.nextInt();
        if(num>=50)//50 이상의 수
        {
        	System.out.println(num+"는(은) 50이상입니다");
        }
        if(num<50)// 50미만의 수
        {
        	System.out.println(num+"는(은) 50미만입니다");
        }
	}

}
