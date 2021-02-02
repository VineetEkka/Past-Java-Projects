import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        String first="", last="",input="";
        Scanner sc= new Scanner((System.in));

        while(!input.equals("STOP")){
            System.out.print("Enter a word: ");
            input=sc.next();
            if (input.equals("STOP")){
                break;
            }
            if(first.equals("")||input.compareTo(first)<0)first=input;
            if(last.equals("")|| input.compareTo(last)>0)last=input;
        }
        System.out.println(first);
        System.out.println(last);
    }
}
