class B
{
	int a=10;
	// 생성자 X , 일반메소드
	// 이름 앞에 리턴형이 있으면 생성사 아님;
	 void B() {
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	 /*
	  * 생성자 => 초기화가 필요하다 (명시적 초기화가 불가능 할 때)
	  * 	    제어문 / 파일읽기 ==> 생성자 사용
	  *      => 시작과 동시에 처리를 해야 할 때 => 가장 먼저 호출
	  *                   |
	  *                 자동 로그인
	  *                 윈도우 화면 설정
	  *                 서버 연결
	  *      
	  */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B(); ===> 오류 발생
		//new B(); // 반드시 new 생성자(); 형식으로 호출
		//new B().a=100;
		B b=new B(); // 주소를 저장해서 class B의 값 변경
	//     b.B(); 일반 메소드 호출시
	//	b.a=100;
	//	new B().a=1000; // 다른 주소에 저장된 클래스
	//	System.out.println(b.a); // 10 new가 새로운 메모리에 생성
	}

}
