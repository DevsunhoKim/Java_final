import java.util.Scanner;
// 국어 영어 수학 물리 국사 , 과학 
public class 메소드_4_메서드변경 {
    // 사용자 입력 => 2번 
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	// 요일 구하기 
	static int getWeek(int year,int month)
	{
		// 2. 전년도까지의 총날수 (1년도 1월 1일~ 12.31)
				int total=(year-1)*365
						 +(year-1)/4
						 -(year-1)/100
						 +(year-1)/400;
				// 3. 전달까지의 총날수
				int[] lastday= {
					31,28,31,30,31,30,
					31,31,30,31,30,31
				};
				
				// 윤년 조건 
				if((year%4==0 && year%100!=0)||(year%400==0))
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				
				// 요청한 달의 1일자 요일 
				total++;
				
				// 요일 구하기 
				int week=total%7;
				return week;
	}
	static void print(int year,int month,int week)
	{
		   int[] lastday= {
				31,28,31,30,31,30,
				31,31,30,31,30,31
			};
		    if((year%4==0 && year%100!=0)||(year%400==0))
				lastday[1]=29;
			else
				lastday[1]=28;
		// 달력 출력 
				String[] strWeek= {
					"일","월","화","수","목","금","토"	
				};
				
				
				System.out.println(year+"년도 "+month+"월");
				System.out.println();
				for(String s:strWeek)
				{
					System.out.print(s+"\t");
				}
				
				System.out.println();
				for(int i=1;i<=lastday[month-1];i++)
				{
					if(i==1)
					{
						// 공백 
						for(int j=0;j<week;j++)
						{
							System.out.print("\t");
						}
					}
					System.out.printf("%2d\t",i);
					week++;
					if(week>6)
					{
						System.out.println();
						week=0;
					}
				}
				
	}
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");
		int week=getWeek(year, month);
		print(year, month, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 반복제거 => 메소드 
        //int year=userInput("년도");
        //int month=userInput("월");
        //int day=userInput("일");
	}

}