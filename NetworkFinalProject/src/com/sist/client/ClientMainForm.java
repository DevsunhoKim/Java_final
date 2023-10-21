package com.sist.client;

import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *   FlowLayout: JPanel
 *      ---------------
 *        버튼  버튼...
 *      ---------------
 *   GridLayout
 *      ---------------
 *        버튼 버튼 버튼
 *        버튼 버튼 버튼
 *      ---------------
 *   BorderLayout
 *      ---------------
 *           North
 *      ---------------
 *        |         |
 *  East  |         |  West
 *        |         |
 *          Center
 *      ---------------
 *           South
 *      ---------------
 *   CardLayout: 감춘다 
 */
public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp=new MenuPanel();
	ControllPanel cp=new ControllPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	public ClientMainForm()
	{
		setLayout(null); // 직접 배치
		logo.setBounds(10, 15, 120, 120);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 100, 150)));
		add(logo);
		mp.setBounds(10, 175, 120, 250);
		add(mp);
		
		cp.setBounds(135, 15, 865, 705);
		add(cp);
		setSize(1025, 768);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{
			
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
			// 서버 연결
			login.setVisible(false);
			setVisible(true);
		}
	}

}