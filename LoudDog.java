
public class LoudDog extends Dog {



    public LoudDog(String n){
        super(n);
    }

    public String speak(){
        return (super.speak()+ " "+super.speak());

    }


}
