
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=2;i<=9;i++)
        {
        	System.out.println("★★★ "+i+"단 ★★★");
        	for(int j=1;j<=9;j++)
        	{
        		System.out.printf("%d * %d = %d\n",i,j,i*j);
        	}
        	System.out.println("==============");
        }
	}

}
