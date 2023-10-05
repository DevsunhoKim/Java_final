// 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
import java.util.*;
public class 배열정리문제_4 {

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
        System.out.println("인덱스가 1인 곳의 값:"+arr[1]);
	}

}
