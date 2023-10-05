// 매개변수 사용법 

public class 메소드_2 {
    static void plus(int a,int b)
    {
    	System.out.println("plus() start");
    	// 시작
    	System.out.println("사용자 요청값(a):"+a);
    	System.out.println("사용자 요청값(b):"+b);
    	// 사용자 요청값 출력
    	System.out.println("처리 결과값:"+(a+b));
    	// 요청에 대한 처리 결과
    	System.out.println("plus() end");
    	// 기능 종료 => 메소드가 기능 처리 
    }
    // 프로그램의 시작과 종료 담당하는 메소드 => 여러개의 기능을 만들고 조립 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 시작
		System.out.println("main start...");
		// 기능 호출 
		plus(10,20);
		// 종료
		System.out.println("main end...");
	}

}
