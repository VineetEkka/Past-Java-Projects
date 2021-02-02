
public class UberCar {
    private String Driver;
    private String CurrentLoc;
    private boolean available;


    public UberCar(String d, String cl){
        Driver=d;
        CurrentLoc=cl;
        available=true;

    }
    public void setDriver(String d){
        this.Driver=d;
    }
    public void setCurrentLoc(String cl){
        this.CurrentLoc=cl;
    }
    public void setAvailable(boolean a){
        this.available=a;
    }


    public String getDriver(){
        return Driver;
    }
    public String getCurrentLoc(){
        return CurrentLoc;
    }
    public boolean isAvailable(){
        return available;
    }

    public void hasArrived(UberRider r){
        CurrentLoc=r.getStartLoc();
        System.out.println(getDriver()+" has arrived @ "+r.getDestiLoc());
        available=true;
        }




    public String toString(){
        return "";
    }



    }





