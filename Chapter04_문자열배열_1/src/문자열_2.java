import java.util.Scanner;
// 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인 
// ABBA => 문자갯수 => length()
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        String msg="";//''
        // 오류 처리 
        while(true)
        {
        	System.out.print("문자열 입력:");
        	msg=scan.next();
        	if(msg.length()%2==0)
        	{
        		break;
        	}
        }
        // 좌우 대칭 확인 
        boolean bCheck=true;
        /*
         *     AB BA
         *     -  -
         *      --
         *      
         *    char c='A';
         *    for(int ~~~)
         *    {
         *       char c='A';
         *       c++;
         *    }
         */
        
        // ABCA
        // AA
        // BC
        for(int i=0;i<msg.length()/2;i++)
        {
        	int j=msg.length()-1-i;
        	char c=msg.charAt(i);
        	char c1=msg.charAt(j);
        	System.out.println(c+","+c1);
        	if(c!=c1)
        	{
        		
        		bCheck=false;
        		break;
        	}
        	else
        	{
        		bCheck=true;
        		//break;
        	}
        	
        	
        }
        if(bCheck==false)
        {
        	System.out.println(msg+"는(은) 대칭 구조가 아닙니다");
        }
        else
        {
        	System.out.println(msg+"는(은) 좌우 대칭입니다!!");
        }
	}

}
