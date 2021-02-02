import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 2019591 on 1/29/18.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String>Fruit=new ArrayList<String>();

        Fruit.add("Banana");
        Fruit.add("Apple");
        Fruit.add("Cantalope");
        Fruit.remove("Apple");
        System.out.println(Fruit);

        int counter=0;
        while(counter<4){
            String Fruits=sc.nextLine();
            counter++;
            Fruit.add(Fruits);


        }
        for (int i = 0; i < Fruit.size(); i++) {
            System.out.println(Fruit.get(i));

        }


    }
}
