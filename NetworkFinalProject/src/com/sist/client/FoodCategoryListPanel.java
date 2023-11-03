package com.sist.client;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;

public class FoodCategoryListPanel extends JPanel implements MouseListener, ActionListener{
	JLabel la1, la2;
	JButton b;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	FoodManager fm=new FoodManager();
	public FoodCategoryListPanel(ControllPanel cp)
	{
		this.cp=cp; // 화면 이동 
		la1=new JLabel();
		la2=new JLabel();
		
		b=new JButton("목록");
		
		String[] col={"", "이미지", "맛집정보"};
		Object[][] row=new Object[0][3];
		model=new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			// 테이블 안에 이미지 출력
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		table.getColumn("이미지").setPreferredWidth(80);
		table.getColumn("맛집정보").setPreferredWidth(500);
		table.getColumnModel().removeColumn(table.getColumnModel().getColumn(0));
		// hidden => 맛집 번호
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(100);
		
		// 배치
		la1.setHorizontalAlignment(JLabel.CENTER);
		la1.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		la2.setHorizontalAlignment(JLabel.CENTER);
		
		setLayout(null);
		la1.setBounds(10, 15, 750, 55);
		la2.setBounds(10, 75, 750, 35);
		
		b.setBounds(10, 120, 100, 30); // 리스트에서 목록 크기
		
		js.setBounds(10, 160, 750, 450);
		
		add(la1);
		add(la2);
		add(b);
		add(js);
		
		table.addMouseListener(this);
		b.addActionListener(this);
		
	}
	public void foodPrint(ArrayList<FoodHouseVO> list)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		try
		{
			for(int i=0;i<10;i++)
			{
				FoodHouseVO vo=list.get(i);
				URL url=new URL(vo.getPoster());
				Image image=ImageChange.getImage(new ImageIcon(url), 120, 150);
				String data="<html>" + vo.getName() + "&nbsp;"
				           +"<span style=\"color:orange\">"
						   + vo.getScore() + "</span><br>"
						   + vo.getAddress() + "<br>"
						   + vo.getPhone() + "<br>"
						   + vo.getType()
						   + "</html>";
				Object[] obj= {vo.getFno(), new ImageIcon(image), data};
				model.addRow(obj);
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String fno=model.getValueAt(row, 0).toString();
				//System.out.println("선택 번호" + fno);
				FoodHouseVO vo=fm.foodInfoData(Integer.parseInt(fno));
				cp.fdp.foodPrint(vo);
				cp.card.show(cp, "fdetail");
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			cp.card.show(cp, "home");
		}
	}
	
}