import java.util.Scanner;
public class Elapser {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int smon=0;
        int emon=0;
        int totaldays = 0;
        int total=0;


        System.out.println("Enter: ");
        System.out.println("Year: ");
        int years=sc.nextInt();
        if(isLeapYear(years)==true){

        }
        System.out.println("start month");
        int smonth=sc.nextInt();

        if(smonth==1||smonth==3||smonth==5||smonth==7||smonth==8||smonth==10||smonth==12) {
            smon = 31;
        }
             else if(smonth==4||smonth==6||smonth==9||smonth==11){
                smon=30;
            }
            else if(smonth==2){
                smon=28;
            }
            else if(smonth==2 && isLeapYear(years)==true){
                 smon=29;
             }

        System.out.println("start day: ");
        int sday=sc.nextInt();
        System.out.println("end month:");
        int emonth=sc.nextInt();

        if(emonth==1||emonth==3||emonth==5||emonth==7||emonth==8||emonth==10||emonth==12) {

            emon = 31;
        }

            else if(emonth==4||emonth==6||emonth==9||emonth==11){
                emon=30;
            }
            else if(emonth==2){
                emon=28;
            }
            else if(emonth==2 && isLeapYear(years)==true){
                emon=29;
            }

        System.out.print("end day: ");
        int eday=sc.nextInt();

        int toti=smon-sday;



        int totalmon=emon-smon;

        int toto=toti+eday;


        if(smonth==emonth){
            totaldays=eday-sday;

        }

        for(int i=smonth;i<=emonth;i++){
            total+=smon;

        }
        System.out.println(total);

        if(smonth==emonth){
            System.out.println("The days elasped are: ");
            System.out.println(totaldays);
        }



        System.out.println("The days elasped are:");
        System.out.println(toto);

        /*
        for(int i=smonth;i<=emonth;i++){

        }
        int emon=sc.nextInt();


        System.out.println("Elapsed days: ");
        */





    }

    public static boolean isLeapYear(int years){
        if(years%4==0){
            return true;

        }
        return false;



    }
}
