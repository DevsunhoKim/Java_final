package com.sist.seoul;
import java.io.*;
import java.util.*;






public class SeoulManager {

	private static Seoul[] loc=new Seoul[273];
	public SeoulManager()
	{
		{
			  
			  FileReader fr=null;
			  try
			  {
				  fr=new FileReader("c:\\javaDev\\seoul_location.txt");//FileNotFoundException
			      int i=0;
			      String seoul_data="";
			      while((i=fr.read())!=-1) // -1 EOF
			      {
			    	  seoul_data+=(char)i;
			      }
			      
			      //1. 
			      String[] sds=seoul_data.split("\n");
			      i=0;
			      for(String s:sds)
			      {
			    	  try
			    	  {
				    	  //System.out.println(s);
				    	  StringTokenizer st=new StringTokenizer(s,"|");
				    	  loc[i]=new Seoul();
				    	  loc[i].setRank(Integer.parseInt(st.nextToken()));
				    	  // int rank="10";
				    	  loc[i].setPlace(st.nextToken());
				    	  loc[i].setSub(st.nextToken());
				    	  loc[i].setAddr(st.nextToken());
				    	  
				    	  i++;
			    	  }catch(Exception ex) {}
			      }
			  }catch(Exception ex) 
			  {
				  // 에러 확인 
				  ex.printStackTrace();
			  }
			  finally
			  {
				  // 파일 닫기 
				  try
				  {
					  fr.close();
				  }catch(Exception ex) {}
			  }
		  }
		
	}
	public Seoul[] SeoulAllData()
	  {
		  return loc;
	  }
}
