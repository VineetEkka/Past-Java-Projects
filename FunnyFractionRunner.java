
public class FunnyFractionRunner {
    public static void main(String[] args) {
        FunnyFraction f1=new FunnyFraction(1,2);
        FunnyFraction f2=new FunnyFraction(3,5);
        System.out.println(f1.funnyModulus(f2,2));
        FunnyFraction f3=new FunnyFraction(1,0);
        FunnyFraction f4=new FunnyFraction(3,5);
        System.out.println(f3.funnyModulus(f4,2));


    }
}
