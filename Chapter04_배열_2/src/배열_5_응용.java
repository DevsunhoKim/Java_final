import java.util.Scanner;
/*
 *   숫자야구게임 
 *   ---------
 *   1. 난수 (3자리)
 *          ------ 중복이 없는 난수 
 *      369 => new int[3]
 *   2. 사용자 입력 => new int[3]
 *      힌트
 *      123 ==> 0S-1B
 *      321 ==> 1S-0B
 *      368 ==> 2S-0B
 *      369 ==> 3S-0B
 *              -----
 *      s=>3이면 종료 
 *      -----------
 */
public class 배열_5_응용 {
    public static void process()
    {
    	int[] com=new int[3];
        for(int i=0;i<com.length;i++)
        {
        	com[i]=(int)(Math.random()*9)+1;//1~9
        	for(int j=0;j<i;j++)
        	{
        		if(com[i]==com[j])
        		{
        			i--;
        			break;
        		}
        	}
        }
        int[] user=new int[3];//사용자 입력값 => 3자리입력  
        // 출력 
        // System.out.printf("%d%d%d\n",com[0],com[1],com[2]);
        // 사용자 입력 
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.print("3자리 정수 입력:");
        	int input=scan.nextInt();
        	if(input<100 || input>999)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; // while의 조건식으로 이동 
        		// while문 처음으로 돌아간다.
        	}
        	//정상적으로 입력 
        	user[0]=input/100;
        	user[1]=(input%100)/10;
        	user[2]=input%10;
        	// 오류 체크 
        	if(user[0]==user[1]||
        			user[1]==user[2]||user[0]==user[2])
        	{
        		System.out.println("같은 수는 사용할 수 없습니다!!");
        		// 처음부터 입력 
        		continue;
        	}
        	if(user[0]==0 || user[1]==0 || user[2]==0)
        	{
        		System.out.println("0은 사용 할 수 없습니다!!");
        		continue;
        	}
        	// 힌트 
        	int s=0,b=0;
        	// s=>같은 자리,같은 숫자 , b=>다른 자리 , 같은 숫자 
        	for(int i=0;i<com.length;i++)
        	{
        		for(int j=0;j<user.length;j++)
        		{
        			if(com[i]==user[j])// 같은 수가 있다면 
        			{
        			   if(i==j) // 같은 자리에 있다
        				   s++;
        			   else
        				   b++;
        			}
        		}
        	}
        	System.out.println("Input Number:"+input+",Result:"
        			           +s+"S-"+b+"B");
        	// 종료 여부 확인 
        	if(s==3)
        	{
        		System.out.println("게임을 다시 할까요?(y|Y):");
        		char c=scan.next().charAt(0);
        		if(c=='Y'||c=='y')
        		{
        			process();
        		}
        		else
        		{
        			System.out.println("Game Over!!");
        			System.exit(0);
        		}
        		
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
