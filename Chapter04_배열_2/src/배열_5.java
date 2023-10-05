// 간단한 프로그램 => 중복없는 난수 
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        	for(int j=0;j<i;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			i--;// 다시 난수 발생 arr[3]
        			// index를 이용해서 다시 난수 발생 
        			break;
        		}
        	}
        }
        
        // 출력 
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}
