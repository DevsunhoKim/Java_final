// 1~100까지 => 3의배수의 합,5의 배수합 , 7의배수의 합 => 출력 
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a3=0,a5=0,a7=0;
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0)//15
        		a3+=i;
        	if(i%5==0)//15
        		a5+=i;
        	if(i%7==0)
        		a7+=i;
        }
        System.out.println("1~100까지 3의 배수합:"+a3);
        System.out.println("1~100까지 5의 배수합:"+a5);
        System.out.println("1~100까지 7의 배수합:"+a7);
	}

}
