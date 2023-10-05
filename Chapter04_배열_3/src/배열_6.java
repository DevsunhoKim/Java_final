/*
 *   알파벳 ==> 문자열은 안됨 
 *            ----------- 비교연산자를 사용할 수 없다 
 *            compare() 음수/양수/0
 *            String s="H"
 *            String s1="K"
 *            
 *            s.compare(s1)
 *            -         --
 *            H         K   ==> -2
 *            
 *          D, F, D, S, Y => ASC / DESC > <
 *         -- --  
 *          D  F
 *         --     --
 *          D     D
 *         --        --
 *          D        S
 *         --          --
 *         D           Y
 *         ----------------- 1Round
 *         D  F  D  S  Y
 *            -  -
 *            D  F
 *            -     -
 *            D     S
 *            -        -
 *            D        Y
 *         ----------------- 2Round
 *         D  D  F  S  Y
 *         ----  -  -
 *               F  S
 *               -     -
 *               F     Y
 *         ----------------- 3Round
 *         D D  F  S  Y
 *         ------  -  -
 *                 S  Y
 *         ----------------- 4Round
 */
import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        System.out.println("==== 정렬전 ====");
        System.out.println(Arrays.toString(alpha));
        
        System.out.println("==== 정렬후 ====");
        for(int i=0;i<alpha.length-1;i++)
        {
        	for(int j=i+1;j<alpha.length;j++)
        	{
        		if(alpha[i]>alpha[j])
        		{
        			char temp=alpha[i];
        			alpha[i]=alpha[j];
        			alpha[j]=temp;
        		}
        	}
        	System.out.println((i+1)+"Round==>"+alpha[i]);
        	System.out.println(Arrays.toString(alpha));
        }
        System.out.println(Arrays.toString(alpha));
	}

}
