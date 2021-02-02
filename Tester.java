/**
 * Created by 2019591 on 2/22/18.
 */
public class Tester {
    public static void main(String[] args) {
        String [][]Array=new String[10][10];
        String[]Letter={"A","B","C","D","E","F","G","H","I","J"};
        String[]Number={"1","2","3","4","5","6","7","8","9","10"};
        for(int r=0;r<Number.length;r++){
            System.out.print(Number[r]);
            for(int c=0;c<Array[0].length;c++){

                System.out.println(Letter[c]);

            }
        }

    }
}
