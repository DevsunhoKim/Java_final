/*
 *    break : 반복 중단 
 *            게임 => ESC (반복문,switch)
 *    continue : 특정부분을 제외 
 *    ---------------------- 반복문에서만 사용이 가능 
 *    *** 제어영역 => 자신의 반복문 
 *    for()
 *    {
 *      for()
 *      {
 *        break; ======> 2차 for문 제어
 *      }
 *      break; ====> 1차 for문 제어 
 *    }
 *    ---------------------------------------
 *    outer:for()
 *    {
 *      for()
 *      {
 *        break outer; ======> 2차 for문 제어
 *      }
 *      
 *    }
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // break => 반복문 종료 
		/*
		 *    for(int i=1;i<=10;i++)
		 *    {
		 *       if(i==3)
		 *          break;
		 *       System.out.println("i="+i);// if소속문장이 아니다    
		 *    }
		 */
		/*for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				// 소스 코딩이 가능
				break; // i가 3이면 종료 (반복)
				// 소스 코딩이 불가능 
				
			}
			System.out.println("i="+i);
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==3)
				continue;// => 증가식으로 이동 
			/*
			 *   for
			 *   while 
			 *   ------- break는 동일 
			 *   continue 
			 *   --------- 
			 *      for => 증가식
			 *      while => 조건식 
			 *      ---------------- 무한루프가 될 수 있다
			 *        => 처음부터 다시 실행할 경우에 주로 
			 *              
			 *   
			 */
			System.out.println("i="+i);
			// 1 2 4 5 6 7 8 9 10
		}
		System.out.println("====== while ======");
		/*int i=1;
		while(i<=10)
		{
			if(i==3)
				break;
			System.out.println("i="+i);
			i++;
		}*/
		int i=1;
		while(i<=10)
		{
			if(i==3)
				continue;// 조건식으로 이동 
			System.out.println("i="+i);
			i++;
		}
	}

}
