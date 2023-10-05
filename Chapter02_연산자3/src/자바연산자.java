/*
 *   변수 : 저장 공간 
 *   ====
 *     자바 저장 공간을 설정 (자료형,데이터형)
 *     ----------------
 *      정수
 *       byte (8bit) => 0,1을 8개를 채워서 숫자한개 저장 
 *            -128~127
 *       int (32bit) => -21억 4천 ~ 21억 4천
 *       --------------------- default (컴퓨터에서 모든 숫자는 int를 인식)
 *       long (64bit) => 금융권,빅데이터 
 *      실수
 *       double(64bit) => 소수점 15자리 이상 
 *      문자
 *       char (16bit) => 0~65535 (문자번호)
 *            'A' (X) ==> 65
 *      논리 
 *       boolean : true,false (8bit) => 0,1
 *      --------------------------------------------
 *        정수 3개 저장 
 *        int a,b,c;
 *        실수 2개 저장 
 *        double d1,d2
 *        문자 1개 
 *        char c;
 *        boolean bb;
 *        
 *      ---> 데이터 저장 ----> 사용자 요청에 맞게 가공 ----> 화면 출력 
 *      ---> 프로그램 (반복)          |
 *                              연산자 
 *      자바에서 제공하는 연산자 
 *      ------------------
 *       단항연산자 :
 *         = 증감연산자 (++,--) :한개 증가,한개 감소
 *           ++a : a값을 1증가 시킨후에 다른 연산을 수행 
 *           int a=10;
 *           int b=++a;
 *                 --
 *                 증가(1)  a=11
 *                --
 *                대입  b=11
 *           a++ : 먼저 다른 연산후에 나중에 1증가 
 *           int a=10;
 *           int b=a++;
 *               ---
 *                대입 b=10
 *                  --
 *                  증가(1) a=11
 *                
 *           --a : a값을 먼저 감소하고 나중에 다른 연산 수행 
 *           int a=10;
 *           int b=--a
 *                 --- 1감소 ==> a=9
 *               ---
 *               감소된 값을 대입 b=9
 *           a-- : 다른 연산을 수행한 다음에 감소를 한다 
 *           int a=10;
 *           int b=a--
 *               --- 감소전 대입 b=10
 *                 ---
 *                  a가 1감소 ==> a=9
 *           ++,-- => 1증가 , 1감소 
 *         = 부정연산자 (!) => boolean에서만 사용이 가능 
 *             => true => false
 *                false => true 
 *             예)
 *                 boolean bCheck=false;
 *                 bCheck=!bCheck ==> bCheck=true
 *                 예약가능한 날 => !(예약가능한 날)
 *                 
 *         = 형변환연산자 (type) => 강제형변환 
 *           --------- 객체지향 형변환 (클래스)
 *           숫자관련만 (정수,실수,문자)
 *           ----------------------
 *             UpCasting : 데이터형을 크게 만든다 
 *              int => double
 *              char => int 
 *              -------------- 자동 형변환 
 *              int a='A'
 *                    ---- int변경 ('A'=>65)
 *              double d=100
 *                       --- double변경 (100=>100.0)
 *             DownCasting : 데이터형을 작게 만든다 
 *               char c=(char)65;  c='A'
 *               int i=(int)100.0  i=100
 *       데이터형의 크기 
 *       -----------
 *           ================> 자동 형변환
 *        byte < char < int < long < float < double
 *           <================ 강제 형변환
 *           
 *        자동 형변환 
 *        ---------
 *          연산 처리시 많이 변경 (자바자체)
 *          -------
 *            데이터형이 같은 것 끼리 연산이 된다 
 *            
 *            double + int (X)
 *                     ----
 *                     double로 변경 
 *            char + int (X)
 *            ----
 *             int로 변경
 *            int + long (X)
 *            ---
 *             long로 변경 
 *             
 *            int + char + double
 *            ---   ----
 *            double double
 *            
 *            *** 주의점 (int이하 데이터형은 연산시에 int로 변경)
 *            char+byte = int
 *            char+char = int
 *            byte+byte = int 
 *               
 *       이항연산자 :
 *         = 산술연산자 (+,-,*,/,%)
 *              *** 우선 순위 *,/,% => + , -
 *              3+5*10 ==> 53
 *              (3+5)*10 ==> 80 
 *              => 7+"7"+(7-7); ==> "770"
 *                 -----
 *                 "77"+7
 *                 ------
 *                 "777"-7 => 오류 
 *                 7+"7"+7/7
 *                       ---
 *                        1
 *                 "771"
 *           + : 두개의 값을 더한다 (1+2=3)
 *               문자를 합쳐준다 ("7"+"7"="77")
 *           / : 정수/정수 = 정수 , 정수 / 실수
 *               정수/(double)정수
 *               int hit=135
 *               int count=10;
 *               hit/count ==> 13
 *               hit/(double)count ==> 13.5
 *               *** 0으로 나눌 수 없다(0으로 나눌 경우 => 오류 발생)
 *           % : 왼쪽 부호 
 *               => 윤년 구하기 , 숫자 자르기 ..., 배수 구하기 
 *           
 *         = 비교연산자 (==,!=,<,>,<=,>=) ==> 결과값은 true/false
 *           => 문자 , 정수 , 실수 
 *              'A' "A" ==> 자바는 Unicode를 사용 (모든 국가의 언어 사용이 가능)
 *                               한글자당 바이트 2byte
 *              '홍'(한글은 1글자당 2byte)
 *           == 같다 
 *           != 같지 않다 
 *           < 작다 (왼쪽 기준)
 *           > 크다 
 *           <= 작거나 같다
 *           >= 크거나 같다 
 *           ***날짜,문자열은 비교 할 수 없다 (자체 메소드)
 *         = 논리연산자 (&&, ||)
 *           && : 직렬연산자 (조건 2개가 true일경에만 true)
 *              (조건) && (조건)
 *              -----    -----
 *              주로 사용처 : 기간 , 범위가 포함된 상태 
 *           || : 병렬연산자 (조건 2개중에 한개이상 true일경우 true)
 *              (조건) || (조건) 
 *              -----    -----
 *              주로 사용처 : 잘못된 입력 
 *         = 대입연산자 (= , += , -=)
 *           = 일반 대입 
 *           += ===========> a+=1 ==> a=a+1 => 여러개 증가
 *                           a+=2  a+=3
 *           -=  =========> a-=1 ==> a=a-1
 *                          a-=10 a-=3
 *       삼항연산자: 조건연산자 ?:
 *       (조건)?값1:값2
 *       -----
 *        true => 값1
 *        false => 값2  ==> 페이징
 *       
 *   
 */
// 산술연산자 
// 정수 3개 입력을 받아서 총점 , 평균
import java.util.Scanner;// Scanner클래스를 가지고 온다 
// c => include 
// c# => using 
// 자바스크립트 => import 

public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;
		int total;
		double avg;
		// ============= 선언 (메모리 저장하는 공간만 만든다)
		// 메모리 공간에 값을 첨부 => 변수의 초기화 
		Scanner scan=new Scanner(System.in);
		//                       ---------- 키보드 입력 
		System.out.print("국어,영어,수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		// 활용할 수 있다 
		// new => 메모리에 저장 (클래스)
		// 연산처리 ==> 
		total=kor+eng+math;
		avg=total/3.0;
		// 결과 출력 
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println();
		System.out.print(avg>=90 && avg<100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<80?"C학점":"");
		System.out.print(avg>=60 && avg<70?"D학점":"");
		System.out.print(avg<60?"F학점":"");
         
	}

}
