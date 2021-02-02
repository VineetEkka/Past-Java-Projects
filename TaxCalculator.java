import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int choice = 0;
        double inc = 0;
        int dep = 0;
        double tax = .2;
        double yearst=0.0;
        double yearF=0.0;
        double fica=0.0;
        double posttax=0.0;
        double pretax=0.0;

        double income = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for part one or enter 2 for part 2 of TaxCalulator");
        choice=sc.nextInt();
        if (choice == 1) {
        System.out.println("Enter Gross Income: ");
        inc = sc.nextDouble();
        System.out.println("Enter the number of dependents: ");
        dep = sc.nextInt();
        income = (inc - 10000) - (dep * 2000);
        double something = income * tax;
        System.out.println("The income tax is: " + something);
    }
        if(choice==2){
            System.out.println("Enter the bi-weekly salary");
            double biweek=0;
            biweek=sc.nextDouble();
            income=biweek*26;
            if(income>0.0) {
                System.out.println("Your yearly salary is " + income);
                System.out.println("Enter you pre-tax and post-tax deduction");
                System.out.print("Pre-Tax: $");
                pretax = sc.nextDouble();
                System.out.print("Post-Tax: $");
                posttax = sc.nextDouble();




                if (income > 0 && income <= 20000) {
                    yearst = .014;
                    yearF = .0370;
                    fica = .0765;


                } else if (income > 20000 && income <= 35000) {
                    yearst = .0175;
                    yearF = .0796;
                    fica = .0765;


                } else if (income > 35000 && income <= 40000) {
                    yearst = .035;
                    yearF = .1109;
                    fica = .0765;

                } else if (income > 40000 && income <= 75000) {
                    yearst = .05525;
                    yearF = .1251;
                    fica = .0765;

                } else if (income > 75000 && income <= 400000) {
                    yearst = .06370;
                    yearF = .17460;
                    fica = .07650;
                } else if (income > 400000 && income >= 500000) {
                    yearst = .087;
                    yearF = .3034;
                    fica = .0765;
                }

                double nestax = (yearst * biweek);
                double neFstax = (yearF * biweek);
                double nefica = (fica * biweek);
                double TakeHome = (biweek - (pretax + posttax + nestax + neFstax + nefica));


                System.out.println("Gross Paycheck: $" + biweek);
                System.out.println("Pre-Tax Deduct: $" + pretax);
                System.out.println("PostTax Deduct: $" + posttax);
                System.out.println("State Taxes: $" + Math.round(nestax * 100.0) / 100.0);
                System.out.println("Federal Taxes: $" + Math.round(neFstax * 100.0) / 100.0);
                System.out.println("FICA Deduction: $" + Math.round(nefica * 100.0) / 100.0);
                System.out.println("-----------------------");
                System.out.println("Take Home Salary: $" + TakeHome);


            }
            else{
                System.out.println("This income would not work in the calculator");
            }
        }
        else{
            System.out.println("Please use numbers 1 or 2");
        }


    }
}
