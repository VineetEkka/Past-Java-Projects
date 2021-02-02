
public class Main {
    public static void main(String[] args) {
        System.out.println(Square.length);
        System.out.println(Numbers.favoriteNumber);

        //Numbers is the name of class, so this valid code
        System.out.println(Numbers.average(12,14));

        //Square is the name of the class, so this is not valid
        System.out.println(Square.area());



        //s1 is a Squre object, so this is valid
        Square s1=new Square(10);
        Square s2=new Square(5);

        System.out.println(s1.area()+ " " + s2.area());

    }
}
