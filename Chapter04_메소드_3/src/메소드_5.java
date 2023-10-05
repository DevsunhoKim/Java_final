import java.util.*;
public class 메소드_5 {

		static int[] userInput(){
			{
				int[] arr=new int[5];
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=(int)(Math.random()*100)+1;
				}
			}
			return arr;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i:arr)
		{
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		*/
	}

}
