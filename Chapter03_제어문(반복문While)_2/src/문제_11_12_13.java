/*
 *   11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
 *   12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
 *   13. 
 *       ********** (5행10열) 
 *       ********** 
 *       ********** 
 *       ********** 
 *       **********
 */
public class 문제_11_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int count=0;
        for(int i=1;i<=10;i++)
        {
        	int a=(int)(Math.random()*100)+1;
        	System.out.print(a+" ");
        	if(a%2==0)
        		count++;//hit
        }
        System.out.println("\n결과값:"+count);*/
		int a3=0,a5=0;
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*100)+1;
			System.out.print(a+" ");
			if(a%3==0)
				a3++;
			if(a%5==0)
				a5++;
		}
		System.out.println("\n3의 배수 갯수:"+a3);
		System.out.println("5의 배수 갯수:"+a5);
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");// 한줄에 몇개 출력 
			}
			System.out.println(); // 다음줄에 출력 
		}
	}

}
