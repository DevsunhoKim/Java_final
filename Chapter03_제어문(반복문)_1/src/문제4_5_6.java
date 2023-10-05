/*
 *   4) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 *   5) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 *   6) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
 */
import java.util.Scanner;
public class 문제4_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int num,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
        	sum+=i;
        }
        System.out.println("1~"+num+"까지의 합:"+sum);*/
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
			if(i%6==0)
				System.out.println();
		}
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10:"+sum);
		
	}

}
