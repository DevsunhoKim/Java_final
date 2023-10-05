import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        System.out.print("월 입력:");
        int month=scan.nextInt();
        System.out.print("일 입력:");
        int day=scan.nextInt();
        // API 
        Calendar cal=Calendar.getInstance();
        // 메모리 할당 => 싱글턴 (한개만 생성)
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DATE, day);
        
        char[] strWeek= {' ','일','월','화','수','목','금','토'};
        int week=cal.get(Calendar.DAY_OF_WEEK);// 요일 읽기
        System.out.println(year+"년도 "+month+"월 "
        		+day+"일은 "+strWeek[week]+"요일입니다");
	}

}
