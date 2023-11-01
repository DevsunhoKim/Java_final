package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.manager.FoodManager3;
import com.sist.vo.FoodCategoryVO3;
public class HomePanel3 extends JPanel implements ActionListener{
   JButton b1,b2,b3;
   PosterCard3[] pcs=new PosterCard3[12];
   FoodManager3 fm=new FoodManager3();
   JPanel pan=new JPanel();
   public HomePanel3()
   {
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,3,20,20));
	   b1=new JButton("믿고 보는 맛집 리스트");
	   b1.setPreferredSize(new Dimension(300,45));
	   b2=new JButton("지역별 인기 맛집");
	   b2.setPreferredSize(new Dimension(300,45));
	   b3=new JButton("메뉴별 인기 맛집");
	   b3.setPreferredSize(new Dimension(300,45));
	   p.add(b1);p.add(b2);p.add(b3);
	   
	   pan.setLayout(new GridLayout(4,3,5,5));
	   //pan.setBackground(Color.black);
	   // 배치 
	   setLayout(new BorderLayout());
	   add("North",p);
	   add("Center",pan);
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
   }
   public void cardPrint(ArrayList<FoodCategoryVO3> list)
   {
	   int i=0;
	   for(FoodCategoryVO3 vo:list)
	   {
		   //System.out.println(vo.getPoster().substring(0,vo.getPoster().lastIndexOf("?")));
		   pcs[i]=new PosterCard3(vo);
		   
		   pan.add(pcs[i]);
		   i++;
	   }
	   
   }
   public void cardInit(ArrayList<FoodCategoryVO3> list)
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
			ArrayList<FoodCategoryVO3> list=
					fm.FoodCategoryData(1);
			cardInit(list);
			cardPrint(list);
			  
		}
		else if(e.getSource()==b2)
		{
			   ArrayList<FoodCategoryVO3> list=
					fm.FoodCategoryData(2);
			   
			   FoodCategoryVO3 fvo=
					   new FoodCategoryVO3();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   fvo.setPoster(null);
			   fvo.setTitle("");
			   for(int j=0;j<6;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b3)
		{
			ArrayList<FoodCategoryVO3> list=
					fm.FoodCategoryData(3);
			cardInit(list);
			cardPrint(list);
		}
	}
}