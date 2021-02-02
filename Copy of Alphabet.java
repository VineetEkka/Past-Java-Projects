import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.print("Enter any words and enter the word done to end the program: ");

        List<String> words = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
//        String first="";
//        String last=" ";
//        String phrase = sc.nextLine();
//        first=phrase;

        while (true) {

            String phrase = sc.nextLine();
            if (phrase.equals("done")) {
                break;
            }
            words.add(phrase);

        }

        // quality code
        Collections.sort(words);

        System.out.print(words);


    }
}
