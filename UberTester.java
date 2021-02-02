
public class UberTester {
    public static void main(String[] args) {
        UberCar c1=new UberCar("Gentuk","50 Eagle Boulevard");
        UberCar c2=new UberCar("Krajun","Hollywood Lane");

        UberRider r1=new UberRider("50 Eagle Boulevard","Hollywood Lane");
        UberRider r2=new UberRider("Hollywood Lane","Runner's Lane");
        UberRider r3=new UberRider("Runner's Lane","50 Eagle Boulevard");

        r1.requestRide(c1);
        r1.requestRide(c2);

        r2.requestRide(c1);
        r2.requestRide(c2);

        r3.requestRide(c1);
        r3.requestRide(c2);

        c1.hasArrived(r2);

        r3.requestRide(c1);

        c2.hasArrived(r2);
        r1.hasArrived();
        r2.hasArrived();
        r3.hasArrived();

        System.out.println(r1.getStartLoc());
        System.out.println(r2.getStartLoc());
        System.out.println(r3.getStartLoc());



    }
}
