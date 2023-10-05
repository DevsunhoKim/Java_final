import java.util.Arrays;

public class 배열_생성8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        }
        // 출력 
        int max=0;
        for(int a:arr)
        {
            if(max<a)
            	max=a;
        	System.out.print(a+" ");
        }
        System.out.println("=== 결과값 ===");
        System.out.println("세번째 값:"+arr[2]);
        System.out.println("다섯번째 값:"+arr[4]);
        System.out.println("마지막 값:"+arr[arr.length-1]);
        
        System.out.println("가장 큰 값:"+max);
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
