import java.awt.Graphics;
import java.awt.Color;
import keyApplet.KeyApplet;
import java.math.*;



public class SquareRunner extends KeyApplet {
    Square squaretuk = new Square(20, Color.red, 400, 300);
    Square squary=new Square(20,Color.blue,300,400);.
    Square recty=new Square(30,Color.black,15,15);

    public void init() {
        setSize(800, 600);
    }

    public void paint(Graphics g) {
        squaretuk.display(g);
        squary.display(g);
        recty.display(g);
    }



    public void pressKey(String keyName) {
        if (keyName.equals("UP")) {
            squaretuk.upy();

        }
        if(keyName.equals("P")){
            squaretuk.grow();
        }

        if (keyName.equals("DOWN")) {
            squaretuk.downy();

        }
        if(keyName.equals("L")){
            squaretuk.shrink();
        }
        if (keyName.equals("LEFT")) {
            squaretuk.leftx();
        }
        if (keyName.equals("RIGHT")){
            squaretuk.rightx();
        }
        if(keyName.equals("W")){
            squary.upy();
        }
        if(keyName.equals("E")){
            squary.grow();
        }
        if(keyName.equals("F")){
            squary.shrink();
        }
        if(keyName.equals("S")){
            squary.downy();
        }
        if(keyName.equals("A")){
            squary.leftx();
        }
        if(keyName.equals("D")){
            squary.rightx();

        }



    }
}
