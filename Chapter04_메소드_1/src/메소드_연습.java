import java.util.*;
public class 메소드_연습 {
	
	static int sum () 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		int hap=num1+num2;
		
		return hap;
		
	}
		static void print (int hap)
		{
			System.out.println("Result :"+hap);
		}
		
		static void process()
		{
			
			print(sum());
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
