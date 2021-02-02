import java.util.Random;
import java.util.Scanner;


public class LookAtAllMyDogs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=0;
        Dog [] dog=new Dog[5];



        String[] death={"Getting hit by a car","Running away","Finding Dog Heaven","Eating poison","Sleeping", "Playing too many games in java class", "playing the music we don't talk anymore","using too much lotion","finding darkness","dabbing too much"};
        for(int i =0;i<dog.length;i++) {
            dog[i]=new Dog();
        }







        while(true){
            for(int i =0;i<dog.length;i++) {

                if (dog[i] != null) {   //if the value of the current index in the array doesn't equal null then the name and age will print out or else it is omitted

                System.out.println(i +" Dog Name:" + dog[i].name());
                System.out.println("Age:" + dog[i].age());
                }
            }

                System.out.println("1: Give your dog a name ");
                System.out.println("2: Give all your dogs an age ");
                System.out.println("3: Give a dog away");
                System.out.println("4: Adopt an older dog");
                System.out.println("5: Give a dog a buddy");
                System.out.println("6: Add a dog");
                System.out.println("0: Quit");
                int choice=sc.nextInt();

                if(choice==1){//the user enters which dog in the index and then changes the name of that dog array
                    System.out.println("Choose which dog to change the name 0-4");
                    int enter=sc.nextInt();
                    System.out.println("Enter the name of the dog");
                    String name=sc.next();
                    dog[enter].setName(name);

                    }
            if(choice==2) {//the loop sets i to zero and then adds one to i until it is greater than number of indexes in dog[]. Then adds one to the age to all the dogs
                for (int i = 0; i < dog.length; i++) {
                    if(dog[i]!=null){
                        dog[i].increaseAge();
                    }

                }
            }

                    if(choice==3){// enters a index between 0-4 and then it sets dog[] to the number of the user and then sets it to null
                        System.out.println("Choose which dog to give away 0-4");
                        int enter=sc.nextInt();
                        dog[enter]=null;


                    }

                    if(choice==4){
                        for(int i =0;i<dog.length;i++){
                            int a=sc.nextInt();
                            String n=sc.next();
                            if(dog[i]==null){
                                dog[i]=new Dog(a,n);

                            }
                            else{
                                System.out.println("How many more dogs:");
                                int add=sc.nextInt();
                                Dog [] dogs=new Dog[length];
                            }
                        }


                    }
                    if(choice==5){
                        for(int i =0;i<dog.length;i++){
                            if(dog[i]!=null){
                                dog[0].setFriend(dog[i]);
                            }
                            if(dog[i]==true)
                        }

                    }
                    if(choice==6){
                        Dog dogs[]=new Dog[dog.length+1];
                        for(int i=0;i<dog.length;i++){
                            dogs[i]=dog[i];
                            dog=dogs;
                        }


                    }

                    if(choice==0){// ends the loop
                        break;
                    }
                    for(int i =0;i<dog.length;i++) {
                        if(dog[i]!=null){
                            if(dog[i].checkOldAge()){
                                Random name=new Random();
                                System.out.println("Dog "+ i +" died by "+death[name.nextInt(10)]);
                                dog[i]=null;
                            }

                        }

                    }





                }
            }
        }

