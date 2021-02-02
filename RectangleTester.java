

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectuck= new Rectangle();
        System.out.print("1:"+ rectuck.length());
       System.out.println("2:"+ rectuck.setLength(10));
        System.out.println("3:"+ rectuck.length());
        System.out.println("3A:"+ rectuck.area());
        System.out.println("3B:"+ rectuck.perimeter());
        System.out.println("4:" + rectuck.setLength(-7));
        System.out.println("5:"+ rectuck.length());
        System.out.println("5A:"+ rectuck.area());
        System.out.println("5B:"+ rectuck.perimeter());

    }
}
