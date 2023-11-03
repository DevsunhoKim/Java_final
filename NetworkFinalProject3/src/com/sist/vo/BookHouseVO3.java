package com.sist.vo;

import java.io.Serializable;

public class BookHouseVO3 implements Serializable{
	
	private int fno;
	//private int cno;
	private String name;
	private String author;
	private String poster;
	private String publ;
	private double score;
	private String price;
	
	
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getPubl() {
		return publ;
	}
	public void setPubl(String publ) {
		this.publ = publ;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}