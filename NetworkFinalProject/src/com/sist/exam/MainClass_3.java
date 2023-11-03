package com.sist.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass_3 extends JFrame implements ActionListener{
	JProgressBar[] bar=new JProgressBar[5];
	JButton b1, b2;
	static int rank;
	BarThread[] bt=new BarThread[5];
	public MainClass_3()
	{
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5, 1, 5, 5));
		Color[] color= {Color.cyan, Color.yellow, Color.pink, Color.orange, Color.magenta};
		
		for(int i=0;i<5;i++)
		{
			bar[i]=new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);
			// 1% ~ 100%
			bar[i].setForeground(color[i]);
			bar[i].setBackground(Color.white);
			p.add(bar[i]);
		}
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		
		add("Center", p);
		add("South", p2);
		
		setSize(640, 350);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			for(int i=0;i<5;i++)
			{
				bt[i]=new BarThread(i);
				bt[i].start();
			}
		}
	}
	
	// Thread => bar[]를 이용함 => 윈도우가 가지고 있는 모든 데이터 사용
	// 객체 생성 없이 사용 => 내부클래스(서버, 빅데이터, 스레드)
	/*
	 *   내부클래스
	 *    = 멤버클래스 => 스레드, 서버 개발
	 *    class A
	 *    {
	 *        class B
	 *        {
	 *            A가 가지고 있는 모든 데이터를 공유
	 *        }
	 *    }
	 *    = 익명의 클래스 => 상속 없이 오버라이딩이 가능
	 *    class A
	 *    {
	 *        B b=new B()
	 *        {
	 *        
	 *        }
	 *    }
	 *    class B
	 *    {
	 *        public void disp(){}
	 *    }
	 *    
	 *    => 지역클래스
	 *    class A
	 *    {
	 *        public void disp()
	 *        {
	 *            class B
	 *            {
	 *            }
	 *        }
	 *    }
	 */
	class BarThread extends Thread
	{
		// 프로그래바 한 개만 동작
		int index;
		public BarThread(int index)
		{
			this.index=index; // 스레드
		}
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				int a=(int)(Math.random()*300); // 일시 정지
				try
				{
					Thread.sleep(a);
				}catch(Exception ex) {}
				
				if(i==100)
				{
					rank++;
					interrupt(); // 스레드 종료
				}
			}
			System.out.println((index+1)+"번쨰: " +  rank + "등");
		}
	}

}