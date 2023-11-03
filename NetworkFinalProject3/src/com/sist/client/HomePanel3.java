package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.manager.BoardManager3;
import com.sist.manager.BookManager3;
import com.sist.vo.BoardVO3;
import com.sist.vo.BookHouseVO3;

public class HomePanel3 extends JPanel implements ActionListener, MouseListener{
   
   JButton b4, b5; // 이전 다음 버튼
   JLabel pageLa; // 페이지
   
   PosterCard3[] pcs=new PosterCard3[12];
   BookManager3 fm=new BookManager3();
   JPanel pan=new JPanel();
   JTable table;
   DefaultTableModel model;
   ControllPanel3 cp;
   
   int curpage=1;   // 페이지
   int totalpage=0;
   BookManager3 bm=new BookManager3();
   
   public HomePanel3(ControllPanel3 cp)
   {
	   this.cp=cp;
	  
	   // 이전 다음
	   b4=new JButton("이전");
	   b5=new JButton("다음");
	   pageLa=new JLabel("1 page / 1 pages");
	   
	   pan.setLayout(new GridLayout(3,4,6,8));
	   //pan.setBackground(Color.black);
	   // 배치 
	   setLayout(new BorderLayout());
	   //add("North",p);
	   add("Center",pan);
	   
	   // 이전 다음 배치
	   //setLayout(null);
	   JPanel p1=new JPanel();
	   p1.add(b4);
	   p1.add(pageLa);
	   p1.add(b5);
	   
	   //p1.setBounds(5, 600, 710, 35);
	   add("South",p1);
	   
	   // 이전 다음 이벤트
	   b4.addActionListener(this); // 이전
	   b5.addActionListener(this); // 다음
	   homeList();
   }
	
	   
   public void homeList()
   {
	   ArrayList<BookHouseVO3> list=bm.bookListData(curpage);
		
		cardPrint(list);
		totalpage=bm.bookTotalPage();
		pageLa.setText(curpage+" page / "+totalpage+" pages");

   }
   
   public void cardPrint(ArrayList<BookHouseVO3> list)
   {
	   int i=0;
	   for(BookHouseVO3 vo:list)
	   {
		   pcs[i]=new PosterCard3(vo);
		   
		   pan.add(pcs[i]);
		   pcs[i].addMouseListener(this);
		   i++;
	   }
	   
   }
   public void cardInit()
   {
	   pan.removeAll();// 데이터 제거
	   pan.validate();// Panel 재배치 
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b4)
		{
			if(curpage>1)
			{
				curpage--;
				cardInit();
				homeList();
			}
		}
		else if(e.getSource()==b5)
		{
			if(curpage<totalpage)
			{
				curpage++;
				cardInit();
				homeList();
			}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<pcs.length;i++)
		{
		if(e.getSource()==pcs[i])
		{
			if(e.getClickCount()==2)
			{
				String title=pcs[i].tLa.getText();
				System.out.println(title);
//				BookHouseVO vo=fm.houseInfoData(title);
//				cp.fdp.la1.setText(vo.getName());
//				cp.fdp.la2.setText(vo.getAuthor());
				BookHouseVO3 list=fm.houseInfoData(title);
				cp.fdp.bookPrint(list);
				cp.card.show(cp, "fdetail");
			}
		}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}