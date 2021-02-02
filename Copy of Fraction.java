
public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int setnum, int setdenom){
        numerator=setnum;
        denominator=setdenom;

    }


    public int getNumerator()
    {
        return numerator;

    }
    public Fraction(){
         numerator=1;
         denominator=1;
    }

    public int getDenominator()
    {
        return denominator;


    }



    public boolean isBiggerThanOne()
    {
        if(((numerator*1.0)/(denominator*1.0))>1.0){
            return true;

        }
        return false;
    }

    public void setNumerator(int newNum)
    {
        numerator=newNum;

    }
    public void setDenominator(int newDenom){
        denominator=newDenom;
        if (denominator==0){
            denominator=1;

        }

    }


    public double getDecimalValue()
    {
        return ((numerator*1.0)/(denominator*1.0));


    }

    public boolean reduceFraction(){
        if(numerator%denominator || denominator%numerator){
            return true;
        }
        return false;

    }









}
