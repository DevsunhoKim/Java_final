/*
 * 알파벳을 입력받아서 => 대문자/소문자/숫자/기타 ==> 결과 출력
 */
import java.util.Scanner;
public class 메소드문제_4 {
	static char userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력 :");
		char c=scan.next().charAt(0);
		return c;
	}
	static String check(char c)
	{
		String res="";
		if(c>='A' && c<='Z')
			res="는(은) 대문자 입니다";
		else if(c>='a' && c<='z')
			res="는(은) 소문자 입니다";
		else if(c>='0' && c<='9')
			res="는(은) 숫자 입니다";
		else
			res="기타 문자 입니다.";
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		char c=userInput();
		String res=check(c);
		print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			process();
	}

}
