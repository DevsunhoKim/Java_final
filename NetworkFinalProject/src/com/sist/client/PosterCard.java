package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.vo.*;
public class PosterCard extends JPanel{
   JLabel poLa=new JLabel();
   JLabel tLa=new JLabel();
   public PosterCard(FoodCategoryVO vo)
   {
	   setLayout(null);
	   poLa.setBounds(5, 5, 280, 120);
	   tLa.setBounds(5, 130, 280, 30);
	   
	   add(poLa);
	   add(tLa);
	   
	   try
	   {
		   if(vo.getPoster()!=null)
		   {
		     URL url=new URL(
				   vo.getPoster().substring(0,vo.getPoster().lastIndexOf("?")));
		     Image image=ImageChange.getImage(new ImageIcon(url),
				   280, 150);
		     poLa.setIcon(new ImageIcon(image));
		   }
		   else
		   {
			     Image image=ImageChange.getImage(
			    		 new ImageIcon(vo.getPoster()),
					   280, 150);
			     
			     poLa.setIcon(new ImageIcon(image)); 
		   }
		   tLa.setText(vo.getTitle());
		   System.out.println(vo.getTitle());
	   }catch(Exception ex) {ex.printStackTrace();}
   }
}