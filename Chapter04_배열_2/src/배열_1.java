/*
 *   ** 변수는 1개만 저장하는 공간 
 *      ---- 많은 경우에 변수를 제어하기 어렵다 
 *      ---- 보완 : 한개의 이름으로 여러개의 변수를 제어 
 *                 -------- 배열명 ==> 인덱스번호로 제어 
 *   1. 배열 : 여러개의 변수를 하나로 묶어서 관리하는 역할 
 *            1차원 배열 / 2차원 배열 .... 다차원배열 , 가변배열 
 *            -------- 웹에서는 1차원만 사용 
 *      장점 : 한개의 변수명으로 모아서 관리하기 때문에 반복문 사용이 쉽다
 *            연속적인 메모리 구조 => 인덱스번호를 이용한다  
 *      단점 : 고정적이다 => 한번 메모리 할당을 하면 변경하기 어렵다 
 *            => 기존의 배열보다 크게 배열 만들어 처리 
 *            => 보완 : 컬렉션 (가변형) *******
 *                     ------------
 *                     웹) 1. 기본문법 
 *                         2. 클래스 설계
 *                         3. 데이터베이스 연동 
 *                         4. Front
 *            => 같은 데이터형만 모아서 관리 
 *      배열)
 *        1. 선언 
 *           데이터형[] 배열명;
 *           데이터형 배열명[];
 *        2. 초기값 
 *           = 생성동시에 초기화 
 *             int[] arr={1,2,3,4,5}
 *                       ----------- 배열 갯수 5개 생성 
 *           = 자동 초기화 
 *             int[] arr=new int[5];
 *             ---------------------
 *              int => 0
 *              double => 0.0
 *              float => 0.0f
 *              long => 0l
 *              boolean => false
 *              char => '\u0000' => null문자
 *                      '\0'
 *              String => null
 *                        ----- 주소가 없는 경우 
 *                        NullPointerException
 *           메모리 주소 
 *           int[] arr={1,2,3,4,5};
 *           ---------
 *           
 *           Stack(주소)    Heap(실제 데이터 저장)
 *           arr
 *           ----       --------------------------------
 *          0x100  ==>    1     2     3     4     5
 *           ----      |------|------|-----|-----|------
 *                    0x100 0x104  0x108 0x112  0x116
 *                      arr[0] arr[1] arr[2] arr[3] arr[4]
 *                    연속적인 메모리의 시작 주소
 *                    arr[index]
 *                    --- -----> 연속적으로 배치(몇번째)
 *                    배열명
 *                    
 *                    * 인덱스번호는 0번부터 시작 
 *                    * 순차적으로 되어 있다 
 *                    * 배열의 인덱스 추가, 삭제 => 불가능 
 *                    * 주의점 : 인덱스 초과시에 에러 발생 
 *                      int[] arr=new int[5] 
 *                        0  1 2 3 4
 *                      arr[5]=100 => 오류 발생
 *                    * 갯수 => length
 *           => 각 데이터형별 생성 
 *              int[] arr
 *              double[] arr
 *              char[] arr
 *              boolean[] arr
 *              String[] arr
 *           => 배열 => 변수 
 *              ----------
 *              변수) 읽기 , 저장 , 수정 
 *                        -----------
 *                   int a=10; 저장 (a공간에 10 저장)
 *                   a=20; 수정 
 *                   System.out.println(a) => 읽기 
 *              배열) 읽기 , 수정 , 저장 
 *              int[] arr=new int[5];
 *              수정 
 *              arr[index번호]=10
 *              -------------
 *              arr[0]=10; arr[1]=20...
 *              System.out.println(arr[0])
 *              System.out.println(arr)
 *                                ------ 주소값만 출력  
 *                      
 *        3. 활용 => 인덱스 0~ 
 *           = 값을 변경 , 수정 => 일반 for
 *             int[] arr=new int[5];
 *             for(int i=0;i<arr.length;i++)
 *             {  -------- 인덱스 번호 
 *               arr[i]=i;
 *             }
 *           = 값을 출력 => for-each
 *             => 코드가 간결하다 , 처리속도가 빠르다 
 *             for(int a:arr) 10,20,30,40,50
 *             {  -------
 *                인덱스번호가 아니라 실제 저장된 값 
 *             }
 *             
 *      => 변수 (데이터 저장 공간)
 *         = 변수 
 *         = 배열 
 *           |
 *          구조체 (X)
 *         = 클래스 
 *         -------
 *            
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수 5개 
		int[] arr=new int[1000];
		arr[0]=100;
	    arr[3]=400;
	    // 100,20,30,400,50
	    // 출력 
	    System.out.println("=== 일반 for문 ===");
	    long s=System.currentTimeMillis();
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    long e=System.currentTimeMillis();
	    System.out.println("걸린 시간:"+(e-s));
	    
	    System.out.println("=== for-each문 ===");
	    s=System.currentTimeMillis();
	    for(int i:arr)
	    {
	    	System.out.println(arr[i]);
	    }
	    e=System.currentTimeMillis();
	    System.out.println("걸린 시간:"+(e-s)); 
	}

}
