/**
 * Created by 2019591 on 1/10/18.
 */
public class Employee {
    private String name;
    private int type;
    private double rate;
    private int hours;

    public Employee() {
        name = null;
        type = 0;
        rate = 0.0;
        hours = 0;

    }

    public boolean setName(String n) {
        if (n.equals(name)) {
            System.out.println("No Change");
            return false;
        } else {
            this.name = n;
            return true;
        }
    }

    public boolean setType(int t) {
        if (t == 1 || t == 2) {
            this.type = t;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRate(double r) {
        if (!(6.75<=r && r<=30.5)) {
            System.out.println("Same Rate");
            return false;
        } else {
            System.out.println("lmao it worked");
            this.rate = r;
            return true;
        }
    }

    public boolean sethours(int h) {
        if (!(1 <= h && h <= 60)) {
            System.out.println("No change in hrs");
            return false;
        } else {
            this.hours = h;
            return true;
        }


    }

    public String getName() {
        return name;
    }

    public double getpay() {
        double pay;
        if (this.hours <= 40 || this.type == 2) {
            pay = rate * hours;
        } else {
            pay = rate * 40 + rate * 2 * (hours - 40);

        }
        return pay;
    }


}
