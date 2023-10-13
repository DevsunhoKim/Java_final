package com.sist.main2;
/*
 * static 메소드 / 인스턴스 메소드
 * -----------       => 인스턴스나 static 상관없이 사용 가능
 *      | static 변수 , static 메소드를 호출
 *        인스턴스 변수 , 인스턴스 메소드 반드시 객체 생성후에 사용
 *        
 *   => 클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체명)
 *                                 -------------
 *                                        |
 *                                      멤버변수와 지역변수의 구분
 *                                     ** 변수가 동일한 이름이면 지역변수가 우선 순위
 *                                     ** 지역변수,매개변수 찾고 =>없는경우에는 멤버변수에서 찾음 
 *      예)
 *      class A
 *      {
 *      	int a=20;    ==> 메모리 저장위치가 다르다
 *      					Heap
 *      	void display()
 *      	{
 *      		int a=10; => Stack
 *      		System.out.println(a);
 *                                --- 지역변수
 *          }
 *          void display(int a)
 *                       --------- 지역변수의 일종 Stack
 *          {
 *       		System.out.println(a);
 *          }
 *      }
 *      
 *      this : 객체
 *      this() : 생성자 (자신의 생성자를 호출할 때 사용)
 *      ------
 *       => 생성자에서만 사용이 가능
 *       => 생성자 첫출에 온다
 *       
 *      class A
 *      {
 *      	A() 
 *      	 {
 *      	 }
 *      	A(int a)
 *      	{
 *      		this();
 *      		System.out.println(a);
 *      		this(); // 오류발생
 *      	}
 *      }
 *      
 */
class Student
{
	int hakbun;  //0
	String name; //null
	String sex;  //null
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자 호출");
		this.hakbun=1;
		// Student가 가지고 있는 멤버변수
		this.name="홍길동";
		this.sex="남자";
		// 지역변수와 충돌이 없는경우에는 this. 생략이 가능하다
	}
	public Student(int hakbun,String name)
	{
		//구분자 멤버변수와 지역변수의 구분
		this.hakbun=hakbun;
		this.name=name;
	}
	
	public Student(String sex) 
	{
		this();
		this.sex=sex;
	}
	
	public Student(int h,String n,String s)
	{
		this(s);
		//hakbun=h;
		//name=n;
		//sex=s;
	}
	public void print()
	{
		System.out.println("학번 :"+hakbun);
		System.out.println("이름 :"+name);
		System.out.println("성별 :"+sex);
	}
	// 오버로딩 => 같은 메소드명으로 새로운 기능을 만든다
	/*
	 * void display(int a,int b,int c)
	 * void display(char a,double b,int c)
	 * void display(double a,double, double c)
	 * 
	 * 
	 * display(10.5.'A',100) => double , char , int
	 * 
	 * 보내준 자료형과 같은 데이터형을 사용하고 같은 자료형이 없을시에 더 작은 데이터형 사용
	 * 
	 *
	 * 
	 * 
	 */
}
public class MainClass {
	void display(int a,int b,int c)
	{
		System.out.println("(int a,int b,int c) Call");
	}
	void display(char a,double b,int c)
	{
		System.out.println("(char a,double b,int c) Call");
	}
	void display(double a,double b, double c)
	{
		System.out.println("(double a,double, double c) Call");
	}
	void display(double a,int b, int c)
	{
		System.out.println("(double a,int b, int c) Call");
	}
	void display(double a,char b, int c)
	{
		System.out.println("(double a,char b, int c) Call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// default 생성자
		MainClass m=new MainClass();
		m.display(10.5, 'A', 100);
		
		Student s1=new Student();
		s1.print();
		Student s2=new Student("여자");
		s2.print(); // 0 , null , 여자
		//==> 1 , 홍길동 , 여자
		Student s3=new Student(2,"심청이");
		s3.print(); // 2 , 심청이 , null
		Student s4=new Student(3,"박문수","남자");
		s4.print();
		
		
	}

}
