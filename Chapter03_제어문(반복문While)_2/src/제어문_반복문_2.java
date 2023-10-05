// 가위바위보 => 10번 ==> 3승 2무 5패
import java.util.Scanner;
class A
{
	
}
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int win=0,lose=0,same=0;
        
        int i=1;
        
        Scanner scan=new Scanner(System.in);
        
        while(i<=10)
        {
        	System.out.println("===== "+i+"번째 게임 =====");
        	int com=(int)(Math.random()*3);
        	
        	int user=0;
        	// 유효성 검사 => 원하는 값이 입력되게 유도 
        	while(true)
        	{
        		System.out.print("가위(0),바위(1),보(2):");
            	user=scan.nextInt();
        		if(user<0 || user>2)
        		{
        		    System.out.println("가위바위보를 입력하세요!!");
        			continue;//  처음부터 수행이 가능 
        		}
        		break;// 종료 => 소속 반복문만 제어 
        	}
        	
        	System.out.print("컴퓨터:");
        	if(com==0)
        		System.out.println("가위");
        	else if(com==1)
        		System.out.println("바위");
        	else if(com==2)
        		System.out.println("보");
        	
        	System.out.print("사용자:");
        	if(user==0)
        		System.out.println("가위");
        	else if(user==1)
        		System.out.println("바위");
        	else if(user==2)
        		System.out.println("보");
        	
        	// 승패 결정 
        	int res=com-user;
        	/*
        	 *   컴퓨터      사용자
        	 *     가위(0)   가위(0)  ==> 0
        	 *              바위(1) ==> -1 user
        	 *              보(2)  ==> -2
        	 *     바위(1)   가위(0)  ==> 1 com
        	 *              바위(1)  ==> 0
        	 *              보(2)   ==> -1
        	 *     보(2)    가위(0) ==> 2
        	 *             바위(1)  ==> 1
        	 *             보(2)    ==> 0
        	 */
        	if(res==-1 || res==2)
        	{
        		System.out.println("사용자 Win!!");
        		win++;
        	}
        	else if(res==1 || res==-2)
        	{
        		System.out.println("컴퓨터 Win!!");
        		lose++;
        	}
        	else
        	{
        		System.out.println("비겼다");
        		same++;
        	}
        	i++;
        }
        System.out.println("======= 결과값 =====");
        System.out.printf("%d승 %d무 %d패\n",win,same,lose);
        
	}

}
