/*
 *   1. 문자열을 입력 받아서 대문자=>소문자 , 소문자 => 대문자로 변경 
 *      --------------- ---------------------------------
 *   2. 문자열을 입력을 받아서 반대로 출력  
 *      ---------------- ---------
 */
import java.util.Scanner;
public class 메소드_2 {
    // 문자열을 입력받는 기능 : 리턴형 => String , 매개변수(X)
	static String userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return scan.nextLine();
		// next() : 엔터시에 메모리 저장 => 문자열 인식 (공백)
		// aaa aaa aaa aaa => aaa
		// nextLine() : 엔터시에 메모리에 저장 
		// aaa aaa aaa aaa => aaa aaa aaa aaa
	}
	// 대문자=>소문자 , 소문자 => 대문자로 변경 
	static void alphaChange(String msg)
	{
		String result="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(c>='A' && c<='Z') // 대문자
			{
				//result+=(char)(c+32); // 소문자 변환
				result+=String.valueOf(c).toLowerCase();
			    //      ----------------- char=>String	
			}
			else if(c>='a' && c<='z') // 소문자 
			{
				//result+=(char)(c-32);
				result+=String.valueOf(c).toUpperCase();
			}
			else
			{
				result+=c;
			}
		}
		System.out.println("결과값:"+result);
	}
	// 리턴형 / 매개변수(String)
	// => 결과값을 받아서 출력 , 메소드 안에서 처리 (o)
	// 반대로 출력
	static String alphaReverse(String msg)
	{
		String result="";
		for(int i=msg.length()-1;i>=0;i--)
		{
			char c=msg.charAt(i);
			result+=c;
		}
		return result;
	}
	// => 결과값을 받아서 출력 (o), 메소드 안에서 처리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg=userInput();
        System.out.println("msg:"+msg);
        //alphaChange(msg);
        String res=alphaReverse(msg);
        System.out.println("res:"+res);
        
	}

}
