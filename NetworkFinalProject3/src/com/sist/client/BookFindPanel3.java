package com.sist.client;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;
import java.net.*;

import com.sist.vo.*;
import com.sist.common.ImageChange3;
import com.sist.manager.*;

public class BookFindPanel3 extends JPanel implements ActionListener{
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	ControllPanel3 cp;
	BookManager3 fm=new BookManager3();
	public BookFindPanel3(ControllPanel3 cp)
	{
		this.cp=cp;
		tf=new JTextField(20);
		b1=new JButton("검색");
		b2=new JButton("홈이동");
		
		String[] col= {"","도서명","작가명"};
		Object[][] row=new Object[0][3];
		model=new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getColumnClass(int colunmIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, colunmIndex).getClass();
			}
			//Class.forName("")
		};
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		//배치
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		setLayout(new BorderLayout());
		add("North",p);
		add("Center",js);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	public void findPrint(String name)
	{
		try
		{
			ArrayList<BookHouseVO3> list=fm.bookFindData(name);
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			for(BookHouseVO3 vo:list)
			{
				URL url=new URL(vo.getPoster());
				Image image=ImageChange3.getImage3(new ImageIcon(url), 90, 90);
				Object[] obj= { new ImageIcon(image)
								,vo.getName()
								,vo.getPubl()
				};
				model.addRow(obj);				
			}
		}catch(Exception ex) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1 | e.getSource()==tf)
		{
			String title=tf.getText();
			if(title.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			findPrint(title);
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "home");
		}
	}
}
