import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class Shapetuk extends Applet {
    public void init(){
         try {Thread.sleep(50);}catch(Exception e){};
        setSize(550,301);


    }

    public void paint(Graphics g){
        g.drawRect(0,40,100,230);
        Color blue=new Color(0,0,153);
        g.setColor(Color.blue);
        g.fillOval(225,40,100,230);
        g.setColor(Color.red);
        g.fillRect(449,40,100,230);



    }


}
