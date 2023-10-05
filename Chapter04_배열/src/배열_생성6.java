
public class 배열_생성6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        }
        int sum=0;
        for(int a:arr)
        {
			/*
			 * if(a%3==0) { System.out.print(a+" "); }
			 */
        	System.out.print(a+" ");
        	sum+=a;
        }
        System.out.printf("\n평균:%.1f\n",sum/10.0);
	}

}
