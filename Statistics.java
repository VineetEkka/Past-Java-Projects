
public class Statistics {
    private int dice1;
    private int dice2;
    private int dice3;
    private int roll;
    public int[] stats;


    public Statistics(int d1,int d2,int d3,int r){
        roll=r;
        stats= new int[r];
        for(int i=0;i<r;i++){
           dice1 = (int)(Math.random()*d1)+1;
            dice2=(int)(Math.random()*d2)+1;
            dice3=(int)(Math.random()*d3)+1;

            stats[i]=dice1+dice2+dice3;



        }



    }


    public double calcAvg(){
        int total=0;

        for(int i=0;i<roll;i++){
            total+=stats[i];
        }
        return ((double)total/roll);

    }



    public int getMin(){
        int Min=stats[0];
        for (int i = 0; i < stats.length; i++) {
            if(stats[i]<Min){
                Min=stats[i];
            }

        }


        return Min;

    }
    public int getMax(){
        int Max=stats[0];
        for (int i = 0; i <stats.length; i++) {
            if(stats[i]>Max){
                Max=stats[i];
            }

        }
        return Max;

    }
    public double StandardDeviation(int[] stats){
        double mean=calcAvg();
        double sum1=0;

        for (int i = 0; i <stats.length ; i++) {
            sum1+=Math.pow(stats[i]-mean,2);

        }
        double vari=(sum1/roll);
        double std=Math.sqrt(vari);
        return std;

    }

    public void displayHistogram(){
        int []check={ 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        for (int i = 0; i <15; i++) {
            int count=0;
            String strick=" ";
            for (int j = 0; j <25 ; j++) {
                for (int k = 0; k <25; k++) {
                    if(check[i]==stats[k+(25*j)]){
                        count++;
                        if(count==5){
                            strick+="* ";
                            count=0;
                        }
                    }
                    
                }
                
            }
            System.out.println(check[i]+" | "+ strick);
            
        }

    }
    public String toString(){
        String l = "";

        for(int i = 0; i < 40; i++){

            for(int k = 0; k < 25; k++){

                l += stats[i + (25*k)] + "\t";

            }

            l += "\n";

        }

        return l;

    }












    }









