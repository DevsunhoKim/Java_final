/*
 *   1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 *      -------------          --- 변수(누적변수)
 *      초기값 : 2
 *      증가식 : <=100
 *      증가식 : 2
 *      for(int i=2;i<=100;i+=2) 
 *   2) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
 *      초기값 : 5 
 *      조건식 : <=50
 *      증가식 : +=5
     3) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 */
public class 문제1_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("======== 문제 1 =========");
        int sum=0;// 합을 누적할 변수 
        for(int i=2;i<=100;i+=2)
        {
        	sum+=i;
        }
        System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
	    System.out.println("======== 문제 2 =========");
	    for(int i=5;i<=50;i+=5)
	    {
	    	if(i==50)
	    	  System.out.print(i);
	    	else
	    	  System.out.print(i+",");
	    }
	    System.out.println("\n======= 문제 3 =========");
	    //       ----- -----  ----
	    for(char c='B';c<='N';c+=2)
	    {
	    	if(c!='N')
	    	 System.out.print(c+",");
	    	else
	    	 System.out.print(c);
	    }
	}

}
