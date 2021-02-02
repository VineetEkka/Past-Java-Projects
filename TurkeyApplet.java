import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;


public class TurkeyApplet extends Applet {
    public void init(){
        setSize(1000,1000);
        //setBackground(Color.bl);
    }

    public void paint(Graphics g){

        Color wow=new Color(204,102,0);
        Color Brown=new Color(102,51,0);



        g.setColor(Brown);
        g.fillOval(300,300,300,200);
        g.fillOval(300,170,50,200);
        g.fillOval(250,100,100,100);
        g.setColor(Color.YELLOW);
        g.fillOval(550,150,50,200);
        g.setColor(Color.RED);
        g.fillOval(500,120,50,200);
        g.setColor(wow);
        g.fillOval(440,110,50,200);
        g.setColor(Color.white);
        g.fillOval(270,125,25,25);
        g.setColor(Color.black);
        g.fillOval(270,130,15,15);
        g.setColor(Color.yellow);
        g.fillOval(220,140,45,25);
        g.setColor(Color.red);
        g.fillOval(270,190,25,30);
        g.setColor(Color.yellow);
        g.fillRect(420,480,15,100);
        g.fillRect(480,480,15,100);


    }






}

