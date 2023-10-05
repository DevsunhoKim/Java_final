/*
 *    구구단 출력 
 *    ---------
 *    2*1=2  3*1=3 .... 9*1=9
 *    
 *    
 *    2*9=18 3*9=27 ... 9*9=81
 *    
 *    => 1차 for 1~9
 *    => 2차 for 2~9
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=9;i++)
        {
        	for(int j=2;j<=9;j++)
        	{
        		System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
        	}
        	System.out.println();
        }
	}

}
