import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.image.*;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class SnowRunner extends Applet implements ActionListener {
    Timer snowTimer=new Timer(2,this);
    Image frame;
    Graphics frameGraphics;
    public void update(Graphics g){
        paint(g);
    }
    int randCount=0;
    Snower[] cokane=new Snower[1000];
    public void init(){
        frame=createImage(800,600);
        frameGraphics=frame.getGraphics();
        for(int i =0;i<cokane.length;i++){
            cokane[i]=new Snower();
        }
        snowTimer.start();
        setSize(800,600);

    }
    public void paint(Graphics g){
        frameGraphics.setColor(new Color(66,134,244));
        frameGraphics.fillRect(0,0,800,600);
        for(int i=0;i<cokane.length;i++)
            cokane[i].display(frameGraphics);
        g.drawImage(frame,0,0,this);

    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<cokane.length;i++){
            cokane[i].fall(true);
            //snowTimer.setDelay(30);
        }

        if(randCount>1000){
            repaint();
            snowTimer.setDelay(30);
        }
        else randCount++;
    }


}
