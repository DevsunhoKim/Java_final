//10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
import java.util.*;
public class 배열정리문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        int max=0;
        int min=100;
        
        // 정수 => 10개 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("배열 저장된 값");
        System.out.println(Arrays.toString(arr));
        // 최대값,최소값
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
