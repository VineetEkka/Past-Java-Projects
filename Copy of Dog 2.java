import java.util.Random;

public class Dog {
    private int age;
    private String name;
    private Dog friend;



    public Dog(){
         age=0;
        name=("No name yet");



    }


    public int increaseAge(){
        age++;
        return age;



    }


    public int age(){
        return age;
    }

    public String name(){
        return name;
    }


    public boolean setName(String newName ){
        if(name.equals(name)){
            name=newName;
            return true;
        }
        else{
            return false;

        }




    }

    public Dog(int a, String n){
        age=a;
        name=n;


    }
    public boolean checkOldAge(){
        Random rand=new Random();
        if(age==rand.nextInt(16)){
            return true;
        }
        if(age==16){
            return true;
        }
        else
            return false;




    }

    public boolean setFriend(Dog dogFriend){
        if(friend== null);
        friend=dogFriend;
        return true;

    }

    public Dog friend(){
        return friend;
    }


















}
