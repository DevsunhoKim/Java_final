package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
 * throws => 선언 만 함 => 예외 회피
 * => method 뒤에 위치 => 라이브러리에서 주로 사용
 *                     --------- 자동 완성 기능 사용
 *  => throws , try~catch 이용
 *    예외처리의 중심은 "try~catch"
 *  --------------------------------------------
 *  주의점 
 *   void method() throws Exception , IOExceptoin , SQLException
 *   { 
 *   }
 *   
 *   ==> 사용
 *   void main() throws throws Exception , IOExceptoin , SQLException
 *   {
 *   }
 *   void main()
 *   {
 *     try
 *     {
 *     }catch (IOExceptoin e)
 *     {
 *     }catch(SQLException e)
 *     {
 *     }catch(Exception ex)  => Exception 하나로 통합 가능
 *   }
 *   
 *   ==> 가장 큰 예외처리로도 가능하다
 *   
 *   void main() throws Exception 
 *   {
 *   }
 *   void main()
 *   {
 *    try
 *    {
 *    }catch (Exception ex)
 *   }
 */
public class MainClass_1 {
	// 코딩이 많은 경우에 => throws (이미 만들어진 소스)
	// 시작 => try
    public void method() throws Exception,IOException,SQLException
    {
    	// 컴파일 통과
    	int i=Integer.parseInt("10 "); // 공백이 있으면 에러 발생
    	System.out.println(i);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();
		try
		{
		m.method();
		}catch (Exception ex)
		{
			
		}
		System.out.println("프로그램 종료");
	}

}
