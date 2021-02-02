import java.util.Scanner;
import java.util.Random;
public class RapName {
    public static void main(String[]args)
    {Scanner sc =new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first=sc.nextLine();
        System.out.println("Enter your last name:");
        String last=sc.nextLine();
        Random name=new Random();
         String [] prefix={ first, " Dj "," Meister "," Big "," Mugshot "," Funky "," Hombre "," Señor "};
         String [] suffix={last,"Smithy","Yung","Boy","Daddy","Bones","Chaos","EHS","C++","Java"};
        for(int i=0;i<5;i++) {
            System.out.println("What's up " + prefix[name.nextInt(8)] + suffix[name.nextInt(10)]);
        }






    }













}
