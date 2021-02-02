/**
 * Created by 2019591 on 11/2/17.
 */
public class ok {
    public static void main(String[] args) {

        System.out.println(numberMadness(12345));

    }
    public void numberMadness(double myDouble)
    {
        int myInt = (int) myDouble;
        String myString = "";
        while(myInt != 0)
        {
            myString = myInt % 10 + myString;
            myInt /= 10;
        }
        System.out.println(myString);
    }
}
