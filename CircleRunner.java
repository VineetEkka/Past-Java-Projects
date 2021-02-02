import keyApplet.KeyApplet;



import java.awt.Graphics;
import java.awt.Color;


public class CircleRunner extends KeyApplet {
    Circle circly = new Circle(50, Color.BLUE, 50, 50, true,false);
    Circle circletuk = new Circle(50, Color.GREEN, 500, 500,true,false);
    //Circle  circo=new Circle(100,Col


    public void init() {
        setSize(800, 600);
    }

    public void paint(Graphics g) {
        circly.display(g);
        circletuk.display(g);

    }

    public void pressKey(String keyName) {
        if (keyName.equals("UP")) {
            circly.upy();
            circly.tag(circletuk);

        }


        if (keyName.equals("DOWN")) {
            circly.downy();
            circly.tag(circletuk);

        }

        if (keyName.equals("LEFT")) {
            circly.leftx();
            circly.tag(circletuk);
        }
        if (keyName.equals("RIGHT")) {
            circly.rightx();
            circly.tag(circletuk);
        }
        if (keyName.equals("W")) {
            circletuk.upy();
            circletuk.tag(circly);
        }


        if (keyName.equals("S")) {
            circletuk.downy();
            circletuk.tag(circly);
        }
        if (keyName.equals("A")) {
            circletuk.leftx();
            circletuk.tag(circly);
        }
        if (keyName.equals("D")) {
            circletuk.rightx();
            circletuk.tag(circly);

        }
        circletuk.overlaps(circly);

    }




}
