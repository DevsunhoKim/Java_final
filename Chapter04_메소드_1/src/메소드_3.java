// 리턴값을 받는 경우 
public class 메소드_3 {
    static int plus(int a, int b)
    {
    	System.out.println("plus() call");
    	System.out.println("요청처리 종료..");
    	System.out.println("결과값을 전송..");
    	return a+b;
    	// 코딩할 수 없다 
    }
    /*
     *   main에서는 가급적이면 처리하지 않는다 => 시작 메소드만 호출 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=plus(10,20);
        System.out.println("결과값:"+a);
	}

}
