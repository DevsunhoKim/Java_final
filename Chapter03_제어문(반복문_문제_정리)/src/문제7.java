/*
 *   7.	두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해 보세요.
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        while(true)
        {
        	int a=(int)(Math.random()*6)+1;
        	int b=(int)(Math.random()*6)+1;
        	count++;
        	System.out.println("a="+a+",b="+b);
        	if(a==b)
        	{
        		break;
        	}
        }
        System.out.println("count="+count);
	}
}
