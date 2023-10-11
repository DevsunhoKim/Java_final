import java.util.*;
class Student{
	String name; //null
	int kor,eng,math; // 0,0,0 => heap => 프로그램 종료시까지 메모리 유지
	// 매개변수 / 지역변수 => Stack 
	// 멤버변수  (매개변수/지역변수) 저장공간이 달라 같은 변수명을 사용가능
	Student(String name,int kor,int eng,int math)
	{
		// 매개변수 / 지역변수 => 메소드 안에서만 생성가능 => 자동으로 메모리 해제
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		//지역 변수를 우선으로 처리
	}
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			System.out.println("이름 입력:");
			String name=scan.next();
			System.out.println("국어 점수 입력:");
			int kor = scan.nextInt();
			System.out.println("영어 점수 입력:");
			int eng = scan.nextInt();
			System.out.println("수학 점수 입력:");
			int math = scan.nextInt();
			
			std[i]=new Student(name,kor,eng,math);
		}
		/*
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(" ",0,0,0));
		list.add(new Student(" ",0,0,0));
		list.add(new Student(" ",0,0,0));
		list.add(new Student(" ",0,0,0));
		*/
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("-%-6s%-5d%-5d%-5d%-7d%-7.2f\n",
					std[i].name,std[i].kor,std[i].eng,std[i].math,
					(std[i].kor+std[i].eng+std[i].math),
					(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
	}

}
