class Member{ // 1순위
	// 우선 순위는 명시적 초기화
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동";
	// 명시적 초기화
	// Member(){}
	{ // 2순위
		mno=3;
		id="park";
		pwd="1234";
		name="심청이";
	}
	// 초기화 블록 
	Member() { //3순위
		mno=2;
		id="hong";
		pwd="1234";
		name="박문수";
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		System.out.println("번호 :"+m1.mno);
		System.out.println("ID :"+m1.id);
		System.out.println("PASSWORD :"+m1.pwd);
		System.out.println("이름 :"+m1.name);
		System.out.println("===================");
		Member m2=new Member();
		System.out.println("번호 :"+m2.mno);
		System.out.println("ID :"+m2.id);
		System.out.println("PASSWORD :"+m2.pwd);
		System.out.println("이름 :"+m2.name);
		
	}

}
