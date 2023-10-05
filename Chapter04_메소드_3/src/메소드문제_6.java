/*
 *  => up/down 게임
 */
import java.util.*;
public class 메소드문제_6 {
	static int ran()
	{
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		return com;
	}
	static String ud(int com)
	{
		while(true)
		{
			System.out.println("정수 입력 :");
			int user=scan.nextInt();
			if(com>user)
			{
				System.out.println("더 큰수를 입력하시오");
			}
			else if(com<user)
			{
				System.out.println("더 작은수를 입력하시오");
			}
			else
			{
				System.out.println("GAME OVER!!");
				break;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		}

	}

}
