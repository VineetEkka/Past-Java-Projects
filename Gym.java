import java.util.Scanner;

/**
 * Created by 2019591 on 12/21/17.
 */
public class Gym {
    public static void main(String[] args) {

        String Name;
        int calorieIntake;
       int CurrentWeight;
        int GoalWeight;
       String ExerciseName;
         int ExerciseTime;
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello welcome to the Gym");
        System.out.print("Who are you?:");
        Name=sc.next();
        System.out.print("What is your calorie intake(Must be above 2000");
        calorieIntake=sc.nextInt();
        System.out.print("What is your current weight?:");
        CurrentWeight=sc.nextInt();
        System.out.print("What is the weight you want to achieve and in this gym your goal weight must be lower than your current weight:");
        GoalWeight=sc.nextInt();

        System.out.println("Which exercise do you want to do. Sorry for the inconvenience because we are a new gym we only have three exercise to do ");
        System.out.println("1)Walking");
        System.out.println("2)Running");
        System.out.println("3)Swimming");
        ExerciseName=sc.next();

        System.out.print("How much time are you going to exercise for:");
        ExerciseTime=sc.nextInt();

        GymUser h = new GymUser(Name,calorieIntake,CurrentWeight,GoalWeight,ExerciseName,ExerciseTime);
        System.out.println("You would need to lose"+(h.getCurrentWeight()-h.getGoalWeight())+"pounds");








    }

}
