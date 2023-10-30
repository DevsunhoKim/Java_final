package com.sist.client;

import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainForm3 extends JFrame implements ActionListener{
		MenuPanel3 mp=new MenuPanel3();
		ControllPanel3 cp=new ControllPanel3();
		JLabel logo=new JLabel();
		Login3 login=new Login3();
		public ClientMainForm3()
		{
			setLayout(null); // 직접 배치
			logo.setBounds(10, 15, 200, 200);
			logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo3.png"), 200, 200)));
			add(logo);
			mp.setBounds(10, 200, 200, 300);
			add(mp);
			
			cp.setBounds(230, 15, 1100, 800);
			add(cp);
			setSize(1280, 800);
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
			new ClientMainForm3();
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