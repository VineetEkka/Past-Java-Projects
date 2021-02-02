import java.awt.*;
import java.awt.Graphics;
import keyApplet.KeyApplet;
public class Square {
    private int length;
    private Color color;
    /** The coordinates of the center of the Square **/
    private int cx,cy;

    public Square(int setlength, Color setcolor, int setcx, int setcy){
        length=setlength;
        color=setcolor;
        cx=setcx;
        cy=setcy;



    }



    public void  display(Graphics sg){
        sg.setColor(color);
        sg.fillRect(cx-length/2,cy-length/2,length,length);

    }
    public void upy(){
        cy-=10;
    }
    public void downy(){
        cy+=10;
    }
    public void leftx(){
        cx-=10;

    }
    public void rightx(){
        cx+=10;
    }
    public void grow(){
        length+=5;

    }
    public void shrink(){
        length-=5;
    }







}

