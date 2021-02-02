
public class MountainBike extends Bike {

    private String seat;

    public MountainBike(String name) {
        super(name);
    }

    public MountainBike() {
        super();
    }

    public void setSeat(String s) {
        seat = s;
    }

    public String getSeat() {
        return seat;
    }

    public String toString() {
        return maker + " has " + gears + " gears and a " + seat + " seat.";
    }

}
