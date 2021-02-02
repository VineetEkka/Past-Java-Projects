
import java.util.Scanner;
public class Math {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Temp in F(1) or C (2) or K (3)");
        int input=sc.nextInt();
        if(input==1)
        { System.out.println("Input Fahrenheit Temperature: ");
            double tempc=sc.nextDouble();
            System.out.println("The temperature in Celsius is: " + (tempc-32)/1.8);
            System.out.println("The temperature in Kelvin  is: " + ((tempc+459.67)*(5.0/9.0)));

        }
        else if(input==2)
        {System.out.println("Input Celsius Temperature: ");
            double tempf=sc.nextDouble();
            System.out.println("The temperature in fahrenheit " +((tempf*(9.0/5)) +32));
            System.out.println("The temperature in Kelvin  is: " + (tempf+273.15));


        }
        else if(input==3)
        { System.out.println("Input Kelvin Temperature");
            double tempk=sc.nextDouble();
            System.out.println("The temperature in fahrenheit"+ (tempk*(9.0/5)-459.67));
            System.out.println("The temperature in Celsius: " + (tempk-273.15));

        }
        else{
            System.out.println("You used the wrong number");


            

        }


    }
}
