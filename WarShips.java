
public class WarShips {
    private int location[][];
    private int size;
    private String ShipType;
    private boolean direction;


    public WarShips(int l[][],int si,String st){
        location=l;
        size=si;
        ShipType=st;
        direction=true;

    }

    public int getSize(){
        return size;
    }

    public int getlocation(int location[][]){
        return 2;
    }
    public String getShipType(){
        return ShipType;
    }

    /*
    public int toFit(){
        //Might need to run a for loop to check the amount of spaces to set restrictions

    }
    */



}
