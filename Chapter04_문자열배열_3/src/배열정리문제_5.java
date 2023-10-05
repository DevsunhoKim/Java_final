// 위 문제 배열 중에서 최대값의 인덱스를 출력하시오

import java.util.Arrays;

public class 배열정리문제_5 {

	public static void main(String[] args) {
		int[] arr=new int[10];
        // 초기값
        // Random r=new Random() => r.nextInt(100)
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        	// double random() => 0.0~0.99
        }
        System.out.println(Arrays.toString(arr));
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(max<arr[i])
        		max=arr[i];
        }
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(max==arr[i])
        	{
        		index=i;
        		break;
        	}
        }
        System.out.println("최대값의 인덱스:"+index);
	}

}
