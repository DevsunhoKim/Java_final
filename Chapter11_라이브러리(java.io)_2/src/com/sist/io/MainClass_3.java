package com.sist.io;
// BufferedInputStream
import java.io.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream  fis=
					new FileInputStream("c:\\javaDev\\genie.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
		}catch (Exception ex) {}
	}

}
