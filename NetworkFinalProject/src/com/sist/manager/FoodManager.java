package com.sist.manager;
import java.util.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

import java.io.*;
public class FoodManager {
   private static ArrayList<FoodCategoryVO>
        cList=new ArrayList<FoodCategoryVO>();
   private static ArrayList<FoodHouseVO>
        fList=new ArrayList<FoodHouseVO>();
   /*
    *         Throwable 
    *         ---------
    *            |
    *     -------------------------------
    *     |                             |
    *    Error                     Exception 
    *                                  |
    *                ---------------------------------
    *                |                               |
    *              CheckedException       UnCheckedException
    *              ----------------      -------------------
    *              컴파일시에 예외처리 확인      예외처리 확인(X)
    *              ------------------    -------------------
    *               java.io                  java.lang
    *               java.net                 java.util
    *               java.sql
    *      목적 : 에러를 사전에 방지 
    *            에러시 정상 수행을 할 수 있게 만든다 
    */
   // 초기화 블록 => static 변수가 있는 경우에 주로 사용 
   // 자동 수행이 된다 , 상속은 안된다 
   static
   {
	   /*FileReader fr=null;
	   ObjectOutputStream ois=null;
	   FileOutputStream fis=null;
	   try
	   {
		   // 정상 수행 문장 
		   fr=new FileReader("c:\\java_data\\food_category.txt");
		   String data="";
		   int i=0;
		   while((i=fr.read())!=-1)//-1 (EOF)
		   {
			   data+=(char)i;
		   }
		   fr.close();
		   
		   String[] cates=data.split("\n");
		   for(String s:cates)
		   {
			   StringTokenizer st=new StringTokenizer(s,"|");
			   
			   FoodCategoryVO vo=new FoodCategoryVO();
			   vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
			   vo.setTitle(st.nextToken());
			   vo.setSubject(st.nextToken());
			   vo.setPoster(st.nextToken());
			   cList.add(vo);
		   }
		   
		   fis=new FileOutputStream("c:\\java_data\\fc.txt");
		   ois=new ObjectOutputStream(fis);
		   ois.writeObject(cList);
		   
	   }catch(Exception ex)
	   {
		   // 에러 확인후 복구
		   ex.printStackTrace();
	   }
	   finally
	   {
		   // 무조건 수행하는 문장 => 파일 닫기 , 서버 닫기
		   try
		   {
			   fis.close();
			   ois.close();
		   }catch(Exception ex) {}
	   }*/
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   try
	   {
		   fis=new FileInputStream("c:\\java_data\\fc.txt");
		   ois=new ObjectInputStream(fis);
		   cList=(ArrayList<FoodCategoryVO>)ois.readObject();
	   }catch(Exception ex)
	   {
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
	   /*
	    *  1|
	    *  1|
	    *  가양칼국수버섯매운탕
	    *  |4.3|
	    *  서울특별시 영등포구 국제금융로 78 
	    *  홍우빌딩 B1 지번 서울시 영등포구 
	    *  여의도동 43-3 홍우빌딩 B1
	    *  |02-784-0409
	    *  |국수 / 면 요리
	    *  |만원-2만원
	    *  |유료주차 가능
	    *  |11:30 - 21:30
	    *  |가양칼국수버섯매운탕 12,000원 샤브 소고기 (200g) 
	    *  12,000원
	    *  |https://mp-seoul-image-production-s3.mangoplate.com/52481_1621066187997112.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725902210805.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725904425496.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491189261172.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491193055171.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80

	    */
	   /*FileReader fr=null;
	   //BufferedReader br=null;
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   StringBuffer sb=new StringBuffer();
	   String data="";
	   try
	   {
		   
		   fr=new FileReader("c:\\java_data\\food_house.txt");
		   int i=0;
		   while((i=fr.read())!=-1)
		   {
			   sb.append((char)i);
		   }
		   String[] fd=sb.toString().split("\n");
		   System.out.println(fd.length);
		   for(String s:fd)
		   {
			  try
			  {
			   s=s.substring(0,s.indexOf("?"));
			   StringTokenizer st=
					   new StringTokenizer(s,"|");
			   
			   FoodHouseVO vo=new FoodHouseVO();
			   vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
			   vo.setCno(Integer.parseInt(st.nextToken()));
			   vo.setName(st.nextToken());
			   vo.setScore(Double.parseDouble(st.nextToken()));
			   vo.setAddress(st.nextToken());
			   vo.setPhone(st.nextToken());
			   vo.setType(st.nextToken());
			   vo.setPrice(st.nextToken());
			   vo.setParking(st.nextToken());
			   vo.setTime(st.nextToken());
			   vo.setMenu(st.nextToken());
			   vo.setPoster(st.nextToken());
			   fList.add(vo);
			  }catch(Exception ex) {}
		   }
		   //System.out.println(sb.toString());
		   FileOutputStream fos=
				   new FileOutputStream("c:\\java_data\\fh.txt");
		   ObjectOutputStream oos=new ObjectOutputStream(fos);
		   oos.writeObject(fList);
		   fos.close();
		   oos.close();
		   System.out.println("저장완료!!");
		   
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();//  에러 확인 / 복구 
	   }
	   finally
	   {
		  try
		  {
			   fis.close();
			   fr.close();
		  }catch(Exception ex) {}
	   }*/
	   //FileInputStream fis=null;
	   //ObjectInputStream ois=null;
	   try
	   {
		   fis=new FileInputStream("c:\\java_data\\fh.txt");
		   ois=new ObjectInputStream(fis);
		   fList=(ArrayList<FoodHouseVO>)ois.readObject();
	   }catch(Exception ex)
	   {
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
   /*public static void main(String[] args) {
	   FoodManager fm=new FoodManager();
	   for(FoodHouseVO vo:fList)
	   {
		   System.out.println("번호:"+vo.getFno());
		   System.out.println("참조번호:"+vo.getCno());
		   System.out.println("업체명:"+vo.getName());
		   System.out.println("주소:"+vo.getAddress());
		   System.out.println("전화:"+vo.getPhone());
		   System.out.println("메뉴:"+vo.getMenu());
		   System.out.println("==========================");
	   }
	   
   }*/
   public ArrayList<FoodCategoryVO> foodCategoryData(int no)
   {
	   ArrayList<FoodCategoryVO> list=
			   new ArrayList<FoodCategoryVO>();
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
		   list.add(cList.get(i));
	   }
	   return list;
   }
   public FoodCategoryVO categoryInfoData(String title)
   {
	   FoodCategoryVO vo=new FoodCategoryVO();
	   for(FoodCategoryVO fvo:cList)
	   {
		   if(fvo.getTitle().equals(title))
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<FoodHouseVO> foodHouseListData(int cno)
   {
	   ArrayList<FoodHouseVO> list=
			   new ArrayList<FoodHouseVO>();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getCno()==cno)
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
   public FoodHouseVO foodInfoData(int fno)
   {
	   FoodHouseVO vo=new FoodHouseVO();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getFno()==fno)
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<FoodHouseVO> foodFindData(String title)
   {
	   ArrayList<FoodHouseVO> list=
			   new ArrayList<FoodHouseVO>();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getName().contains(title))
		   {
			   list.add(fvo);
		   }
	   }
	   return list; 
   }
}