// 정수 2개를 난수로 받아서 => 최대값,최소값을 구한다 
public class 단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*100)+1;
        int num2=(int)(Math.random()*100)+1;
        System.out.println("Max:"+Math.max(num1, num2));
        System.out.println("Min:"+Math.min(num1, num2));
	}

}
