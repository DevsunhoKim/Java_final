package com.sist.manager;
import java.util.*;
import java.io.*;

import com.sist.vo.BookHouseVO3;

public class BookManager3 {
	private static ArrayList<BookHouseVO3> flist=new ArrayList<BookHouseVO3>();

	static
	{
		FileReader fr=null;
		ObjectOutputStream ois=null;
		FileOutputStream fis=null;
		try
		{
			// 정상수행문장
			fr=new FileReader("c:\\java_data\\book.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			
			String[] cates=data.split("\n");
			for(String s:cates)
			{
				StringTokenizer st=new StringTokenizer(s, "|");
				BookHouseVO3 vo=new BookHouseVO3();
				vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
				vo.setName(st.nextToken());
				vo.setAuthor(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setPubl(st.nextToken());
				flist.add(vo);
			}
			
			//fis=new FileOutputStream("c:\\java_data\\bc.txt");
			//ois=new ObjectOutputStream(fis);
			//ois.writeObject(cList);
			
		}catch(Exception ex)
		{
			// 에러 확인후 복구
		}
		finally
		{
			// 무조건 수행하는 문장 (파일 닫기 , 서버 닫기)
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
//		FileInputStream fis=null;
//		ObjectInputStream ois=null;
//		try
//		{
//			fis=new FileInputStream("c:\\java_data\\bc.txt");
//			ois=new ObjectInputStream(fis);
//			cList=(ArrayList<BookCategoryVO3>)ois.readObject();
//		}catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				fis.close();
//				ois.close();
//			}catch(Exception ex) {}
//		}
//	FileReader fr=null;
////	FileInputStream fis=null;
////	ObjectInputStream ois=null;
//	StringBuffer sb=new StringBuffer();
//	String data="";
//	try
//	{
//		fr=new FileReader("c:\\java_data\\book.txt");
//		int i=0;
//		while((i=fr.read())!=-1)
//		{
//			sb.append((char)i);
//		}
//		String[] fd=sb.toString().split("\n");
//		System.out.println(fd.length);
//		for(String s:fd)
//		{
//			try
//			{
//				s=s.substring(0,s.indexOf("?"));
//				StringTokenizer st=new StringTokenizer(s,"|");
//				
//				BookHouseVO3 vo=new BookHouseVO3();
//				vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//				//vo.setCno(Integer.parseInt(st.nextToken()));
//				vo.setName(st.nextToken());
//				vo.setAuthor(st.nextToken());
//				vo.setPoster(st.nextToken());
//				vo.setPubl(st.nextToken());
//				vo.setScore(Double.parseDouble(st.nextToken()));
//				//vo.setPrice(st.nextToken());
//				flist.add(vo);
//			}catch(Exception ex) {}
//		}
//		System.out.println(sb.toString());
//		FileOutputStream fos=new FileOutputStream("c:\\java_data\\bh.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(flist);
//		fos.close();
//		oos.close();
//		System.out.println("저장완료!!");
//	}catch(Exception ex)
//	{
//		ex.printStackTrace();		
//	}
//	finally
//	{
//		try
//		{
//			fis.close();
//			fr.close();
//		}catch(Exception ex) {}
//	}
////	FileInputStream fis=null;
////	ObjectInputStream ois=null;
//	try
//	{
//		fis=new FileInputStream("c:\\java_data\\bc.txt");
//		ois=new ObjectInputStream(fis);
//		flist=(ArrayList<BookHouseVO3>)ois.readObject();
//	}catch(Exception ex)
//	{
//		ex.printStackTrace();
//	}
//	finally
//	{
//		try
//		{
//			fis.close();
//			ois.close();
//		}catch(Exception ex) {}
//	}
//}
//	public static void main(String[] args) {
//		BookManager3 fm=new BookManager3();
//		for(BookHouseVO3 vo:flist)
//		{
//			System.out.println("번호:"+vo.getFno());
//			//System.out.println("참조번호:"+vo.getCno());
//			System.out.println("도서명:"+vo.getName());
//			System.out.println("작가명:"+vo.getAuthor());
//			System.out.println("출판사:"+vo.getPubl());
//			//System.out.println("가격:"+vo.getPrice());
//			System.out.println("=======================");
//		}
//	}
	public static void main(String[] args) {
		BookManager3 fm=new BookManager3();
		System.out.println("저장 완료!!!");
		for(BookHouseVO3 vo:flist)
		{
			System.out.println(vo.getFno());
			System.out.println(vo.getName());
			System.out.println(vo.getAuthor());
			System.out.println(vo.getPoster());
			System.out.println(vo.getPubl());
			System.out.println("====================");
		}
	}
	
	public ArrayList<BookHouseVO3> bookCategoryData(int no)
	{
		ArrayList<BookHouseVO3> list=new ArrayList<BookHouseVO3>();
		int start=0;
		int end=0;
		
		if(no==1)
		{
			start=0;
			end=11;
		}
		else if(no==2)
		{
			start=12;
			end=17;
		}
		else if(no==3)
		{
			start=18;
			end=29;
		}
		for(int i=start;i<=end;i++)
		{
			list.add(flist.get(i));
		}
		
		return list;
	}
//	public BookCategoryVO3 categoryInfodData(String title)
//	{
//		BookCategoryVO3 vo=new BookCategoryVO3();
//		for(BookCategoryVO3 fvo:cList)
//		{
//			if(fvo.getTitle().equals(title))
//			{
//				vo=fvo;
//				break;
//			}
//		}
//		return vo;
//	}
//	public ArrayList<BookHouseVO3> bookHouseListData(int cno)
//	{
//		ArrayList<BookHouseVO3> list=new ArrayList<BookHouseVO3>();
//		for(BookHouseVO3 fvo:flist)
//		{
//			if(fvo.getCno()==cno)
//			{
//				list.add(fvo);
//			}
//		}
//		return list;
//	}
	public BookHouseVO3 bookInfoData(int fno)
	{
		BookHouseVO3 vo=new BookHouseVO3();
		for(BookHouseVO3 fvo:flist)
		{
			if(fvo.getFno()==fno)
			{
				vo=fvo;
				break;
			}
		}
		return vo;
	}
	public BookHouseVO3 bookInfoData(String name)
	{
		BookHouseVO3 vo=new BookHouseVO3();
		System.out.println("bookInfoData:"+name);
		for(BookHouseVO3 fvo:flist)
		{
			System.out.println("for:"+fvo.getName());
			if(fvo.getName().equals(name))
			{
				vo=fvo;
				break;
			}
		}
		return vo;
	}
	public ArrayList<BookHouseVO3> bookFindData(String title)
	{
		ArrayList<BookHouseVO3> list=new ArrayList<BookHouseVO3>();
		for(BookHouseVO3 fvo:flist)
		{
			if(fvo.getName().contains(title))
			{
				list.add(fvo);
			}
		}
	return list;

	}
}