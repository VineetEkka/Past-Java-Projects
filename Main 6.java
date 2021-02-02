import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st favorite word: ");
        String w1 = sc.next();
        System.out.print("Enter your 2nd favorite word; ");
        String w2 = sc.next();

        System.out.print("Enter you favorite letter: ");
        String letter = sc.next();

        String newStr = w1 + w2;

        int count = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == letter.charAt(0)) {
                count++;
            }
         }
        System.out.println("Your favorite letter appears " + count + " times in your favorite words.");
    }

}
