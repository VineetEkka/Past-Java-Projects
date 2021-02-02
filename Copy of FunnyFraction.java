
public class FunnyFraction {
    private int numererator;
    private int denominator;

    public FunnyFraction(int n, int d){
        numererator=n;
        denominator=d;
        if(denominator==0){
            denominator=1;
        }
    }
    public FunnyFraction funnyModulus(FunnyFraction f, int factor){
        return new FunnyFraction(factor*(this.numererator-f.numererator),(factor*this.denominator)+f.denominator);

    }


    public String toString(){
        return this.numererator+"/"+this.denominator;
    }


}
