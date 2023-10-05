/*
 *    선택 정렬 / 버블 정렬 
 *    -------   -------
 *    
 *    30 10 50 40 20     ASC(올림차순:10 20 30 40 50) / DESC(내림차순: 50 40 30 20 10)
 *    -- --
 *    10 30
 *    --    --
 *    10    50
 *    --       --
 *    10       40
 *    --          --
 *    10          20
 *    --------------- 1 round
 *    10 30 50 40 20
 *       -- --
 *       30 50
 *       --    --
 *       30    40
 *       --       --
 *       20       30
 *    --------------- 2 round
 *    10 20 50 40 30
 *          -- --
 *          40 50
 *          --    --
 *          30    40
 *    --------------- 3 round
 *    10 20 30 50 40
 *             -- --
 *             40 50
 *    --------------- 4 round
 *    10 20 30 40 50 
 *                --  => arr.length-1
 *    
 *    i  j  ==> i+j=4  ==> j=4-i
 *    0  4
 *    1  3
 *    2  2
 *    3  1
 *    
 *                                                
 */
import java.lang.reflect.Array;
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1; //1~100
        }
        System.out.println("====== 정렬전 =======");
        System.out.println(Arrays.toString(arr));
        
        // 정렬 
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("===== 정렬후(ASC) =====");
        System.out.println(Arrays.toString(arr));
        /*
         *    int a=10;
         *    int b=20;
         *    
         *    => a=20,b=10
         *    
         *    a=b;
         *      - 10   => a=10
         *    b=a;
         *      - 10   => b=10
         *      
         *    int temp=a; temp=10
         *    a=b; => a=20
         *    b=temp => b=10
         */    
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			int temp=arr[i];// 임시변수 
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("===== 정렬후(DESC) =====");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("===== API ======");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}




