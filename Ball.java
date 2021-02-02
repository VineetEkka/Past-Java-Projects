import java.awt.*;

public class Ball {
    private int x, y;
    private double vspeed,hspeed;
    private double initVSpeed=0;
    private final int RADIUS=10;
    private int elacity ;
    private int bounceTime;

    public Ball(int startx,int starty, int startvSpeed, int starthSpeed){
        x=startx;
        y=starty;
        vspeed=1.1;
        initVSpeed=startvSpeed;
        vspeed=initVSpeed;
        hspeed=starthSpeed;

    }
    public void display(Graphics g){
        g.fillOval(x-RADIUS,y-RADIUS,RADIUS*2,RADIUS*2);

    }
    public void fall(){
        y+=10;
    }

    public void move(int time,int groundy){
        if(initVSpeed>-2.34){
            y+=vspeed;
        }
        y+=vspeed;
        x+=hspeed;
        vspeed=initVSpeed+0.98*(time-bounceTime);
        System.out.println(initVSpeed+" "+ vspeed);
        if(vspeed>0 && (y+RADIUS)> groundy){
            initVSpeed=-vspeed*2/3;
            bounceTime=time;
            y=groundy-1-RADIUS;
            if(vspeed<1){
                for(int i=4;hspeed>0;i--){
                    hspeed--;

                }
            }

        }
    }


}
