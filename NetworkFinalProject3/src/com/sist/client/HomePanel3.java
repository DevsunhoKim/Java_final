//package com.sist.client;
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//
//import com.sist.manager.BookManager3;
//import com.sist.vo.BookCategoryVO3;
//import com.sist.vo.BookHouseVO3;
//
//public class HomePanel3 extends JPanel implements ActionListener,MouseListener{
//	JLabel titleLa;
//	PosterCard3[] pcs=new PosterCard3[12];
//	BookManager3 fm=new BookManager3();
//	JPanel pan=new JPanel();
//	ControllPanel3 cp;
//	JTable table;
//	DefaultTableModel model;
//	public HomePanel3()
//	{
//		//setBackground(Color.pink);
//		this.cp=cp;
//		titleLa=new JLabel("국내도서 베스트");
//		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
//		pan.setLayout(new GridLayout(4,3,5,5));  //5:위아래 간격 5:좌우 간격
//		//배치
//
//		add("Center",pan);
//		//setBackground(Color.pink);
//
//	}
//	public void cardPrint(ArrayList<BookCategoryVO3> list)
//	{
//		int i=0;
//		for(BookCategoryVO3 vo:list)
//		{
//			pcs[i]=new PosterCard3(vo);
//			pan.add(pcs[i]);
//			i++;
//		}
//	}
//	public void cardInit(ArrayList<BookCategoryVO3> list)
//	{
//		for(int i=0;i<list.size();i++)
//		{
//			pcs[i].poLa.setIcon(null);
//			pcs[i].tLa.setText("");
//		}
//		pan.removeAll();     //데이터 제거
//		pan.validate();      //panel 재배치
//	}
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==table)
//		{
//			if(e.getClickCount()==2)
//			{
//				int row=table.getSelectedRow();
//				String fno=model.getValueAt(row, 0).toString();
//				BookHouseVO3 vo=fm.bookInfoData(Integer.parseInt(fno));
//				cp.fdp.bookPrint(vo);
//				cp.card.show(cp, "fdetail");
//			}
//		}
//	}
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}


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
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.manager.BookManager3;
import com.sist.vo.BookHouseVO3;

public class HomePanel3 extends JPanel implements ActionListener, MouseListener{
   JButton b1,b2,b3;
   PosterCard3[] pcs=new PosterCard3[12];
   BookManager3 fm=new BookManager3();
   JPanel pan=new JPanel();
   JTable table;
   DefaultTableModel model;
   ControllPanel3 cp;
  
   
   public HomePanel3(ControllPanel3 cp)
   {
	   this.cp=cp;
//	   JPanel p=new JPanel();
//	   p.setLayout(new GridLayout(1,3,20,20));
//	   b1=new JButton("국내 도서 베스트");
//	   b1.setPreferredSize(new Dimension(300,45));
//	   b2=new JButton("국내 CD / LP 베스트");
//	   b2.setPreferredSize(new Dimension(300,45));
//	   b3=new JButton("국내 DVD 베스트");
//	   b3.setPreferredSize(new Dimension(300,45));
//	   p.add(b1);p.add(b2);p.add(b3);
	   
	   pan.setLayout(new GridLayout(4,3,5,5));
	   //pan.setBackground(Color.black);
	   // 배치 
	   setLayout(new BorderLayout());
	   //add("North",p);
	   add("Center",pan);
	   
//	   b1.addActionListener(this);
//	   b2.addActionListener(this);
//	   b3.addActionListener(this);
	   
   }
   public void cardPrint(ArrayList<BookHouseVO3> list)
   {
	   int i=0;
	   for(BookHouseVO3 vo:list)
	   {
		   //System.out.println(vo.getPoster().substring(0,vo.getPoster().lastIndexOf("?")));
		   pcs[i]=new PosterCard3(vo);
		   
		   pan.add(pcs[i]);
		   pcs[i].addMouseListener(this);
		   i++;
	   }
	   
   }
   public void cardInit(ArrayList<BookHouseVO3> list)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   pcs[i].poLa.setIcon(null);
		   pcs[i].tLa.setText("");
	   }
	   pan.removeAll();// 데이터 제거
	   pan.validate();// Panel 재배치 
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			ArrayList<BookHouseVO3> list=
					fm.bookCategoryData(1);
			cardInit(list);
			cardPrint(list);
			  
		}
		else if(e.getSource()==b2)
		{
			   ArrayList<BookHouseVO3> list=
					fm.bookCategoryData(2);
			   
			   BookHouseVO3 fvo=
					   new BookHouseVO3();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   fvo.setPoster(null);
			   fvo.setName("");
			   for(int j=0;j<6;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b3)
		{
			ArrayList<BookHouseVO3> list=
					fm.bookCategoryData(3);
			cardInit(list);
			cardPrint(list);
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
					//BookCategoryVO3 vo=fm.categoryInfodData(title);
					//cp.fdp.la1.setText(vo.getTitle());
					//cp.fdp.la2.setText(vo.getSubject());
					BookHouseVO3 list=fm.bookInfoData(title);
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
