
public class Zoo {
    public static void main(String[] args) {
        Monkey mon1=new Monkey("Earl",4.03);
        Monkey mon2=new Monkey("Doy",3.02,4);
        Monkey mon3=mon1;


        System.out.println(mon1);
        System.out.println(mon2);
        System.out.println(mon3);



        mon1.incAge();
        mon2.incAge();

        System.out.println(mon1);
        System.out.println(mon2);
        System.out.println(mon3);


    }
}
