package com.sist.client;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class ChatPanel3 extends JPanel{
	JTable table1,table2;
	DefaultTableModel model1,model2;
	JTextPane pane;   //채팅출력위치
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6;
	public ChatPanel3()
	{                         //공개,비공개
//		                        ---
		setLayout(null);
		String[] col1= {"방이름","상태","인원"};
		String[][] row1=new String[0][3];    //한줄에 3개의 데이터가 들어간다
		
		model1=new DefaultTableModel(row1,col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		js1.setBounds(10, 15, 500, 400);
		add(js1);
		
		String[] col2= {"ID","이름","성별","위치"};
		String[][] row2=new String[0][4];    //한줄에 3개의 데이터가 들어간다
		
		model2=new DefaultTableModel(row2,col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		js2.setBounds(10, 425, 500, 300);
		add(js2);
		
		pane=new JTextPane();
		JScrollPane js3=new JScrollPane(pane);
		pane.setEditable(false);   //채팅 안칠때 비활성화		
		js3.setBounds(520, 15, 490, 360);
		add(js3);
		
		tf=new JTextField();
		tf.setBounds(520, 380, 490, 35);
		add(tf);
		
		b1=new JButton("방만들기");
		b2=new JButton("방들어가기");
		b3=new JButton("쪽지보내기");
		b4=new JButton("정보보기");
		b5=new JButton("1:1 채팅");
		b6=new JButton("채팅 종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setBounds(520, 425, 490, 200);
		add(p);
	}

}
