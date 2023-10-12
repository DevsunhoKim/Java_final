package com.sist.main;

import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		for(Music m:ms.getMusics())
		{
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
