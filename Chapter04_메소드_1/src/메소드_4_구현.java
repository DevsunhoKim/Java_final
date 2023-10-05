// 메소드_4 => 메소드 제작 
// 리턴형 / 매개변수 / 메소드명 => 가독성있게...
// 입력 => 기능 
// 구구단 => 기능 
import java.util.Scanner;
public class 메소드_4_구현 {
    // 사용자로 부터 정수를 받는다 
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		//int dan=scan.nextInt();
		//return dan;
		return scan.nextInt();
	}
	// 받은 정수에 해당되는 구구단 출력 
	/*static String gugudan(int dan)
	{
		String result=dan+"단\n";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+i*dan+"\n";
		}
		return result;
		
	}*/
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
        {
        	System.out.println(dan+"*"+i+"="+i*dan);
        }
	}
	// 조립기 
	static void process()
	{
		int dan=userInput();
        //String gu=gugudan(dan);
        //System.out.println(gu);
        gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
