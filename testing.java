import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0, input = 0;
        int count = 0;
        input = sc.nextInt();
        while(input != 0){
            input = sc.nextInt();
            sum += input;
            count ++;
        }
        System.out.print(sum/count);



    }

}
