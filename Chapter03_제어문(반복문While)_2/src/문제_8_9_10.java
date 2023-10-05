/*
 *    8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
 *    9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

 *    10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
 */
public class 문제_8_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0;
        for(int i=3;i<=4462;i++)
        {
        	if(i%2==0)
        		even+=i;
        }
        System.out.println("결과값:"+even);
        
        int a2=0,a3=0;
        for(int i=0;i<=12;i++)
        {
        	if(i%2==0)
        		a2+=i;
        	if(i%3==0)
        		a3+=i;
        }
        System.out.println("2의 배수 합:"+a2+",3의 배수의 합:"+a3);
	    int a4=0;
	    for(int i=1;i<=100;i++)
	    {
	    	if(i%4==0)
	    		a4+=i;
	    }
	    System.out.println("4의 배수의 합:"+a4);
	}

}
