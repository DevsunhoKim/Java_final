package com.sist.vo;
import java.util.*;
import java.io.*;
// 게시판 => 파일 입출력 => Value Object => 변수(사용자 정의 데이터형)
// 캡슐화를 이용해서 => 데이터 보호 => 웹에서 동일한 코딩
// 한개의 게시물에 대한 정보를 가지고 있다
public class BoardVO3 implements Serializable
{
	private int no; //게시물 번호 => 중복없는 데이터(구분자) => 수정
	private String name;
	private String subject;   //게시물 제목
	private String content;   //내용
	private Date regdate;     //등록일
	private String pwd;       //비밀번호 => 수정,삭제 => 본인여부확인
	private int hit;          //조회수
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
}