package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel3 extends JPanel{
    public HomePanel3 hp=new HomePanel3();
    public ChatPanel3 cp=new ChatPanel3();
    public BoardListPanel3 blp;
    public NewsPanel3 np=new NewsPanel3();
    public BoardInsertPanel3 bip;
    public CardLayout card=new CardLayout();
    public ControllPanel3()
    {
    	blp=new BoardListPanel3(this);//화면 이동 
    	bip=new BoardInsertPanel3(this);
    	setLayout(card);
    	add("home",hp);
    	add("chat",cp);
    	add("board",blp);
    	add("news",np);
    	add("insert",bip);
    }
}