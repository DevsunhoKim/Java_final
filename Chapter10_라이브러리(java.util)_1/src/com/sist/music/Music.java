package com.sist.music;
//1|Love Lee|AKMU (악뮤)|Love Lee|EIz09kLzN9k\u0026pp=ygUITG92ZSBMZWU%3D
// 사용자 정의 데이터 형 => 캡슐화
public class Music {
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	private int rank;
	private String title;
	private String singer;
	private String album;
	private String key;
	// 변수 => 읽기/쓰기 기능을 만들어서 접근이 가능
	
}
