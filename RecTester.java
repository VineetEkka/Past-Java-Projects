
public class RecTester {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2=new Rectangle(3,5);
        Rectangle r3= r1;


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        r1.multiply(5);
        System.out.println("");




        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }
}
