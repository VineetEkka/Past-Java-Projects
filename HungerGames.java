import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 2019591 on 1/29/18.
 */
public class HungerGames {
    public static void main(String[] args) {
        ArrayList<String>java=new ArrayList<String>();

        Scanner sc= new Scanner(System.in);

        java.add("Mr.K");
        java.add("VinYeet");
        java.add("JayShawn");
        java.add("KevLing");
        java.add("Amrick");
        java.add("BigBoi");
        java.add("Hunzum");
        java.add("SumantIsBeast");


        int ko=(int)(Math.random()*8);

        java.remove(ko);
        int choice=1;
        int add=0;

        for (int i = 0; i < java.size(); i++) {


        }


        System.out.println("Pick 1 to remove or 0 to quit");
        while (choice>0){
            add=sc.nextInt();
            choice+=add;
            java.remove(ko);
            System.out.println(java);
            if(add==0){
                break;
            }
        }


    }
}
