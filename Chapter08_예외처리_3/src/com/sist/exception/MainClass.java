package com.sist.exception;
/*
 *    1.자바 문법 
 *      => 변수 / 연산자 / 제어문 
 *      => 사용자 정의 클래스 
 *         => 멤버변수 / 메소드 / 생성자 
 *         => 클래스의 종류 => 인터페이스 
 *      => 에러방지 : 예외처리 
 *      예외처리 : 사전에 에러를 방지하는 프로그램 
 *               => 비정상 종료를 방지하고 정상수행 
 *      => 자바에서 지원 예외처리 
 *         1) 고려 => if => 예외처리 
 *         2) 예외처리 대상 
 *            CheckedExeption : 컴파일시에 예외처리가 되어 있는지 확인
 *            => 반드시 예외처리를 한다 
 *               io(입출력),net(네트워크), sql(오라클연결)
 *               => 웹 
 *            UnCheckException : 사용자의 입력에 따라 ...
 *         3) 예외처리 방법 
 *            -------------------------------------
 *            = 예외 복구 => 에러를 받아서 처리 => catch
 *              1. 형식 
 *              try
 *              {
 *                 => 정상수행 할 수 있는 소스 코드 
 *                 => 모든 소스,부분 소스
 *              }catch(예외처리 종류)
 *              {
 *                 => try에서 에러가 발생시 처리하는 문장 
 *                 => 복구는 거의 없다 
 *                 => 에러의 위치 
 *                    printStackTrace()
 *                 => 에러 정보
 *                    getMessage()
 *                 => 에러 수정 목적 
 *              }
 *              ----catch는 여러개 사용이 가능 => 전체 => Exception
 *              finally
 *              {
 *                 => 생략이 가능 
 *                 => 사용처 : 서버 종료 , 오라클 연결 해제 , 파일 닫기...
 *                 => 에러가 발생(O) , 에러 없는 경우 
 *                   ---------------------------
 *                   try수행 (정상 수행) , catch(에러가 있다) 
 *                   ----------------------------------
 *                               |
 *                            무조건 수행하는 문장  
 *              }
 *              
 *              동작 순서 
 *              try
 *              {
 *                 문장 1
 *                 문장 2
 *                 문장 3
 *              }
 *              catch(Exception e)
 *              {
 *                 문장 4
 *              }
 *              finally
 *              {
 *                 문장 5
 *              }
 *              
 *              => try에 에러가 없는 경우 
 *                  문장 1 = 2 = 3 = 5 => catch절은 통과
 *                                 --- finally는 수행하다 
 *                                 
 *              try
 *              {
 *                 문장 1
 *                 --------------------
 *                 문장 2 ==> 에러 발생 =======> catch이동 
 *                 문장 3
 *                 --------------------수행핮디 않는다 
 *              }
 *              catch(Exception e)
 *              {
 *                 문장 4
 *              }
 *              finally
 *              {
 *                 문장 5
 *              }
 *              
 *              => try에서 에러 발생 
 *              문장 1 => 4 => 5 
 *                      --    - finally 
 *                      catch
 *            = 예외 회피 => JVM에 미리 알려준다 => RuntimeException은 생략이 가능 
 *                      => 이런 에러가 발생할 수 있다
 *              문법)
 *                   메소드() throws 예외처리의 종류......
 *                   메소드() throws Exception,NumberFormatException
 *                          예외처리 순서가 없다 
 *                          => try~catch => 예외처리 순서 (상속도)
 *                          => throws => 예외처리 순서가 없다 
 *                          => throws문장을 사용할때는 try위치 => 
 *                                 이미 소스가 완료된 상태에서 에러 처리
 *                   *** 예외처리 목적 => 프로그램 종료
 *                        예) 로그인 => 입력이 안된 상태 => 종료 
 *                            => 개인 정보 누출  => 자바스크립트
 *                   => 라이브러리뒤에 많이 붙어 있다 
 *                      =========
 *                      1) throws 
 *                      2) try~catch를 이용할 수 있다 
 *                      
 *                      예)
 *                         void insert() throws Exception
 *                           => insert를 호출하기 위해서는 예외처리를 하고 사용한다
 *                         void method()
 *                         {
 *                            insert() ==> 오류 
 *                         }
 *                         
 *                         => void method() throws Exception
 *                            {
 *                               insert()
 *                            }
 *                            
 *                            void method()
 *                            {
 *                               try
 *                               {
 *                                  insert()
 *                               }catch(Exception ex){}
 *                            }
 *            -------------------------------------
 *            = 임의발생 => 테스트 
 *            = 지원하지 않는 예외 => 사용자 정의 예외
 *        
 *    2.라이브러리 => 암기 
 *      java.lang
 *       = Object , String , StringBuffer,Wrapper
 *      java.util 
 *       = Date , Calendar , StringTokenizer 
 *       = Collection 
 *         = ArrayList / HashSet / HashMap
 *      java.io
 *       = 업로드/다운로드 => 파일 관련 
 *      java.net => 흐름 (크롤링=>프로젝트) URL 
 *      -------------
 *      java.sql = 자바에서 오라클 연동 
 *        Connection / Statement / ResultSet 
 *      -------------
 */
public class MainClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}