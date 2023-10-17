package com.sist.client;
import javax.swing.*;
public class MyWindow {
	JFrame fr=new JFrame(); // 캡슐화 (X)
	public MyWindow()
	{
		fr.setSize(800,600);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow();
	}

}
