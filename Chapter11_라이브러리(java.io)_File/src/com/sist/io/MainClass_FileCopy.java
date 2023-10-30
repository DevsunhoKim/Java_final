package com.sist.io;
// FileInputStream / FileOutputStream의 주 역할
// 파일 복사... (웹 =>업로드/다운로드)
// 파일 이용 => 메모리(데이터=> 프로그램 종료시에 자동으로 해제)
// ------ 영구적으로 저장
// 보안 => 파일의 단점 : 보안 취약 => 파일은 종속적이다 (여러개의 파일을 연결해서 사용하기 어렵다)
// 로컬
// => 데이터베이스 => 원격 *** 
import java.io.*;
public class MainClass_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\javaDev\\back.jpg");
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\back.jpg");
			// 파일 쓰기 ==> 클라이언트
			// 파일 복사
			int i=0; // 읽은 바이트수
			byte[] buffer=new byte[1024];
			// 한번에 1024바이트씩 읽어서 복사
			// read() => 한글자 , read(byte[])
			while((i=fis.read(buffer, 0, 1024))!=-1)
			{
				fos.write(buffer, 0, i);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception ex) {}
	}

}
