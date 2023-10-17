package com.sist.main;
/*
 *  재사용 기법
 *  -------- 기존의 클래스를 사용 (라이브러리)
 *  => 라이브러리는 상속보다는 포함
 *     -------
 *     | 상속을 할 수 없는 클래스 => 종단 클래스
 *       종단 클래스 : public final class ClassName
 *       --------------------------------------
 *        => java.lang 에 많이 분포 (p220)
 *           String , Math , System , StringBuffer ....
 *           => 변경할 수 없다 (완제품)
 *     
 *     => 상속 (is-a)
 *     => 포함 (has-a)
 *     --------------------- 클래스를 비교할 수 있다
 *     
 *     class A
 *     {
 *      int a,b,c,d,e,f;
 *     }
 *     class B
 *     {
 *     	int a,b;
 *     }
 *     
 *     A > B(크기를 잴 수 없다) ==> 오류 발생
 *     
 *     class A
 *     {
 *     }
 *     class B extends A
 *     {
 *     }
 *     범위 => 공통성 
 *     A > B     long(8byte) < float(4byte) => 수표현
 *                    1         1.0000
 *                    
 *                   식물
 *                   |
 *                   나무
 *                   |
 *           ---------------------
 *           |                    |
 *          침엽수                 활엽수
 *          
 *          식물 > 나무 > 침엽수 ,활엽수
 *          
 *  class A
 *  class B
 *  {
 *   A a;
 *  }
 *  => 포함 클래스 (A<B)
 *  
 *  => 포함 : 변경없이 있는 그래도 사용
 *  => 상속 : 변경이 필요한 부분 => 오버라이딩
 *  
 *  예)  윈도우 => 자동차 모양으로 윈도우 변경해서 사용
 *           => 상속
 *       윈도우 => 사각형으로 사용
 *           => 포함
 *           class Login
 *           {
 *           	JFrame fr=new JFrame();
 *              // 메소드에 선언하는 것은 포함 클래스가 아니다
 *              public void display()
 *              {
 *              	JFrame fr=new JFrame(); ==> 지역변수 (포함 클래스 아님)
 *              }
 *           }
 *           
 *           Login log=new Login();
 *           log.fr.메소드();
 *           
 *           ==> 포함 클래스가 많다
 *     
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
