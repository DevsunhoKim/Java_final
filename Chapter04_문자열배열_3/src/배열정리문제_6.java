// 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
import java.util.*;
public class 배열정리문제_6 {

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
        // 총합 / 평균 
        int sum=0;
        for(int i:arr)
        {
        	sum+=i;
        }
        System.out.println("총합:"+sum);
        System.out.printf("평균:%.2f\n",sum/10.0);
	}

}
