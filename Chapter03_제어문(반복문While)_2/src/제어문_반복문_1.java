/*
 *   while => 1차 
 *   ------------ 응용 (파일 읽기,데이터베이스(오라클연동))
 *   일반 프로그램의 반복문 (for)
 *   형식)
 *        초기값 ====== 1
 *        while(조건식) 2 ==> 무한루프 (while(true))
 *        {
 *          반복 수행 문장 3
 *          증가식 4 ========> 2번으로 이동 
 *                           --- false종료 
 *                           --- true문장 수행 
 *        }
 *        
 *        ==> 응용 
 *        for()
 *        {
 *          for()
 *          {
 *          }
 *        }
 *        ----------------
 *        for()
 *        {
 *           while()
 *           {
 *              if()
 *              {
 *                 for()
 *                 {
 *                 }
 *              }
 *           }
 *        }
 *        ---------------   
 */
// 1~100까지의 짝수의 합,홀수의 합 
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0,odd=0;
        int i=1;
        while(i<=100)
        {
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        	
        	i++;
        }
        System.out.println("1~100까지의 짝수의 합:"+even);
        System.out.println("1~100까지의 홀수의 합:"+odd);
	}

}
