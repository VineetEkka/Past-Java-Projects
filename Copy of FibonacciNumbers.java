import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int input=1;
        int term=0;
        int a=1;
        int b=0;
        int fib=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a postive number or -1 to quit");

        while(input!=-1){
            input=sc.nextInt();
            if(input<-1||input==0){
                System.out.println("Try again");
            }
            else if(input==-1){
                System.out.println("QUIT");
            }
            else{
                for(int i=1;i<=input;i++){
                    fib=a+b;
                    a=b;
                    b=fib;
                    System.out.print(fib+" ");
                }
                System.out.println("Your "+input+"th term is: "+fib);





                }
            }

        }


    }

