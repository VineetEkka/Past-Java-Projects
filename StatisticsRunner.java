
public class StatisticsRunner {
    public static void main(String[] args) {
        Statistics java=new Statistics(6,6,6,1000);


        System.out.println(java);

        System.out.println("Average: "+java.calcAvg());

        System.out.println("Standard Deviation: "+java.StandardDeviation(java.stats));
        java.displayHistogram();



    }
}
