// 년도 / 월 / 일 => 요일 출력 
import java.util.Scanner;
// => 연산자 / 제어문 활용법 ==> 1차원 
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        System.out.print("일 입력:");
        int day=scan.nextInt();
        
        /*
         *   요일 구하기 방식 
         *   ------------
         *   1년 ~ 요청 날까지 총날수를 구한다 % 7 ==> 요일 
         */
        char[] strWeek= {'일','월','화','수','목','금','토'};
        int[] lastday= {
        	31,28,31,30,31,30,
        	31,31,30,31,30,31
        };
        
        // 1. 전년도까지 날수 => 12.31
        int total=(year-1)*365
        		 +(year-1)/4
        		 -(year-1)/100
        		 +(year-1)/400;
        // 윤년일 경우 변경 (2월=> 29)
        if((year%4==0 && year%100!=0)||(year%400==0))
        	lastday[1]=29;
        else
        	lastday[1]=28;
        // 2. 전달까지 날수 
        for(int i=0;i<month-1;i++)
        {
        	total+=lastday[i];
        }
        // 3. 요청 날 ===============> 1+2+3%7 => (0~6)
        total+=day; // total++;
        
        // 요일 구하기 
        int week=total%7;
        
        System.out.println(year+"년도 "+month+"월 "
        		+day+"일은 "+strWeek[week]+"요일입니다");
        
        
	}

}





