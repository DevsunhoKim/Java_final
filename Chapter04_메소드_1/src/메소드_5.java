// 사칙연산 => 메소드 4 + 조립기 => 5개 
import java.util.Scanner;
// 정수 2개 => 연산자 1개 
public class 메소드_5 {
	// 반복 제거 
    static int userInput(String msg)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(msg+" 정수 입력:");
    	return scan.nextInt();
    }
    static char opInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("연산자 입력(+,-,*,/):");
    	return scan.next().charAt(0);
    }
    // =
    static void process()
    {
    	int num1=userInput("첫번째");
        int num2=userInput("두번째");
        char op=opInput();
        
        switch(op)
        {
        case '+':
        	// 리턴형 : int , 매개변수 : int , int
        	System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
        	break;
        case '-':
        	System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
        	break;
        case '*':
        	System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
        	break;
        case '/':
        	// 리턴형 : String , 매개변수 : int , int 
        	if(num2==0)
        		System.out.println("0으로 나눌 수 없다");
        	else
        	    System.out.printf("%d/%d=%.2f\n",
        	    		num1,num2,num1/(double)num2);
        	break;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
