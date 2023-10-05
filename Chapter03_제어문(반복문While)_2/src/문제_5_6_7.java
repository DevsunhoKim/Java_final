/*
 *   5. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
    출력하는 프로그램을 작성하시오
     6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
     7. 5~16까지의 합을 구하시오
     
 */
import java.util.Scanner;
public class 문제_5_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for(int i=1;i<=6;i++)
        {
        	for(int j=1;j<=6;j++)
        	{
        		if(i+j==6)
        		{
        			System.out.println("["+i+","+j+"]");
        		}
        	}
        }*/
		/*Scanner scan=new Scanner(System.in);
		System.out.print("시작 값:");
		int start=scan.nextInt();
		System.out.print("끝 값:");
		int end=scan.nextInt();
		int res=1;
		
		for(int i=start;i<=end;i++)
		{
			res*=i;
		}
		System.out.println("결과값:"+res);*/
		int sum=0;
		for(int i=5;i<=16;i++)
		{
			sum+=i;
		}
		System.out.println("결과값:"+sum);
		
	}

}
