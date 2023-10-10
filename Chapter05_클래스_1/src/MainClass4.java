// 클래스 => 데이터형 => 배열 사용이 가능
import java.util.*;
class Student2
{
	String name;
	int kor;
	int eng;
	int math;
	
}
// 3명의 학생 => 이름 국어 영어 수학 총점 평균 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2[] std=new Student2[3]; // 객체배열 => 일반배열
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<std.length;i++)
		{
			std[i]=new Student2();
			System.out.print((i+1)+"번째 이름 입력 :");
			std[i].name=scan.next();
			
			System.out.print((i+1)+"번째 국어 입력 :");
			std[i].kor=scan.nextInt();
			System.out.print((i+1)+"번째 영어 입력 :");
			std[i].eng=scan.nextInt();
			System.out.print((i+1)+"번째 수학 입력 :");
			std[i].math=scan.nextInt();
			
			
		}
		
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-7s%-5d%-5d%-5d%-5d\n",
					std[i].name,std[i].kor,std[i].eng,std[i].math);
		}
	}

}
