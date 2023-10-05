/*
 *   자바 => 형식 
 *   1) 변수 : 한개의 데이터를 저장할 메모리 공간의 이름 
 *            ----------
 *      변수 선언 
 *       데이터형 변수명;  
 *       ------   |
 *         |      |
 *         1)    2)
 *      변수 초기값 
 *      1. 자바에서 제공하는 데이터형 (기본형)
 *         정수형 
 *           byte (1byte) => -128~127 => 8bit (bit:0,1)=> 숫자표현
 *                                       2진법 
 *                => 파일 읽기 / 파일 쓰기 / 업로드 / 다운로드 / 네트워크 통신
 *           int (4byte) => 32bit => 정수의 default (가장 많이 사용)
 *           long (8byte) => 64bit => 빅데이터(라이브러리=> long)
 *                        => 금융권 
 *           ========***** int/long => 100L(l) 
 *         실수형
 *           float (4byte) => 소수점이하 6자리 => 10.7F(f)
 *           double (8byte) => 소수점이하 15자리 => 10.5D(d)
 *                                                  ----- 생략이 가능
 *           => 숫자 사용 (정수 :int, 실수:double)
 *           float f=10.5 => 10.5f
 *                   ---- double 
 *         문자형
 *           char (2byte) => 0~65535 (모든 나라의 언어 사용이 가능)
 *                           UniCode (한글은 1글자당 2byte)
 *                           -------
 *                              | 문자 한개당 번호로 되어 있다 
 *           ***** char는 연산 처리가 되면 정수로 변경된다 
 *           'A'+1
 *           ---
 *            65 +1 => 66
 *            
 *            10+10.5 = 20.5 => 자바에서는 항상 같은 데이터형만 연산이 가능 
 *            ---
 *            10.0 + 10.5
 *            
 *            'A'+10.5
 *            ---
 *            65.0+10.5 ==> 75.5
 *            char+int
 *            ---- int
 *            
 *            double+char
 *                   ---- double
 *         논리형 
 *            계산용이 아니다 => true/false만 저장이 가능 (조건문)
 *         ---------
 *         참조형 (사용자 정의) => 배열 / 클래스
 *         
 *         데이터형 크기 (boolean제외)
 *         
 *         byte < char < int < long < float < double 
 *         -----------------------------------------
 *         ** 연산처리 (결과값은 가장 큰 데이터형이 결과값이다)
 *         byte + int + long => long
 *         int + float + double => double
 *         byte + char => int
 *         *** int 이하 데이터형의 연산 결과값은 int 
 *         
 *      2. 식별자 (구분) 
 *         {같은 이름의 변수를 설정할 수 없다}
 *         
 *         => 문법사항
 *         1) 알파벳이나 한글로 시작한다 
 *            국어점수 , kor ...
 *         2) 알파벳의 경우 => 대소문자 구분 
 *            kor / Kor / KOR
 *         3) 숫자 사용이 가능 (단 앞에 사용 금지)
 *            3b , 35g => 오류 
 *            b3 , g3a4b... a11111111111111111111
 *            => 변수의 갯수는 제한이 없다 (3~7글자)
 *         4) 특수 문자 사용이 가능 
 *            _ , $ ($는 거의 사용빈도가 없다)
 *            -- 임시변수 , 단어가 두개이상 
 *               _temp , file_name...
 *         5) 키워드는 사용이 불가능 하다 
 *            int , double , char...
 *            int _int (빨간색)
 *         6) 변수의 공백이 있으면 안된다
 *         
 *     1) 선언 
 *        데이터형 변수명;
 *        (int,double...)
 *        
 *        문자 변수 선언
 *        char 변수명
 *        정수 선언
 *        int(long) 변수명 
 *        실수 선언
 *        double 변수명 
 *        논리형 선언
 *        boolean 변수명 
 *        
 *     2) 같은 데이터형이 여러개 
 *        정수 
 *          int a,b,c,d
 *        논리
 *          boolean a,b,c,d
 *        문자 
 *          char a,b,c,d
 *          
 *     3) 변수 => 반드시 사용전에 초기화 
 *        int a=0;
 *        double d=0.0;
 *        char c=' ';
 *        boolean bb=false;
 *        float f=0.0f
 *        long l=0L
 *        
 *     4) 상수선언 => 변경할 수 없다
 *        final int ABC=100 => 상수명은 대문자로 설정한다
 *        int b=200 => 변경해서 사용이 가능 
 *            
 *     ----------------------------------------37page       
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println((int)'홍');
        // '0' => 48 '1'=> 49  'A'=65 'B'=66 'a'=97 'b'=98
        byte b1=95;
        byte b2=45;
        // 140
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
        System.out.println(Integer.toBinaryString(140));
	}

}
