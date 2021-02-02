
public class Fractioner {
    private int numerator;
    private int denominator;

    public Fractioner(int num,int den){
        numerator=num;
        denominator=den;
        reduce();
        if(denominator==0){
            denominator=1;
        }

    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public Fractioner add(Fractioner newer){
        reduce();
        return new Fractioner (((this.numerator*newer.denominator)+(newer.numerator*this.denominator)),(this.denominator*newer.denominator));

    }
    public Fractioner subtract( Fractioner newer){
        reduce();
        return new Fractioner (((this.numerator*newer.denominator)-(newer.numerator*this.denominator)),(this.denominator*newer.denominator));

    }
    public Fractioner multiply(Fractioner newer){
        reduce();
        return new Fractioner((this.numerator* newer.numerator),(this.denominator* newer.denominator));

    }
    public Fractioner divide(Fractioner newer){
        reduce();
        return new Fractioner((this.numerator*newer.denominator),(this.denominator*newer.numerator));

    }
    public int gcd(int a, int b){
       while (a!=0 && b!=0){
            int c = b;
            b = a%b;
            a = c;
        }
        return a+b;



    }
    public void reduce(){
        int gcd = gcd(numerator,denominator);
        if(gcd(numerator,denominator)!=0){
            numerator/=gcd;
            denominator/=gcd;
        }



    }

    public String toString(){
        return this.numerator+"/"+this.denominator;

    }


}
