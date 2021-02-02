/**
 * Created by 2019591 on 11/21/17.
 */
public class Circle {
    private int radius;

    public Circle(int r){
        radius=r;

    }
    public Circle(){
        radius=0;
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }
    public double getDiamter(){
        return (radius*2);
    }
    public double getCircumference(){
        return (2*Math.PI*radius);
    }

    public int getRadius(){
        return radius;
    }





}
