package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange3;
import com.sist.vo.*;
public class PosterCard3 extends JPanel{
	JLabel poLa=new JLabel();    //포스터
	JLabel tLa=new JLabel();     //제목
	public PosterCard3(BookHouseVO3 vo)
	{
		setLayout(null);
		poLa.setBounds(30, 5, 200, 180);
		tLa.setBounds(30, 190, 200, 30);
		
		add(poLa); add(tLa);
		
		try
		{
			if(vo.getPoster().startsWith("http"))
			{
				System.out.println(vo.getPoster());
				URL url=new URL(vo.getPoster().replaceAll("[가-힣]",""));
				Image image=ImageChange3.getImage3(new ImageIcon(url), 150, 180);
				poLa.setIcon(new ImageIcon(image));
			}
			else // (이미지없음)
			{
				Image image=ImageChange3.getImage3(new ImageIcon("c:\\java_data\\noimage.jpg"), 150, 180);
				poLa.setIcon(new ImageIcon(image));
			}
			tLa.setText(vo.getName());
			//System.out.println(vo.getTitle());
		}catch(Exception ex) {ex.printStackTrace();}
	}
}