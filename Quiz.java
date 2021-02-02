import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int min;
        int max;
         int sum=0;
        int counter =0;

        Scanner sc=new Scanner(System.in);

       // System.out.print("Enter a Value:");

        //int input=sc.nextInt();
        int termin=0;
        System.out.println("Enter a terminating integer: ");
        termin=sc.nextInt();
        int input=0;
        
        min=max=input;

        int lastEntered=0;




        while (true){
            System.out.print("Enter a Value: ");
            input=sc.nextInt();
            //min=max=input;



            if(input==termin){
                break;
            }

            if(input<min ||){
                min=input;
            }
            if(input>max||counter==1){
                max=input;
            }
            sum+=input;

            counter++;
        }
        //sum-=termin;
        //counter--;

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        System.out.println("The average is: " + (sum/counter));
        System.out.println("THe sum is: "+ sum);
        System.out.println(counter);
    }
}
