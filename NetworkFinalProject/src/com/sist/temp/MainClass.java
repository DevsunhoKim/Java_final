package com.sist.temp;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.common.ImageChange;
public class MainClass extends JFrame implements MouseListener{
    JTable table;
    DefaultTableModel model;
    public MainClass()
    {
    	String[] col={"","이미지","데이터"};
    	Object[][] row=new Object[0][3];
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
    		
    	};
    	table=new JTable(model);
    	table.setRowHeight(80);
    	JScrollPane js=new JScrollPane(table);
    	//table.getColumn("").setMaxWidth(0);
    	table.getColumnModel().removeColumn(table.getColumnModel().getColumn(0));
    	table.getColumn("이미지").setPreferredWidth(80);
    	table.getColumn("데이터").setPreferredWidth(350);
    	add("Center",js);
    	setSize(500, 300);
    	
    	for(int i=0;i<5;i++)
    	{
    	  Object[] data={i+1,new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\cgv"+(i+1)+".jpg"), 100, 80)),"<html>소년들<br>장르 : 드라마, 범죄<br>개봉 : \r\n"
        			+ "2023.11.01</html>"};
    	   model.addRow(data);
    	}
    	setVisible(true);
    	table.addMouseListener(this);
    	/*JPanel p=new JPanel();
    	p.setLayout(new GridLayout(1, 5,5,5));
    	JLabel[] imgs=new JLabel[5];
    	for(int i=0;i<5;i++)
    	{
    		imgs[i]=new JLabel();
    		imgs[i].setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\cgv"+(i+1)+".jpg"), 150, 170)));
    		p.add(imgs[i]);
    	}
    	add("North",p);*/
    	//setSize(800, 450);
    	//setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			int row=table.getSelectedRow();
			String no=model.getValueAt(row, 0).toString();
			System.out.println(no);
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