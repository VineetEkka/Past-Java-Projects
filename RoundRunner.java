import java.util.Scanner;

/**
 * Created by 2019591 on 11/21/17.
 */
public class RoundRunner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Circle Radius: ");
        int input;
        input=sc.nextInt();
        Circle circletest=new Circle(input);
        System.out.println(circletest.getRadius());
        System.out.println(circletest.getArea());


        int radius;
        double height;
        System.out.println("Cylinder Radius: ");
        radius=sc.nextInt();
        System.out.println("Cylinder Height: ");
        height=sc.nextDouble();
        Cylinder cylindertest=new Cylinder(radius,height);
        System.out.println(cylindertest.getVolume());


        System.out.println("Enter a new Circle's radius");
        int input2;
        input2=sc.nextInt();
        Circle circletesttwo=new Circle(input2);
        System.out.println("Area: "+ circletesttwo.getArea());
        System.out.println("Diameter: "+ circletesttwo.getDiamter());
        System.out.println("Circumference: "+ circletesttwo.getCircumference());




    }
}
