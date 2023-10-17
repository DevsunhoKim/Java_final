package com.sist.client;
import javax.swing.*;
import java.net.*;
import java.awt.*;
// 상속 => 가장 큰 것으로 받는다 
public class MyWindow2 extends JFrame{
	JLabel la=new JLabel();
	public MyWindow2()
	{
		setLayout(null);
		la.setBounds(10, 15, 350, 500);
		add(la);
		try
		{
			URL url=new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87444/87444_320.jpg");
			la.setIcon(new ImageIcon(url));
		}catch(Exception ex) {}
		setSize(800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow2();
	}

}
