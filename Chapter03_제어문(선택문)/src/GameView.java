import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
   Image back,horse;
   int x=20,y=560;
   public GameView()
   {
	   back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
	   horse=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\horse.gif");
   }
   public void paint(Graphics g)
   {
	   g.drawImage(back,0,0,getWidth(),getHeight(),this);
	   g.drawImage(horse,x,y,150,100,this);
   }
}
