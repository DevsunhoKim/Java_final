// 1~30까지 => 짝수만 출력 
/*
 *   2 4 6
 *   8 10 12
 *   
 */
public class 제어문_반복문12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=30;i++)
        {
        	
        	if(i%2==0)
        	{
        		System.out.printf("%2d\t",i);
        	}
        	if(i%6==0)
        	{
        		System.out.println();
        	}
        	
        }
	}

}
