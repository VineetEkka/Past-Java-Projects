import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        int min,max;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Value:");

        int total=sc.nextInt();

        min=max=total;

        int lastEntered=0;



        while (true){
            System.out.print("Enter a Value: ");
            total=sc.nextInt();



            if(total==lastEntered){
                break;
            }

            if(total<min){
                min=total;
            }
            if(total>max){
                max=total;
            }
            lastEntered=total;
        }

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);

    }
}
