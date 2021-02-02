
public class Monkey {
    private String name;
    private int age;
    private int heightInches;
    private int heightFeet;

    private double height;
    private String talk;

    /**
     *
     *  name,the name of the monkey
     *  height 3.01 represents 3 feet, 1 inch
     */






    Monkey(String name, double height){
        age=0;
        this.height=height;
        this.name=name;
        heightFeet=(int)height;
        heightInches=(int)((height-heightFeet+0.001)*100);
    }

    public Monkey(String name,double height,int age){
        this(name,height);//calls the first constructor
        this.age=age;


    }

    public String toString(){
         //talk.equals(name+":is"+age+"yrs old and "+height+"feet");
        return this.name + ": "+ this.age+" yrs old "+ heightFeet+"\'" + heightInches+ "\" " ;

    }

    public int incAge(){
        age++;
        return age;
    }
}
