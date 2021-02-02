/**
 * Created by 2019591 on 12/21/17.
 */
public class GymUser {
    private String GymName;
    private int calorieIntake;
    private int CurrentWeight;
    private int GoalWeight;
    private String ExerciseName;
    private int ExerciseTime;

    public GymUser(String n,int ci,int cw,int gw,String en,int et){
        GymName=n;
        calorieIntake=ci;
        CurrentWeight=cw;
        GoalWeight=gw;//i love you vineet
        ExerciseName=en;
        ExerciseTime=et;
    }

    public void setCurrentWeight(int cw){
        this.CurrentWeight=cw;
    }
    public void setGoalWeight(int gw){
        this.GoalWeight=gw;
    }

    public String getGymName(){
        return GymName;
    }

    public String getExerciseName(){
        return ExerciseName;
    }
    public int getExerciseTime(){
        return ExerciseTime;
    }

    public int getcalorieIntake(){
        return calorieIntake;
    }

    public int getCurrentWeight(){
        return CurrentWeight;
    }

    public int getGoalWeight(){
        return GoalWeight;
    }



    public int CurrentWeightCalories(){
        int CurrWeighCal;
        CurrWeighCal=getCurrentWeight()*3500;
        return CurrWeighCal;
    }
    public int GoalWeightCalories(){
        int GoalWeighCal;
        GoalWeighCal=getGoalWeight()*3500;
        return GoalWeighCal;
    }

    private boolean CheckCalorieIntake(){
        if(getcalorieIntake()>2800){
            System.out.println("You will need to diet");
            return false;
            else if(getcalorieIntake()<2700){
                return false;
            }
            else{
                return true;
            }

        }

        private int LoseWeight(){


        }
        private int Exercise{

        }
    }



    //To reach GoalWeight they need to lose 3500(n)



}
