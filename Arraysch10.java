import java.util.Scanner;

public class Arraysch10 {
    public static void main(String[] args) {

        int[] abc=new int[500];

        int i=3;
        int temp;
        double avgFirstFive;
        int sum=0;
        Scanner sc=new Scanner(System.in);


        abc[0]=78;
        abc[1]=66;
        abc[2]=((abc[1]+abc[0])/2);
        abc[i]=82;
        abc[i+1]=94;

        avgFirstFive=((abc[0]+abc[1]+abc[2]+abc[3]+abc[4]))/5;
        System.out.println(avgFirstFive);

        abc[3]=82;
        abc[4]=94;

        temp=abc[i];
        abc[i]=abc[i+1];
        abc[i+1]=temp;

        System.out.println(abc[3]);
        System.out.println(abc[4]);

        System.out.println(abc.length);

        for (int j = 0; j < abc.length; j++) {
            sum+=abc[j];

        }
        System.out.println(sum);

        int x=0;
        int count=0;

        for (int k = 0; k <abc.length ; k++) {
            if(x==abc[k]){
                count++;
            }

        }
        System.out.println(count);
        boolean found=false;


        String [] java= {"Mr.K","VinYeet","JayShawn","KevLing","Amrick","Sumantisbeast","BigBoi","Hunzum"};
        for (int h = 0; h < java.length ; h++) {
            if(java[h].equals("Sumantisbeast")){
                found=true;
                break;
            }

        }
        System.out.println(found);





        }





    }




