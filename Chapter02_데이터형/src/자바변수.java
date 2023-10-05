/*
 *   25page 관리할 데이터를 저장하는 공간을 변수 
 *          ---------------------------- 한개만 저장이 가능하다 
 *   변수 : 변수명 => 소문자로 시작한다 
 *         식별자 (명명규칙) 
 *         1. 알파벳이나 한글로 시작한다 
 *            ---- 대소문자 구분 
 *            Abc abc ABC 
 *         2. 명칭의 갯수는 제한하지 않는다 
 *            => 3~7로 압	축 
 *            a , b , c  => kor , math , eng
 *         3. 숫자는 사용이 가능하다 
 *            앞에 사용은 불가능 
 *            2a ...(X)  a2 , a2b...
 *         4. 특수문자 사용이 가능 ( $ , _ )
 *            _는 많이 사용한다 
 *            file_name , file_count...
 *            _name , _count => 임시변수 
 *         5. 변수명에는 공백을 사용할 수 없다 
 *            file name
 *         6. 키워드는 사용 할 수 없다 
 *            ----- 자바에서 사용하는 단어 
 *            
 *            int int
 *    변수 
 *     1) 선언
 *        데이터형 변수명;
 *        ------
 *        int a;  ==> 4byte메모리공간을 만들고 이름을 a로 부여한다 
 *     2) 초기값을 부여 
 *        a=100;
 *        
 *     3) 동시 => int a=100; (사용빈도가 많다) 
 *     
 *     4) 값읽기 / 값 변경 
 *        ------------- 읽기(값을 가지고 온다)/쓰기(저장)/수정
 *        
 *     26page 
 *     형식)
 *        데이터형 변수명 
 *        ------ ---- 명명규칙 
 *        fileName , file_name
 *        
 *        정수값을 저장한다 (200)
 *        int num=200
 *        --- --- --- ㅣ 리터럴 
 *         |   | 변수
 *        데이터형 
 *        
 *      => 프로그램 개발 : 가독성 , 퍼포먼트 (속도)
 *                      ----- 리펙토링 (SI/SM)
 *                      
 *        no => music_no => mno
 *        
 *        for(int i=1;i<=10;i++)
 *        {
 *           for(int j=1;j<=i;j++)
 *           {
 *              System.out.print("*")
 *           }
 *           System.out.println();
 *        }
 *        
 *        System.out.println("*")
 *        System.out.println("**")
 *        System.out.println("***")
 *        System.out.println("****")
 *        
 *        i   j  ==> 역순 +  i+j=5 ==> j=5-i
 *        1   4  5
 *        2   3  5
 *        3   2  5
 *        4   1  5=> i=j
 *          4      8
 *        float f=10.5F;
 *        
 *        long l=100
 *        
 *        char a=65
 *                               1     1.000000
 *                                     1.000001
 *        byte < char  < int < long < float < double
 *               short         -------------
 *               => 메모리 크기(X) => 수표현 
 *               
 *        각 데이터형 표현법 
 *        byte 
 *           byte b=100;
 *           int i=100;
 *           long l=100L; long l=200 ==> 200L
 *         char 
 *           char c='A' , char c=65 ('A')
 *         boolean
 *           boolean b=true;  b=false;
 *         float
 *           float f=10.5F
 *                   ----- double
 *         double 
 *           double d='A'  d=65.0
 *           double d=10   d=10.0
 *           double d=10.5F d=10.5
 *           double d=10L   d=10.0
 *           
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte=127;
		int _int=20000;
		long _long=20000;// 20000L
		float _float=10.5f;
		double _double=100; //100.0 => 자동 형변환 
		char _char=65; // 'A'
		boolean _boolean=true;
		
		System.out.println("_byte:"+_byte);
		// + (산술) +(문자열 결합)
		System.out.println("_double:"+_double);
		System.out.println("_char:"+_char);
		
	}

}
