import java.util.Random;
import java.util.Scanner;

public class Wacko {
    public static void main(String[] args) {
        Random g=new Random();
        Scanner input= new Scanner(System.in);

        //for(double b=0;b<1.0;b+=0.1){
          //  System.out.println(b);
        //}


        //for(double z=1.00;z>0.0;z-=0.2){
          //  System.out.println(z);
        //}


        //System.out.println(1.0/0);
       // System.out.println(1/0);
        //System.out.println(Math.sqrt(-25));
        /*
        System.out.println(.25+.10+.05+.01);
        if(.25+.10+.05+0.01==.41){
            System.out.println("equal");
        }
        else{
            System.out.println("No");
        }
        if(0.01+.05+.10+.25==.41){
            System.out.println("equal");
        }
        else{
            System.out.println("no");
        }
        System.out.println(.01+.05+.10+.25);

        */
        /*
        System.out.println("What is it in Cel: ");
        double C=input.nextDouble();
        double F= 9.0/5.0*C+32.0;
        System.out.println(F);
        System.out.println(F==69.8);*/

        System.out.println(1.21 %.25);
        System.out.println(121%25);
        System.out.println(121.0%25.0);



        int var=45;
        System.out.println("var is "+ var++);
        System.out.println(var);

        int kk=0;
        int oo=0;
        kk+=5;
        oo=+5;

        System.out.println(kk);
        System.out.println(oo);
        //System.out.println((int)(Math.random(10)));
        int a=3,b=7,c=10,d=-20;
        System.out.println(a+b<c+d);



    }
}
