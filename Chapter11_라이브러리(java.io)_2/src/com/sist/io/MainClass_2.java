package com.sist.io;

import java.io.*;

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 메모리 입출력
			BufferedReader in=
					new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름 입력:");
			String name=in.readLine();
			System.out.println(name);
		}catch (Exception ex) {}
	}

}
