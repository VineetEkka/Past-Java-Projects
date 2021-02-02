import java.util.Scanner;

public class Secret {
    public static void main(String[] args) {
        String message="";
        int summer=0;
        int sumn=0;
        int oddsumn=0;
        int evensumn=0;
        int od=0;
        int threeoddsumn=0;
        int threeevensumn=0;
        String as;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your message:");
        message=sc.nextLine();
        if(isValidLength(message)==false){
            message=message.substring(0,message.length()-2);
        }
        summer=SumOf(message);
        sumn=SumOf(message);


        if((getNumDigits(summer))%3==0){
            oddsumn=sumn*10;
            od=oddsumn;
            if(oddsumn<=4000){
                oddsumn*=4;
            }

        }
        else{
            if(sumn<=4000)
            evensumn=sumn*4;
        }

        if(getNumDigits(oddsumn)%3==0|| getNumDigits(evensumn)%3==0){
            threeoddsumn=oddsumn/10;
            threeevensumn=evensumn/10;

        }

        if(getNumDigits(oddsumn)%3==0||getNumDigits(oddsumn)%5==0||getNumDigits(oddsumn)%7==0){
            as=""+ threeoddsumn;
        }
        else {
            as=""+ oddsumn;
        }


        String start=as.substring(0,2);
        String end=as.substring(2,as.length());
        String nextstart;
        String nextend;
        int starter=0;
        int ender=0;
        if(Integer.parseInt(start)<=65){
            starter= Integer.parseInt(start)+61;
            nextstart=""+ starter;

        }
        else{
            nextstart=start;
            starter=Integer.parseInt(start);
        }

        if(Integer.parseInt(end)<=65){
            ender=Integer.parseInt(end)+61;
            nextend=""+ender;
        }

        else {
            nextend=end;
            ender=Integer.parseInt(end);
        }









        if(isValidLength(message)==true){
            System.out.println("The Sum of ASCII: "+SumOf(message));//move this line near the end of the program
            //System.out.println("1#Digits: "+getNumDigits(summer));
            System.out.println("Odd number of digits: "+ od);
            if((getNumDigits(summer))%3==0){
                if(od<=4000) {
                    System.out.println("Less than 4000: " + oddsumn);
                }
                else{
                    System.out.println("More than 4000: "+ oddsumn);
                }


                if(getNumDigits(oddsumn)%3==0||getNumDigits(oddsumn)%5==0||getNumDigits(oddsumn)%7==0){
                    System.out.println("Odd number of digits: "+ threeoddsumn);
                }
                else{
                    System.out.println("Even number of digits");
                }
                System.out.println("The two pairs are: "+ nextstart+","+ nextend);
                System.out.print("Secret Code: ");
                System.out.print(getSecretCode(starter));
                System.out.print(getSecretCode(ender));

            }

            else{
                System.out.println("Even number of Digits: "+ evensumn);
                if(sumn<=4000){
                    System.out.println("Less than 4000: "+ evensumn);
                }
                else {
                    System.out.println("More than 4000: "+ evensumn);
                }

                if(getNumDigits(evensumn)%3==0){
                    System.out.println("Odd number of digits:"+ threeevensumn);
                }
                else{
                    System.out.println("Even number of digits");
                }
                System.out.println("The two pairs are: "+ nextstart+","+ nextend);
                System.out.print("Secret Code: ");
                System.out.print(getSecretCode(starter));
                System.out.print(getSecretCode(ender));



            }
        }
        else{
            System.out.println("Your message doesn't work");
        }
    }
    public static int SumOf(String s){
        int sum=0;
        char t=' ';
        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            sum+=(int)t;
        }
         return sum;
    }

    private static boolean isValidLength(String s){
        if(s.length()>=2 && s.length()<=12){
            return true;
        }
        else{
            return false;
        }

    }

    private static int getNumDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    private static String getSecretCode(int num){
        String secret="";
        secret=Character.toString((char)num);


        return secret;
    }
}
