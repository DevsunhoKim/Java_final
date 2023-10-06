/*
 * 숫자야구게임
 * 
 * 컴퓨터가 임의로 난수 발생 => 3자리 숫자
 * 사용자가 입력 
 * 힌트 
 * 종료여부 확인
 * 조립
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드_3 {
	static int[] getRand()
	{
		int[] com =new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i] = (int)(Math.random()*9)+1;
			
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		return com;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] com =new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i] = (int)(Math.random()*9)+1;
			
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) // ==> 무한루프 => 종료여부 확인
		
		{
			System.out.println("세자리 정수 입력 :");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			//배열에 숫자를 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			// 힌트 제공
			
			int s=0 , b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[i])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			
			if(s==3)
			{
				System.out.println("Game Over!");
				break;
			}
		}
		*/
	}

}
;