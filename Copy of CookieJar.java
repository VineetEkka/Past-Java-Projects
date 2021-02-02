/**
 * Created by 2019591 on 3/15/18.
 */
public class CookieJar {
    public static void main(String[] args) {
        Cookie waffer=new Cookie("Vanilla");

        Tagalong tag=new Tagalong("Mint","Mint",true);
        waffer.getFlavor("vanilla");
        if (tag == null) {
            tag = new Tagalong();
        }
        System.out.println();
        //System.out.println(waffer.getFlavor("vanilla"));