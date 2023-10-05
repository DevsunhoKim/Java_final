/*
 *    문자 => 10개 저장 
 *    char[] arr=new char[10];
 *    String[] s=new String[10];**************
 */
// => 빈도수 구하기 => 100개의 난수 (0~9)
// => 순서 (최적화) 
import java.util.*;
public class 배열_4 {
    // int data1,data2...data100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] data=new int[100];
        for(int i=0;i<data.length;i++)
        {
        	data[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(data));
        // 빈도수 구하기 
        int[] count=new int[10];
        for(int i=0;i<data.length;i++)
        {
        	count[data[i]]++;
        }
        
        for(int i=0;i<count.length;i++)
        {
        	System.out.println(i+":"+count[i]);
        }
        // 총합 
        int sum=0;
        for(int i:count)
        {
        	sum+=i;
        }
        System.out.println("sum="+sum);
	}

}



