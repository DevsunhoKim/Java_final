/*
 *    자바 제어문 종류 
 *    ------------
 *    조건문 
 *      = 단일 조건문 
 *        if(조건문) => true/false (부정연산자,논리연산자,비교연산자)
 *        {
 *           조건 true일때 수행하는 문장 
 *        }
 *        => 독립적인 경우 
 *      = 선택 조건문 => true / false 나눠서 처리 
 *        예) 로그인 => OX , 아이디중복체크 , 검색
 *        if(로그인이 되었다면)
 *        {
 *           //로그인된 경우
 *        }
 *        else
 *        {
 *           //로그인이 안된 상태
 *        } 
 *      = 다중 조건문 : 한개의 문장만 수행 
 *        if(조건문)
 *        {
 *           조건 true일때 수행 ==> 종료
 *           false면 
 *        }       |
 *        else if(조건문)
 *        {
 *           조건 true일때 수행 ==> 종료
 *           false면 
 *        }       |
 *        else if(조건문)
 *        {
 *           조건 true일때 수행 ==> 종료
 *           false면 
 *        }          |
 *        else 
 *        {
 *           해당 조건이 없는 경우 처리되는 문장 
 *        }
 *      
 *    선택문 : 한개의 값을 선택한 경우에 처리 
 *            별점...
 *           => 카테고리 , 메뉴 ...,서버 프로그램 
 *          switch(정수,문자,문자열)
 *          {
 *            case 값1:
 *              처리문장;
 *            case 값2:
 *              처리문장;
 *              break;
 *            case 값3:
 *              처리문장; 
 *            case 값4:
 *              처리문장; 
 *            case 값5:
 *              처리문장; 
 *            case 값6:
 *              처리문장; 
 *              break;
 *          }
 *    반복문 
 *      for : 횟수지정 => 배열 , 컬렉션 
 *                      ----------- 인덱스번호 => 일정하게 
 *                      => for문 (for-each)
 *                         for a of list
 *                         for i in 
 *            => 1차        |false종료
 *                    1    2     4
 *               for(초기값;조건식;증가식)
 *               {          |true
 *                  반복문장 3
 *               }
 *            => 2차 
 *               => 알고리즘 (2차) => SORT,등수구하기 ...
 *                    1     2     9
 *               for(초기값;조건식;증가식)
 *               {         3    4    6
 *                   for(초기값;조건식;증가식)
 *                   {
 *                      반복수행문장 5
 *                   }
 *                   줄바꿈 7
 *               }
 *                      
 *      while 
 *    반복제어문 
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={1,2,3,4,5};
        for(int a:arr)// 웹 출력 (목록)
        {
        	System.out.println(a);
        }
	}

}
