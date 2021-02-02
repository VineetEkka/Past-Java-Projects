
public class UberRider {
    private String StartLoc;
    private String DestiLoc;


    public UberRider(String sl, String dl){
        StartLoc=sl;
        DestiLoc=dl;
    }

    public void setStartLoc(String sl){
        StartLoc=sl;

    }
    public void setDestiLoc(String dl){
        DestiLoc=dl;

    }
    public String getStartLoc(){
        return StartLoc;
    }
    public String getDestiLoc(){
        return DestiLoc;
    }

    public void hasArrived(){
        StartLoc=DestiLoc;
        DestiLoc=null;

    }


    public boolean requestRide(UberCar c){
        if(StartLoc.equals(c.getCurrentLoc())){
            c.setAvailable(false);
            System.out.println(c.getDriver()+" picked up UberRider @ " + getStartLoc());
            return true;
        }
        else{
            System.out.println("No UberCar is available ");
            return false;
        }



    }
    public String toString(){
        return "";
    }




}
