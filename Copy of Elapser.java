import java.util.Scanner;

public class Elapser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int smon = 0;
        int emon = 0;
        int totaldays = 0;
        int total = 0;
        int smonth=0;
        int sday=0;
        int eday=0;
        int emonth=0;


        System.out.println("Enter: ");
        System.out.print("Year: ");
        int years = sc.nextInt();


            System.out.print("start month: ");
            smonth = sc.nextInt();

            if (smonth == 1 || smonth == 3 || smonth == 5 || smonth == 7 || smonth == 8 || smonth == 10 || smonth == 12) {
                smon = 31;
            } else if (smonth == 4 || smonth == 6 || smonth == 9 || smonth == 11) {
                smon = 30;
            } else if (smonth == 2) {
                smon = 28;
            } else if (smonth == 2 && isLeapYear(years) == true) {
                smon = 29;
            }




            System.out.print("start day: ");
             sday = sc.nextInt();
            System.out.print("end month: ");
             emonth = sc.nextInt();


                if (emonth == 1 || emonth == 3 || emonth == 5 || emonth == 7 || emonth == 8 || emonth == 10 || emonth == 12) {

                    emon = 31;
                } else if (emonth == 4 || emonth == 6 || emonth == 9 || emonth == 11) {
                    emon = 30;
                } else if (emonth == 2) {
                    emon = 28;
                } else if (emonth == 2 && isLeapYear(years) == true) {
                    emon = 29;
                }


            System.out.print("end day: ");
             eday = sc.nextInt();
             if((smonth==4&&sday==31)||(smonth==6&&sday==31)||(smonth==9&&sday==31)||(smonth==11&&sday==31)||((smonth==2&&isLeapYear(years) == true)&&(sday==30||sday==31))||(smonth==2&&isLeapYear(years) == false)&&(sday==29||sday==30||sday==31)||(emonth==4&&eday==31)||(emonth==6&&eday==31)||(emonth==9&&eday==31)||(emonth==11&&eday==31)||((emonth==2&&isLeapYear(years) == true)&&(eday==30||eday==31))||((emonth==2&&isLeapYear(years) == false)&&(eday==29||eday==30||eday==31))){
                 System.out.println("Please Try again, you inputed the wrong days for the months");
             }

            if(years>=0 && (smonth>=0&&smonth<=12)&&(sday>=0&&sday<=31)&&(eday>=0&&eday<=31)&&(emonth>=0&&emonth<=12)&&(smonth<=emonth&&emonth>=smonth)){

            int EndSubtract = emon - eday;


            if (smonth == emonth) {
                totaldays = eday - sday;

            }

            if (smonth == emonth) {
                System.out.println("The days elasped are: ");
                System.out.println(totaldays);
            }
            else if (smonth != emonth) {
                for (int i = smonth; smonth <= emonth; smonth++) {
                    if (smonth == 1 || smonth == 3 || smonth == 5 || smonth == 7 || smonth == 8 || smonth == 10 || smonth == 12) {
                        smon = 31;
                    } else if (smonth == 4 || smonth == 6 || smonth == 9 || smonth == 11) {
                        smon = 30;
                    } else if (smonth == 2 && isLeapYear(years) == false) {
                        smon = 28;
                    } else if (smonth == 2 && isLeapYear(years) == true) {
                        smon = 29;
                    }


                    total += smon;

                }

                System.out.println("Wow the days elasped are: ");
                System.out.print(((total - EndSubtract) - sday) + 1);


            }
            else{
                System.out.println("The days that you inputed are not possible");
            }

        }

        else{
            System.out.println("Please Try Again Because You inputed wrong values or the values are not possible");
        }








    }


    public static boolean isLeapYear(int years){
        if(years%4==0){
            return true;

        }
        return false;



    }
}
