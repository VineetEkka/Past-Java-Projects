import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin[]=new int[10];
        int num = 0;
        int counter=0;
        int n=0;
        boolean isFalse=false;
        System.out.println("1)Binary--->Decimal");
        System.out.println("2)Decimal---->Binary");
        String str="";
        String btr="";
        int choice=sc.nextInt();

        if(choice==1){
            System.out.print("Type in binary number");
            btr=sc.next();

            for(int i=0;i<btr.length();i++) {
                if (!Character.isDigit(btr.charAt(i))) {
                    System.out.println("Please try again using 1 or 0");
                    isFalse=true;
                    break;
                }
                else if(btr.charAt(i)!=('1')&& btr.charAt(i)!=('0')){
                    System.out.println("Please use 1 or 0 so try again");
                    isFalse=true;
                    break;
                }
            }


                for(int i=0;i<btr.length();i++){
                    if(btr.charAt(i)=='1'){
                        n=(int)(n+Math.pow(2,btr.length()-1-i));
                    }
                }
                if(!isFalse){
                    System.out.println("The decimal number is: "+n);
                }



        }
        else if(choice==2){
            System.out.print("Type in decimal number: ");
            str=sc.next();
            num=Integer.parseInt(str);
            while(num!=0){
                bin[counter++]=num%2;
                num=num/2;


            }
            counter--;
            System.out.println(str+ " in binary is: ");
            for(int i =counter;i>=0;i--){
                System.out.print(bin[i]);
            }

        }
        else{
            System.out.println("Please use type in better numbers ");
        }


    }

}
