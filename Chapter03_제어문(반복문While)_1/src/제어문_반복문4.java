// 사용자로부터 정수 1개 => 구구단 
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력:");
        int dan=scan.nextInt();
        
        int i=1;
        while(i<=9)
        {
        	System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        	i++;
        }
	}

}
