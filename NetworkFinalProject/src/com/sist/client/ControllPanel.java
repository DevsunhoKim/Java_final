package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
    public HomePanel hp=new HomePanel();
    public ChatPanel cp=new ChatPanel();
    public BoardListPanel blp;
    public NewsPanel np=new NewsPanel();
    public BoardInsertPanel bip;
    public CardLayout card=new CardLayout();
    public ControllPanel()
    {
    	blp=new BoardListPanel(this);//화면 이동 
    	bip=new BoardInsertPanel(this);
    	setLayout(card);
    	add("home",hp);
    	add("chat",cp);
    	add("board",blp);
    	add("news",np);
    	add("insert",bip);
    }
}