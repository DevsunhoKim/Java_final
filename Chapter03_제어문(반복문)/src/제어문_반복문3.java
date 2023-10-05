// 정수 1개를 받아서 해당 구구단
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dan;
        // 초기화 (명시적,입력값,임의의 난수,파일,오라클)
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력:");
        dan=scan.nextInt();
        
        for(int i=1;i<=9;i++)
        {
        	System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
        }
	}

}
