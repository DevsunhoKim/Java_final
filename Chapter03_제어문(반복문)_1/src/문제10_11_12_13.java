/*
 *   10)1~30 짝수합,홀수합을 출력하는 프로그램을 작성
     11)1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
     12)1~1000까지에서 7의 배수의 합 ,9의 배수의 합
     13)10~99까지 정수중에 같은 자리의 정수를 출력하시오
 */
public class 문제10_11_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		제어문_반복문_2.aaaa=2000;
		System.out.println("======= 문제 10 =========");
		int a=0,b=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				a+=i;
			else
				b+=i;
		}
		System.out.println("1~30 짝수합:"+a);
		System.out.println("1~30 홀수합:"+b);
		
		System.out.println("======= 문제 11 =========");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n======= 문제 12 =========");
		a=b=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				a+=i;
			if(i%9==0)
				b+=i;
		}
		System.out.println("7의 배수의 합:"+a);
		System.out.println("9의 배수의 합:"+b);
		System.out.println("7의 배수+9의 배수:"+(a+b));
		
		System.out.println("======= 문제 13 =========");
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.print(i+" ");
		}
	}

}
