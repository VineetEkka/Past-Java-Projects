

public class StringTest {
    public static void main(String[] args) {
        System.out.print(bling("amrits"));


    }

    public static String bling(String toBling) {
        String letter = "";
        String blinged = "";
        for (int i = 0; i < toBling.length(); i++) {
            letter = toBling.substring(i, i + 1);
            if (letter.equals("s") || letter.equals("S")) {
                blinged += "$";

            } else if (letter.equals("a") || letter.equals("A")) {
                blinged += "@";


            } else {
                blinged += letter;
            }
        }

        return blinged;
    }
}
