import javax.swing.Timer;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Baller extends Applet implements MouseListener,ActionListener {
    final int WIDTH=1200,HEIGHT=600;
    /*
    A timer is an object that calls the actionPerformed method repeatedly
    the time between method calls is set by the first parameter in the constructor
    every 30 ms
    2nd parameter is the file that contains the actionPerformed method

    (Baller.java)
   */
    Ball lamelo=new Ball(30,300,-15,4);
    Timer ballTimer=new Timer(15,this);
    int time =0;
    public void init(){
        setSize(WIDTH,HEIGHT);
        addMouseListener(this);
    }
    public void paint(Graphics g){
        lamelo.display(g);
        g.fillRect(0,HEIGHT-12,WIDTH,12);//top of the ground:HEIGHT -12

    }


    public void actionPerformed(ActionEvent e) {
        lamelo.move(time,HEIGHT-12);
        repaint();//Paint needs a parameter , repaint does not.
        time++;

    }
    /*
    This method is called whenevenr any button on the mouse is pressed and released as long as
    we jave called the method"addMouseListener

    will make ballTimer start calling actionPerformed every 30 ms
    it will keep calling actionPerformed until we call stop()

     */

    public void mouseClicked(MouseEvent e) {
        /*
        will make ballTimer start calling actionPerformed every 30 ms
        it will keep calling actionPerformed until we call stop()
        */
        ballTimer.start();

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
