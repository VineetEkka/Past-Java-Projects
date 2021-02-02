
public class Bike {

    public String maker;
    public int gears;
    public boolean shocks;


    public Bike(String m) {

        maker = m;
        gears = 0;
        shocks = false;

    }

    public Bike() {
        maker = "";
        gears = 0;
        shocks = false;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String m) {
        maker = m;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int g) {
        gears = g;
    }

    public boolean getShocks() {
        return shocks;
    }

    public void setShocks(boolean s) {
        shocks = s;
    }

    public String toString() {
        return maker + " has " + gears + " gears.";
    }



}
