import java.util.*;
public class 배열_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("===== 원본 =====");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("===== 정렬(ASC:올림차순) =====");
        Arrays.sort(arr);
        // ORDER BY no DESC(ASC)
        System.out.println(Arrays.toString(arr));
        System.out.println("===== 정렬(DESC:내림차순) =====");
        for(int i=arr.length-1;i>=0;i--)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
