/*
 * 5자리 정수를 전송 => 정렬한다
 * 5자리 정수를 전송 => 거꾸로 출력
 * 선택정렬 알고리즘 
 * 메소드 처리
 * 
 * 수정 및 다시보기 필요
 */
import java.util.*;
public class 메소드_1 

{
	static int rev()
	{
		
	}
	static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	// 조립
	static void process()
	{
		//5개 정수
		int[] arr =new int[5];
		for(int i=0;i<arr.length-1;i++)
			
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		int[] result=sort(arr);
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
