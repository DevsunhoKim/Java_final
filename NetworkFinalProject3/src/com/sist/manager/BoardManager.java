package com.sist.manager;
// 파일 입출력 
import java.util.*; // ArrayList , Date

import com.sist.vo.BoardVO;

import java.text.*; // SimpleDateFormat
import java.io.*;// File관련 => ObjectInputStream/ObjectOutputStream
public class BoardManager {
   // 게시물 목록 => 모아서 관리 
   private static ArrayList<BoardVO> bList=
		            new ArrayList<BoardVO>();
   // 값을 채운다 
   static
   {
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   try
	   {
		   fis=new FileInputStream("c:\\java_data\\board.txt");
		   ois=new ObjectInputStream(fis);
		   bList=(ArrayList<BoardVO>)ois.readObject();
	   }catch(Exception ex)
	   {
		   // 에러 위치 체크
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fis.close();
			   ois.close();
		   }catch(Exception ex){}
	   }
   }
   // 목록 출력 
   public ArrayList<BoardVO> boardListData(int page)
   {
	   ArrayList<BoardVO> list=
			   new ArrayList<BoardVO>();
	   int j=0;
	   int rowSize=10;//화면에 출력하는 갯수 
	   int pagecnt=(page*rowSize)-rowSize;
	   /*
	    *   1page => 0~9  skip
	    *   2page => 10~19
	    *   3page => 20~29...
	    *   
	    */
	   // 오라클 => 인라인뷰 
	   // MySQL => LIMIT 
	   
	   for(int i=0;i<bList.size();i++)
	   {
		   if(j<10 && i>=pagecnt)
		   {
			   BoardVO vo=bList.get(i);
			   list.add(vo);
			   j++; //10개씩만 저장 
		   }
	   }
	   return list;
   }
   public int boardTotalPage()
   {
	   return (int)(Math.ceil(bList.size()/10.0));
	   
	   // ceil => 올림 => 소수점이 0이 아닌 경우에 올려간다 
   }
   // 데이터 추가 ===
   public void boardInsert(BoardVO vo)
   {
	   bList.add(vo); // 메모리 => 프로그램 종료시 사라진다 
	   fileSave();
   }
   public void fileSave()
   {
	   FileOutputStream fos=null;
	   ObjectOutputStream oos=null;
			   
	   try
	   {
		   fos=new FileOutputStream("c:\\java_data\\board.txt");
		   oos=new ObjectOutputStream(fos);
		   oos.writeObject(bList);
	   }catch(Exception ex)
	   {
		   // 에러 위치 확인 
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fos.close();
			   oos.close();
		   }catch(Exception ex) {}
	   }
   }
   // 상세보기 
   // 수정하기 ===
   // 삭제하기 ===  동일 코딩 ==> 파일에 저장 
   // 검색하기 
   // 자동 증가번호 만들기 => 스퀀스 
   // SELECT MAX(no)+1 FROM board
   public int boardSequence()
   {
	   int max=0;
	   for(BoardVO vo:bList)
	   {
		   if(vo.getNo()>max)
		   {
			   max=vo.getNo();
		   }
	   }
	   return max+1;
   }
   // 공통 => 파일 저장 
   
}