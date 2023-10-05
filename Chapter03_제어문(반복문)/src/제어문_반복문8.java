// 100번의 알파벳 난수 발생 ==> A,B,C의 갯수확인 
public class 제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0,b=0,c=0;
        // 갯수 ++ , 누적 += ==> 빈도수 계산 
        for(int i=1;i<=100;i++)
        {
        	char ch=(char)((Math.random()*26)+65);
        	// A~Z사이의 난수 
        	System.out.print(ch+" ");
        	if(ch=='A')
        		a++;
        	else if(ch=='B')
        		b++;
        	else if(ch=='C')
        		c++;
        }
        System.out.println("\n===========결과값========= ");
        System.out.println("A의 갯수:"+a);
        System.out.println("B의 갯수:"+b);
        System.out.println("C의 갯수:"+c);
        
	}

}
