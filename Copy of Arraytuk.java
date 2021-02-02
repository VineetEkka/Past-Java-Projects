import java.util.Scanner;




public class Arraytuk {
    public static void main(String[] args) {
        int[]numtuk= new int[15];
        Scanner sc=new Scanner(System.in);
        int choice =0;
        int Max=0, Min=0;
        //int choice1;
        //int index,value;
       // int sum;

        //numtuk=10; BAD/Numbers is an array, 10 is an int, can't =each other
        while(true) {


            System.out.println("1)Change all values");
            System.out.println("2)Change one value");
            System.out.println("3)Find Sum and average");
            System.out.println("4)Find Min and Max");
            System.out.println("5)Search for a value");
            System.out.println("6)Print all values");
            choice = sc.nextInt();
            if (choice == 1) {
                //int choice=0;

                System.out.println("1)Same Number");
                System.out.println("2)Different Numbers");
                int choice1 = sc.nextInt();

                if (choice1 == 1) {
                    System.out.println("What number?");
                    int wow = sc.nextInt();
                    System.out.println(changeAll(numtuk, wow));
                    for (int i = 0; i > numtuk.length; i++) {
                        System.out.println(numtuk[i]);
                    }


                }
                if (choice1 == 2) {
                    changer(numtuk);


                }


            }


            if (choice == 2) {
                System.out.println("What number? between 0-15:");
                int index = sc.nextInt();
                System.out.println("Enter a new number for that index:" + index);
                numtuk[index] = sc.nextInt();
                //System.out.println(numtuk[index]);

            }
            if (choice == 3) {
                System.out.print("Sum:");
                System.out.println(summer(numtuk));
                System.out.println("Average:" + (summer(numtuk) / 15));


            }
            if (choice == 4) {
                System.out.println("Min:" + (max(numtuk)) );
                System.out.println("Max:" + (min(numtuk)) );

            }
            if (choice == 5) {
                System.out.println("What is your number?: ");
                int wow = sc.nextInt();
                find(numtuk,wow);
                if(find(numtuk,wow)){
                    System.out.println("Your number is in the array");
                }
                else{
                    System.out.println("Your number is not in the array");
                }





            }
            if (choice == 6) {
                for (int i = 0; i < numtuk.length; i++) {
                    System.out.println(numtuk[i]);
                }


            }
        }




















       // for(int i =0;i<numtuk.length;i++){
       //     System.out.print(numtuk[i]+" ");
       // }


        /*
            print all values in the array
            1) Change all values
                1)Same number
                2)Different numbers
            2)Change one value
                Index:
                Value:
            3)Find sum and average
            4)Find Min and Max
            5)Search for a value





         */
    }




    public static int changeAll(int[]values, int value){

        for(int i=0;i<values.length;i++){
            values[i]=value;
        }
        return value;
    }

    public static int lastValue(int[] values){

        return values[values.length-1];
    }

    public static int summer(int[]values){
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }
    public static void changer(int[]values){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<values.length;i++){
            System.out.println("What number?");
            int value =sc.nextInt();
            values[i]=value;
        }

    }
    public static int min(int[]values ){
        int min=values[0];

        for(int i=0;i<values.length;i++){

        if (values[i]<min) {
                min = values[i];
            }

        }
            return min;
        }









    public static int max(int[]values) {
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }


        }
        return max;
    }

    public static  boolean find(int[]values, int value){
        boolean istrue=false;
        for(int i=0;i<values.length;i++){
            if(value==values[i]){
                istrue=true;
            }

            else{
                return false;
            }
        }
        return istrue;
        }






    }











