package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
	public HomePanel hp;
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np=new NewsPanel();
	public BoardInsertPanel bip;
	public BoardDetailPanel bdp;
	public BoardDeletePanel bdel;
	public BoardUpdatePanel bup;
	public FoodCategoryListPanel fcp;
	public FoodDetailPanel fdp;
	public FoodFindPanel ffp;
	public CardLayout card=new CardLayout();
	// MVC
	// C => 해당 클래스를 찾아서 처리 => 화면 이동(Controller)
	// V => View(화면 UI) => ~Panel
	// M => Manager
	
	public ControllPanel()
	{
		hp=new HomePanel(this);
		blp=new BoardListPanel(this); // 화면 이동
		bip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this); // 자체에서 이동
		bdel=new BoardDeletePanel(this);
		bup=new BoardUpdatePanel(this);
		fcp=new FoodCategoryListPanel(this);
		fdp=new FoodDetailPanel(this);
		ffp=new FoodFindPanel(this);
		setLayout(card);
		add("home", hp);
		add("chat", cp);
		add("board", blp);
		add("news", np);
		add("insert", bip);
		add("detail", bdp); // 화면 이동
		add("delete",bdel);
		add("update", bup);
		add("catefood", fcp);
		add("fdetail", fdp);
		add("find", ffp);
		// => @RequestMapping("")
		// => app.get("")
	}
}