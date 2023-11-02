package com.sist.manager;
// 파일 입출력
import java.util.*;   //ArrayList , Date

import com.sist.vo.BoardVO3;

import java.text.*;   //SimpleDateFormat
import java.io.*;     //File 관련 => ObjectInputStream / ObjectOutputStream
public class BoardManager3 {
	// 게시물 목록 => 모아서 관리
	private static ArrayList<BoardVO3> bList=new ArrayList<BoardVO3>();
//          ------ 공통으로 쓰겠다(게시판 글 올리면 다 생겨야함)
	//값을 채운다
	static
	{
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis=new FileInputStream("c:\\java_data\\board3.txt");
			ois=new ObjectInputStream(fis);
			bList=(ArrayList<BoardVO3>)ois.readObject();
		}catch(Exception ex)
		{
			//에러 위치 체크
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// 목록 출력
	public ArrayList<BoardVO3> boardListData(int page)
	{
		ArrayList<BoardVO3> list=new ArrayList<BoardVO3>();
		int j=0;
		int rowSize=10;   //화면에 출력하는 게시물 갯수
		int pagecnt=(page*rowSize)-rowSize;
		/*
		 *   1page => 0~19
		 *   2page => 20~39
		 *   3page => 40~59...
		 */
		
		// 오라클 => 인라인뷰
		// MySQL => LIMIT
		for(int i=0;i<bList.size();i++)
		{
			if(j<10 && i>=pagecnt)
			{
				BoardVO3 vo=bList.get(i);
				list.add(vo);
				j++;
			}
		}
		return list;		
	}
	public int boardTotalPage()
	{
		return (int)(Math.ceil(bList.size()/10.0));
	}
	// 데이터추가 ===
	public void boardInsert(BoardVO3 vo)
	{
		bList.add(vo);   // 메모리 => 프로그램 종료시 사라진다 ---> 파일에 저장시키기
		fileSave();
	}
	public void fileSave()
	{
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try
		{
			fos=new FileOutputStream("c:\\java_data\\board3.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(bList);
		}catch(Exception ex)
		{
			//에러 위치 확인
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
	public BoardVO3 boardDetailData(int no)
	{
		BoardVO3 vo=new BoardVO3();
		for(int i=0;i<bList.size();i++)
		{
			BoardVO3 bVO=bList.get(i);
			if(bVO.getNo()==no)
			{
				bVO.setHit(bVO.getHit()+1);
				vo=bVO;
				fileSave();
				break;
			}
		}
		return vo;
	}
	// 수정하기 ===
	public BoardVO3 boardUpdatedata(int no)
	{
		BoardVO3 vo=new BoardVO3();
		for(BoardVO3 bVO:bList)
		{
			if(bVO.getNo()==no)
			{
				vo=bVO;
				break;
			}
		}
		return vo;
	}
	public String boardUpdate(BoardVO3 vo)
	{
		String result=""; 
		for(int i=0;i<bList.size();i++)
		{
			BoardVO3 pVO=bList.get(i);
			if(pVO.getNo()==vo.getNo())
			{
				if(pVO.getPwd().equals(vo.getPwd()))
				{
					result="YES";
					pVO.setContent(vo.getContent());
					pVO.setName(vo.getName());
					pVO.setSubject(vo.getSubject());
					fileSave();
				}
				else
				{
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	// 삭제하기 ===  동일한 코딩 ===> 파일에 저장
	public String boardDelete(int no,String pwd)
	{
		String result="";   // NO , YES
		for(int i=0;i<bList.size();i++)
		{
			BoardVO3 vo=bList.get(i);
			if(vo.getNo()==no)
			{
				if(vo.getPwd().equals(pwd))
				{
					result="YES";
					bList.remove(i);
					fileSave();
				}
				else
				{
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	// 검색하기
	// 자동 증가 번호 만들기 => 스퀀스
	// SELECT MAX(no)+1 FROM board
	public int boardSequence()
	{
		int max=0;
		for(BoardVO3 vo:bList)
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
