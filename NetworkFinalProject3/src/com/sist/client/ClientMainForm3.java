package com.sist.client;
import javax.swing.*;

import com.sist.common.ImageChange3;
import com.sist.manager.BookManager3;
import com.sist.vo.BookHouseVO3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClientMainForm3 extends JFrame implements ActionListener {
	MenuPanel3 mp=new MenuPanel3();
	ControllPanel3 cp=new ControllPanel3();
	JLabel logo=new JLabel();
	Login3 login=new Login3();
	BookManager3 fm=new BookManager3();
	public ClientMainForm3()
	{
		setLayout(null);    //직접배치
		logo.setBounds(0, 0, 200, 200);
		logo.setIcon(new ImageIcon(ImageChange3.getImage3(new ImageIcon("C:\\javaDev\\logo3.png"), 200, 200)));
		add(logo);
		mp.setBounds(10, 200, 200, 500);   //메뉴의 버튼 크기
		add(mp);
		
		cp.setBounds(230, 15, 1030, 800);
		add(cp);
		setSize(1280,800);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		login.b1.addActionListener(this);
		
		ArrayList<BookHouseVO3> list=fm.bookCategoryData(1);
		cp.hp.cardPrint(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

		}catch(Exception ex) {}
		new ClientMainForm3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if(e.getSource()==mp.b1)
			{
				cp.card.show(cp,"home");
			}
			else if(e.getSource()==mp.b2)
			{
				cp.card.show(cp, "find");
			}
			else if(e.getSource()==mp.b3)
			{
				cp.card.show(cp, "chat");
			}
			else if(e.getSource()==mp.b4)
			{
				cp.card.show(cp, "board");
			}
			else if(e.getSource()==mp.b5)
			{
				cp.card.show(cp, "news");
			}
			else if(e.getSource()==mp.b6)
			{
				System.exit(0);
			}
			else if(e.getSource()==login.b1)
			{
				login.setVisible(false);
				setVisible(true);
			}
	}
	 
}
