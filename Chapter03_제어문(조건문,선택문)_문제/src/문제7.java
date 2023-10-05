/*
 *   정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
   (switch~case 사용) 

 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2;
        char op=' ';
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수 입력:");
        num1=scan.nextInt();
        
        System.out.print("두번째 정수 입력:");
        num2=scan.nextInt();
        
        System.out.print("연산자 입력:(+,-,*,/)");
        op=scan.next().charAt(0);
        
        switch(op)
        {
        case '+':
        	System.out.println(num1+"+"+num2+"="+(num1+num2));
        	break;
        case '-':
        	System.out.println(num1+"-"+num2+"="+(num1-num2));
        	break;
        case '*':
        	System.out.println(num1+"*"+num2+"="+num1*num2);
        	break;
        case '/':
        	if(num2==0) // 오류처리 => 처리를 할 수 없는 경우 (예외처리)
        		System.out.println("0으로 나눌 수 없습니다");
        	else
        		System.out.println(num1+"/"+num2+"="+num1/num2);
        	break;	
        default:
        	System.out.println("처리할 수 없는 연산자입니다");
        }
	}

}
