package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
    public HomePanel hp=new HomePanel();
    public ChatPanel cp=new ChatPanel();
    public BoardListPanel blp;
    public NewsPanel np=new NewsPanel();
    public BoardInsertPanel bip;
    public BoardDetailPanel bdp;
    public BoardDeletePanel bdel;
    public BoardUpdatePanel bup;
    public CardLayout card=new CardLayout();
    public ControllPanel()
    {
    	blp=new BoardListPanel(this);//화면 이동 
    	bip=new BoardInsertPanel(this);
    	bdp=new BoardDetailPanel(this);// 자체에서 이동 
    	bdel=new BoardDeletePanel(this);
    	bup=new BoardUpdatePanel(this);
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