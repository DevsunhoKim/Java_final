package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login3 extends JFrame{
	JLabel la1,la2,la3;
	JTextField tf1, tf2;
	JRadioButton rb1,rb2;
	JButton b1,b2;

	public Login3()
	{
		la1=new JLabel("아이디");
		la2=new JLabel("이름");
		la3=new JLabel("성별");
		
		tf1=new JTextField();
		tf2=new JTextField();    //생성자 초기화
		
		rb1=new JRadioButton("남자");   //<input type=radio>
		rb2=new JRadioButton("여자");
		rb1.setSelected(true);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(b2);   //그룹 => html에서 그룹 설정을 한다
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		JPanel p=new JPanel();
		p.add(b1); p.add(b2);
		/////////////멤버변수의 초기화
		
		//배치
		setLayout(null);  //JFrame => BorderLayout
		//사용자 배치
		
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(75, 15, 150, 30);

		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(75, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(75, 85, 70, 30);
		rb2.setBounds(150, 85, 70, 30);
		
		p.setBounds(10, 125, 235, 35);
		
		//추가
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(rb1); add(rb2);
		add(p);
		
		setBounds((1100-255)/2,(768-200)/2,255,200);
		setVisible(true);
	}
//	public static void main(String[] args) {
//		new Login();
//	}
}
