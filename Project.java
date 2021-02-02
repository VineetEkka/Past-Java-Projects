import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        String phrase=sc.nextLine();
        System.out.println(EveryotherChar(phrase));
        System.out.println(vowel(phrase));
        System.out.print(toUpperCase(phrase));
        System.out.println(UppercasePhrase(phrase));
        System.out.println(toReverse(phrase));
        System.out.println(ReverseCapital(phrase));
        System.out.println(Palindrome(phrase));

        if(Palindrome(phrase)== true){
            System.out.println("The word is a palindrome");
            System.out.println(phrase);
        }
        else{
            System.out.println("The word is not a palindrome");

        }




    }
    /*
    public static String bling(String toBling) {
        String letter = "";
        String blinged = "";
        for (int i = 0; i < toBling.length(); i++) {
            letter = toBling.substring(i, i + 1);
            if (letter.equals("s") || letter.equals("S")) {
                blinged += "$";


            }else {
                blinged += letter;
            }
        }

        return blinged; */
    public static String vowel(String toPhrase) {
        String letter = "";
        String phrase="";
        for(int i=0;i<toPhrase.length();i++) {
            letter=toPhrase.substring(i,i+1);


            if (letter.equals("A") || letter.equals("a")) {
                phrase+="";

            }
            else if ((letter.equals("E") || letter.equals("e"))) {
                phrase+="";


            }
            else if (letter.equals("I") || letter.equals("i")) {
                phrase+="";


            }
            else if (letter.equals("O") || letter.equals("o")) {
                phrase+="";


            }
            else if (letter.equals("U") || letter.equals("u")) {
                phrase+="";


            }
            else {
                phrase += letter;


            }
        }
        return phrase;


    }






    public static String EveryotherChar(String s){
        String ret = "";
        for(int i=0;i<s.length();i+=2) {
            System.out.print(s.charAt(i));
        }
        return ret;





    }


   public static String UppercasePhrase(String phrase){
        String capitalize = "";
        String first="";

        String Uppercasephrase=phrase.substring(0,1);

       return(Uppercasephrase.toUpperCase() + phrase.substring(1));






    }

    public static String toUpperCase(String phrase) {
        String capitalize = "";
        System.out.println(phrase.toUpperCase());

        return capitalize;
    }

    public static String toReverse(String phrase){
        String wow="";
        for(int i =(phrase.length()-1); i>=0;i--){
        wow+=(phrase.charAt(i));

        }



        return wow;

    }
    public static String ReverseCapital(String phrase){
        String ret = "";
        for(int i =(phrase.length()-1); i>=0;i--){
            if(i%2==0){
                ret+=(phrase.charAt(i));
            }
            else{
                ret+=(Character.toUpperCase(phrase.charAt(i)));
            }

        }



        return ret;

    }

    public static boolean Palindrome(String phrase) {

        int n = phrase.length();
        for (int i = 0; i < (n / 2); i++) {
            if (phrase.charAt(i)!=phrase.charAt(n-i-1)){
                return false;
            }
            else {
                return true;
            }


        }
        return true;

        }

        }










