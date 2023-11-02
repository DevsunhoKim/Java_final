package com.sist.client;

import javax.swing.*;
import java.awt.*;
public class MenuPanel3 extends JPanel{
	public JButton b1,b2,b3,b4,b5,b6;
	public MenuPanel3()
	{
		b1=new JButton("HOME");
		b2=new JButton("도서 검색");
		b3=new JButton("실시간 도서추천 채팅");
		b4=new JButton("커뮤니티");
		b5=new JButton("뉴스 검색");  
		b6=new JButton("종료");  
		
		setLayout(new GridLayout(6, 1,10,10));
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
	}
	
}
