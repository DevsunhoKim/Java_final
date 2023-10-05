import java.util.Arrays;

public class 배열_생성7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[6];
        int su=0;
        for(int i=0;i<6;i++)
        {
        	com[i]=(int)(Math.random()*45)+1;
        	for(int j=0;j<i;j++)
        	{
        		if(com[j]==com[i])
        		{
        			i--;
        			break;
        		}
        	}
        	
        }
        Arrays.sort(com);
        for(int a:com)
        {
        	System.out.print(a+" ");
        }
	}

}
