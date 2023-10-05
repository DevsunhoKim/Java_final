// 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
// if:3의 배수 조건  ~ else : 3의 배수가 아닌 경우 
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=(int)(Math.random()*100)+1;//1~100
        if(num%3==0)
        {
        	System.out.println(num+"는(은) 3의 배수입니다");
        }
        else
        {
        	System.out.println(num+"는(은) 3의 배수 아닙니다");
        }
	}

}
