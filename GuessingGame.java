
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){
        Random number = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Think of a number between 1-100");
        int integer= number.nextInt(100);
        int guess=sc.nextInt();

        if(guess==0) {
            System.out.println("O is not a choice");
            System.out.println("The number that was chosen was "+integer);



        }
        while(guess!=integer){
            if(guess<=integer){
                System.out.println("Higher");
                 guess=sc.nextInt();

            }

            else if(guess>=integer){
                System.out.println("Lower");
                 guess=sc.nextInt();
            }
        }
        if (guess==integer){
            System.out.println("Correct");
        }



        }












    }


