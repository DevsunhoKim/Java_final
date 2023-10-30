package com.sist.io;
// => 한글 파일 읽기 => (X) =>다운로드 / 업로드
// read() / write() / ==> append
// => new FileInputStream / new FileOutputStream("경로명")
// => create => new FileOutputStream("경로명",true)
// 파일은 반드시 닫는다
import java.util.*;
import java.io.*;
public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String[] cate= {
					"얼큰한 칼국수 맛집 베스트 20곳",
					"여의도 맛집 베스트 50곳",
					"한식 주점 베스트 30곳",
					"일본 라멘 맛집 베스트 70곳",
					"어복쟁반 맛집 베스트 15곳"
			};
			//category.txt 에 저장
			for(String s:cate)
			{
				// 파일 저장
				FileOutputStream fos=
				new FileOutputStream("c:\\java_data\\category.txt",true);
				fos.write((s+"\r\n").getBytes());
				//문자열을 byte[]로 변환
				fos.close();
			}
			System.out.println("파일 저장 완료");
		}catch(Exception ex) {}

	}

}
