// 5개 정수를 받아서 => max,min
import java.util.*;
public class 메소드_5 {
    static int[] userInput()
    {
    	int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=(int)(Math.random()*100)+1;	
        }
        
        return arr;
    }
    // 리턴형 => 한개만 설정이 가능 
    static int max(int[] arr)
    {
    	int m=arr[0];
    	for(int i:arr)
    	{
    		if(i>m)
    			m=i;
    	}
    	return m;
    }
    static int min(int[] arr)
    {
    	int m=arr[0];
    	for(int i:arr)
    	{
    		if(i<m)
    			m=i;
    	}
    	return m;
    }
    static void print(int max,int min)
    {
    	 System.out.println("max="+max);
         System.out.println("min="+min);
    }
    static void process()
    {
    	int[] arr=userInput();
    	System.out.println(Arrays.toString(arr));
    	int max=max(arr);
    	int min=min(arr);
    	print(max,min);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
       /* int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=(int)(Math.random()*100)+1;	
        }
        /// 사용자로 부터 입력값을 받는다 / 초기화 => 한단락 
        System.out.println(Arrays.toString(arr));
        // 최대값,최소값
        int max=arr[0];
        int min=arr[0];
        
        for(int i:arr)
        {
        	if(i>max)
        		max=i;
        	if(i<min)
        		min=i;
        }
        
        // 출력 
        System.out.println("max="+max);
        System.out.println("min="+min);
        */
	}

}