import java.awt.*;
import java.awt.Graphics;


public class Circle {
    private int radius;
    private boolean filled;
    private boolean isoverlap;
    private int score;
    private Font myfont = new Font("Century Gothic", Font.BOLD, 16);
    private Color color;
    private int cx, cy;

    public Circle(int setRadius, Color setcolor, int setcx, int setcy, boolean f, boolean o) {
        radius = setRadius;
        color = setcolor;
        cx = setcx;
        cy = setcy;
        filled = f;
        isoverlap = o;
        score = 0;


        }

    public void display(Graphics sg) {
        if (isoverlap) sg.setColor(Color.RED);
        else sg.setColor((color));


        if (filled) {
            sg.fillOval(cx - radius, cy - radius, 2 * radius, 2 * radius);

        } else {
            sg.drawOval(cx - radius, cy - radius, 2 * radius, 2 * radius);


        }
        sg.setColor(Color.black);

        if(score>=500){

            sg.drawString("Winner",cx,cy);

        }else sg.drawString("" + score, cx, cy);



    }

    public void upy() {
        cy -= 10;
    }

    public void downy() {
        cy += 10;
    }

    public void leftx() {
        if(score)
        cx -= 10;

    }

    public void rightx() {
        cx += 10;
    }

    public boolean setfilled(int f) {
        if (filled == true) {
            return true;
        }
        return false;


    }
    public void win(Circle other){
        if(score>=500){
            other.
        }
    }
    public void tag(Circle other){
        int xdiffer = (other.cx - cx) * (other.cx - cx);
        int ydiffer = (other.cy - cy) * (other.cy - cy);
        double distance = Math.sqrt(xdiffer + ydiffer);
        isoverlap = distance <= radius + other.radius;
        if(other.isoverlap=isoverlap){
            score++;
        }


    }

    public boolean overlaps(Circle other) {
        int xdiffer = (other.cx - cx) * (other.cx - cx);
        int ydiffer = (other.cy - cy) * (other.cy - cy);
        double distance = Math.sqrt(xdiffer + ydiffer);
        isoverlap = distance <= radius + other.radius;
        other.isoverlap = isoverlap;
        return isoverlap;

    }

    public void collison() {

        isoverlap = true;


    }

    public void returner() {
        isoverlap = false;
    }


    public double getArea() {
        double area = (radius * radius * 3.14);
        return area;

    }


    public double getCircumfrence() {
        double circumfrence = (2 * 3.14 * radius);
        return circumfrence;


    }


}

