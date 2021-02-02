
public class FractionTester {




    public static void main(String[] args) {

        Fraction Fro=new Fraction(2,5);
        Fraction Bro=new Fraction();


        System.out.println("Numerator: "+Fro.getNumerator());
        System.out.println("Denominator: "+Fro.getDenominator());
        System.out.println("Decimal: "+Fro.getDecimalValue());
        System.out.println("Greater: "+Fro.isBiggerThanOne());


        Bro.setNumerator(5);
        Bro.setDenominator(0);


        System.out.println("Numerator2: "+Bro.getNumerator());
        System.out.println("Denminator2: "+Bro.getDenominator());
        System.out.println("Decimal2: "+ Bro.getDecimalValue());
        System.out.println("Greater2: "+Bro.isBiggerThanOne());



















    }





}
