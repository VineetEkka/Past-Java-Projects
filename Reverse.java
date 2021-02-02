import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first="", last="";
        System.out.println("Enter first name then last name");
        first=sc.next();
        last=sc.next();


        for(int i=first.length()-1;i>=0;i--)
            System.out.print(first.charAt(i));
        for(int i=last.length()-1;i>=0;i--)
            System.out.print(last.charAt(i));
    }
}
