// 문자열을 거꾸로 출력하는 메소드 구현
public class 메소드정리문제_6 {
    static void reverse(String msg)
    {
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		char c=msg.charAt(i);
    		System.out.print(c);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        reverse("Hello");
	}

}
