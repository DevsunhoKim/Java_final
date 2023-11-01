package com.sist.vo;

import java.io.Serializable;

/*
 *   1|얼큰한 칼국수 맛집 베스트 20곳|"한국인 맞춤 얼큰칼칼 칼국수 다모여!"|https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rpvuj1tpaueafi4l.jpg?fit=around|600:400&crop=600:400;*,*&output-format=jpg&output-quality=80

 */
public class FoodCategoryVO implements Serializable{
    private int cno;
    private String title;
    private String subject;
    private String poster;
	
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	   
   
}