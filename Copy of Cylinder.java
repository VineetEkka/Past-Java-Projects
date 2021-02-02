/**
 * Created by 2019591 on 11/21/17.
 */
public class Cylinder {
     private Circle base;
    private double height;

    public Cylinder(int r, double h){
        base= new Circle(r);
        height=h;
    }

    public double getVolume(){
        return (base.getArea()*height);
    }

}
