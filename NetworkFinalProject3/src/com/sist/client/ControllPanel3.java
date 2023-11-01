package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public  class  ControllPanel3 extends JPanel{
    public HomePanel3 hp=new HomePanel3();
    public ChatPanel3 cp=new ChatPanel3();
    public BoardListPanel3 blp;
    public NewsPanel3 np=new NewsPanel3();
    public BoardInsertPanel3 bip;
    public BoardDetailPanel3 bdp;
    public BoardDeletePanel3 bdel;
    public BoardUpdatePanel3 bup;
    public CardLayout card=new CardLayout();
    public ControllPanel3()
    {
    	blp=new BoardListPanel3(this);//화면 이동 
    	bip=new BoardInsertPanel3(this);
    	bdp=new BoardDetailPanel3(this);// 자체에서 이동 
    	bdel=new BoardDeletePanel3(this);
    	bup=new BoardUpdatePanel3(this);
    	setLayout(card);
    	add("home",hp);
    	add("chat",cp);
    	add("board",blp);
    	add("news",np);
    	add("insert",bip);
    	add("detail",bdp); // 화면 이동 
    	add("delete",bdel);
    	add("update",bup);
    	// => @RequestMapping("update.jsp") => Spring/Spring-Boot
    	// => app.get("update")=> NodeJS
    }
}