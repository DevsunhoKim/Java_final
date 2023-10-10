/*
 * 리턴형 O ,매개변수 O
 * 
 * ID 찾기  
 */
import java.util.*;
public class 메소드_6 {
	static String idInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ID 입력 :");
		return scan.next();
	}
	// 아이디 중복 체크
	static boolean idCheck(String id)
	{
		boolean bCheck=false;
		String[] ids= {
				"hong",
				"admin",
				"lee",
				"park",
				"shim"
		};
		for(String i:ids)
		{
			if(id.equals(i))
					{
						bCheck= true;
						break;
					}
		}
		return bCheck;
	}
	//모든 메소드 조립하는 메소드
	static void process()
	{
		String id=idInput();
		boolean bCheck=idCheck(id);
		
		if(bCheck)
			System.out.println("이미 사용중인 아이디 입니다");
		else
			System.out.println("사용이 가능한 아이디 입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
