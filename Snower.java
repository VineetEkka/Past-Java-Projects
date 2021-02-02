import java.awt.*;
public class Snower {
    private int x, y, radius, speed;
    private static final int MAX_RADIUS=10;
    static final int windowWidth=800;
    static final int windowHeight=600;

    public Snower(){
        reset(false);
    }



    public void  reset(boolean onScreen){
        radius =(int)(Math.random()*(MAX_RADIUS-5))+3;
        y= -30-(int)(Math.random()*windowHeight);
        x=(int)(Math.random()*windowWidth)+1;
        speed= 5-radius/2+(int)(Math.random()*3);
    }
    public void fall(boolean onScreen){
        y+=speed;
        if(onScreen && y>windowHeight+30||(!onScreen && y>=-30)) {
            reset(onScreen);
        }
    }


    public void display(Graphics snowG){

        snowG.setColor(Color.white);
        snowG.fillOval(x-radius,y-radius,radius*2, radius*2);
    }



}
