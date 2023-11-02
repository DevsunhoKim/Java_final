package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.manager.*;

public class BoardDeletePanel3 extends JPanel implements ActionListener{
	ControllPanel3 cp;// 화면 변경 
    JLabel titleLa;
    JLabel la,la1;
    JPasswordField pf;
    JButton b1,b2;
    BoardManager3 bm=new BoardManager3();
    public BoardDeletePanel3(ControllPanel3 cp)
    {
    	this.cp=cp;
    	titleLa=new JLabel("삭제하기");
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	titleLa.setHorizontalAlignment(JLabel.CENTER);
    	
    	la=new JLabel("비밀번호");
    	pf=new JPasswordField();
    	la1=new JLabel();
    	la1.setVisible(false);
    	b1=new JButton("삭제");
    	b2=new JButton("취소");
    	setLayout(null);
    	titleLa.setBounds(10, 15, 720, 60);
  	    add(titleLa);
  	    add(la1);
  	    la.setBounds(200, 100, 80, 30);
  	    pf.setBounds(290, 100, 200, 30);
  	    add(la);add(pf);
  	    
  	    JPanel p=new JPanel();
  	    p.add(b1);
  	    p.add(b2);
  	    p.setBounds(200, 175, 290, 35);
  	    add(p);
  	    
  	    b1.addActionListener(this);
  	    b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "detail");
		}
		else if(e.getSource()==b1)
		{
			String no=la1.getText();
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");  //JavaScript : alert()
				pf.requestFocus();
				return;
			}
			// => 비밀번호 확인
			String res=bm.boardDelete(Integer.parseInt(no), pwd);
			if(res.equals("YES"))
			{
				cp.blp.boardList();
				cp.card.show(cp, "board");
			}
			else if(res.equals("NO"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				pf.setText("");
				pf.requestFocus();
			}
		}
	}
}