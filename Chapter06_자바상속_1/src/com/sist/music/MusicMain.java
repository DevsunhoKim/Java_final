package com.sist.music;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("선택(Genie(1),Melon(2)):");
        int select=scan.nextInt();
        // 상위 클래스로 => 하위 클래스를 제어 
        GenieMusicSystem ms=null;
        if(select==1)
        	ms=new GenieMusicSystem();
        else 
        	ms=new MelonMusicSystem();
        // Mnet ....
        
        //1. 전체 목록 읽기 
        //System.out.println(ms.title);
        Music[] m=ms.musicAllData();
        for(Music mm:m)
        {
        	System.out.println(mm.getMno()+"."+mm.getTitle());
        }
        //2. 검색
        System.out.println("==============================");
        System.out.print("가수명 입력:");
        String singer=scan.next();
        Music[] findData=ms.musicSingerFindData(singer);
        for(Music mm:findData)
        {
        	System.out.println(mm.getTitle()+"("
        			+mm.getSinger()+")");
        }
        
        
	}

}