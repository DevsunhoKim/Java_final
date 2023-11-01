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

import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;
public class HomePanel extends JPanel implements ActionListener{
   JButton b1,b2,b3;
   PosterCard[] pcs=new PosterCard[12];
   FoodManager fm=new FoodManager();
   JPanel pan=new JPanel();
   public HomePanel()
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
   public void cardPrint(ArrayList<FoodCategoryVO> list)
   {
	   int i=0;
	   for(FoodCategoryVO vo:list)
	   {
		   //System.out.println(vo.getPoster().substring(0,vo.getPoster().lastIndexOf("?")));
		   pcs[i]=new PosterCard(vo);
		   
		   pan.add(pcs[i]);
		   i++;
	   }
	   
   }
   public void cardInit(ArrayList<FoodCategoryVO> list)
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
			ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(1);
			cardInit(list);
			cardPrint(list);
			  
		}
		else if(e.getSource()==b2)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(2);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
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
			ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(3);
			cardInit(list);
			cardPrint(list);
		}
	}
}