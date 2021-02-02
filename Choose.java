
import java.util.Random;
import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random name= new Random();
        int countw1=0;
        int countw2=0;

        System.out.println("Enter your first choice: ");
        String w1=sc.nextLine();


        System.out.println("Enter your second choice:" );
        String w2=sc.nextLine();

        int[] num={countw1,countw2};

        int integer=name.nextInt(2);
        for(int i=0;i<5;i++){
            System.out.print(name.nextInt(2));
            if(integer==0){
                countw1++;
            }
            if(integer==1){
                countw2++;
            }
        }

        //System.out.println("Re-enter your second choice:" );
        //String w22=sc.nextLine();
        String[] words={w1,w2};
        //String plus=" ";
        System.out.println("Choice 1 "+countw1+"Choice 2"+countw2);




    }
}
