package com.sist.manager;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

// 캡슐화
public class Music {
	
	
	private int mno;
	private String title;
	private String name;
	private String singer;
	private String album;
	private int idCrement;
	private String state;
	//은닉화 => 클라이언트가 볼 수 있게 만든다
	// 변수 => 메모리에 저장 / 메모리에서 데이터 읽기
	//         읽기/쓰기 => 기능 추가 == getter / setter
	
}
