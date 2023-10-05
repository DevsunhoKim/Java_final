/*
 *   선택문은 범위가 지정되는 것이 아니다 
 *   => 값 1개를 선택해서 사용 
 *      ----- 정수 , 문자 , 문자열 
 *   => 형식)
 *      switch(정수,문자, 문자열) 
 *      {
 *         case 1:
 *           실행문장 
 *           break; ==> 실행문장 수행후에 종료 
 *         case 2:
 *           실행문장
 *           break; ==> 실행문장 수행후에 종료
 *         case 3:
 *           실행문장  ==> 3을 수행하고 4번을 수행하고 종료 
 *         case 4:
 *           실행문장 
 *           break;
 *      }
 *      
 *      범위가 지정되면 다중 조건문 
 *      범위가 없이 값이 1개일때 => switch 
 *      switch => 메뉴 , 키보드 => 웹,게임 , 서버프로그램에서 주로 사용
 */
// 성적 
import java.util.Scanner;
// 3개의 정수 => 평균 , 총점 , 학점 
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor,eng,math,total,avg;
        double avg2;
        char score=' ';
        // switch => 실수는 사용할 수 없다 => 정수,문자,문자열만 가능 
        Scanner scan=new Scanner(System.in);
        System.out.print("국어 입력:");
        kor=scan.nextInt();
        
        System.out.print("영어 입력:");
        eng=scan.nextInt();
        
        System.out.print("수학 입력:");
        math=scan.nextInt();
        
        total=(kor+eng+math);
        avg2=total/3.0;
        
        avg=(int)(avg2/10); //69~60/10 => 6
        // 10,9,8,7,6,5,4,3,2,1,0
        // 10 => score='F'
        switch(avg)
        {
        case 10: // if(avg==10 || avg==9) score='A'
        case 9:
        	score='A';
        	break;// 종료 명령 
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:// 나머지 
        	score='F';
        }
        
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg2);
        System.out.println("학점:"+score+"학점");
	}

}




