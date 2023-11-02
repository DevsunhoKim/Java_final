package com.sist.client;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;

public class FoodFindPanel extends JPanel implements ActionListener{
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	FoodManager fm=new FoodManager();
	public FoodFindPanel(ControllPanel cp)
	{
		this.cp=cp;
		tf=new JTextField(20);
		b1=new JButton();
		b2=new JButton();
		
		String[] col={"","업체명","음식종류"};
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
		JScrollPane js=new JScrollPane(table);
		
		// 배치
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
	public void findPrint(String title)
	{
		try
		{
			ArrayList<FoodHouseVO> list=fm.foodFindData(title);
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			for(FoodHouseVO vo:list)
			{
				URL url=new URL(vo.getPoster());
				Image image=new ImageChange().getImage(new ImageIcon()
						, 90, 90);
				Object[] obj= {new ImageIcon(),vo.getName(),vo.getPhone()};
				model.addRow(obj);
			}
		}catch(Exception ex) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
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
