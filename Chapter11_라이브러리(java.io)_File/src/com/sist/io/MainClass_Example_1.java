package com.sist.io;
// => JavaDev => genie.txt
import java.io.*;
public class MainClass_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0; // 문자 저장 장소
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i); 
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}

}
