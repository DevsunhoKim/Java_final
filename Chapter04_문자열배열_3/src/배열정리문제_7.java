// 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
import java.util.*;
public class 배열정리문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
        // 초기값
        // Random r=new Random() => r.nextInt(100)
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        	// double random() => 0.0~0.99
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
        	if(i==3)
        		continue; // 인덱스가 3인것을 제외 => 증가식으로 이동
        	System.out.print(arr[i]+" ");
        }
	}

}
