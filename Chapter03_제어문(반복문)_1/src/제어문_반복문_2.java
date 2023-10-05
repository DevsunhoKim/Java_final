/*
 *   1차 for
 *   for(시작점;어디까지;몇씩증가)
 *       초기값  조건식  ++,+=
 *   예) 1~100
 *      int i=1 i<=100 i++
 *   예) 1~100 => 홀수
 *   -----------------------
 *   문자는 정수 (문자는 모든 연산시 => 정수 변수)
 *   for(int i=....
 *       ----- for문 {} 안에서만 사용이 가능하다 
 *    변수 사용 범위 {} 메모리 해제
 *    
 *    {
 *       int a=10;
 *       {
 *          int b=20;
 *          {
 *            int c=30;
 *          }
 *       }
 *    }
 *    
 *    중첩 for => 2차 for 
 *    
 *    for(초기값;조건식;증가식)
 *    {
 *       for(초기값;조건식;증가식)
 *       {        ------
 *          
 *       }
 *    }
 */
public class 제어문_반복문_2 {
    static int aaaa=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for(int i=1;i<=100;i+=2)
		//for(int i=2;i<=100;i+=2)
		//int i=1;
		/*
		 * for(int i=1;i<=100;i++) {
		 * 
		 * } //System.out.println(i);
		 */    
		for(int i=1;i<=4;i++)//줄수 
		{
			for(int j=1;j<=5-i;j++)//실제 출력물 
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
