/*
 *     5.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
            평균을 출력하라.
            예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
            평균은 5.4
            [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
            hint i  = (int)(Math.random()*10)+1;

 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=1;i<=10;i++)
        {
        	int a=(int)(Math.random()*10)+1;
        	System.out.print(a+" ");
        	sum+=a;
        }
        System.out.printf("\n평균:%.1f\n",sum/10.0);
	}

}
