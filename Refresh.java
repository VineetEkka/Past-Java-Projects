import java.util.Scanner;
public class Refresh {
    public static void main(String[] args) {
        System.out.println("Put in the number of students");
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        System.out.println("How many students joined the class late");
        int tardestudent=sc.nextInt();

        int studenttotal=students+tardestudent;


        System.out.print("The number of students are ");
        System.out.println(studenttotal);

        System.out.println("How many students dropped the class");
        int studentdrop=sc.nextInt();

        int studenttotalnew=studenttotal-studentdrop;

        System.out.print("The new total amount of students are: ");
        System.out.println(studenttotalnew);

        int studentloan=2000*studenttotal;
        int studentfee=200*studentdrop;

        int collegefund=studentloan+studentfee;
        System.out.println("The total amount of money is:");
        System.out.print(collegefund);












    }
}
