package com.sist.io;

import java.io.*;
// 파일 읽기 => 송수신 => 2byte 씩 읽어 온다 => 문자 스트림
// 파일 자체 제어 : Reader / Writer
public class MainClass_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_data\\sawon.txt");
			int i=0;
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
