public class FractionTester {
    public static void main(String[] args) {
        Fractioner f1 = new Fractioner (1403,391);
        Fractioner f2 = new Fractioner (899,391);
        Fractioner f3 = new Fractioner ( -51,81);
        Fractioner f4 = new Fractioner ( -17,27);
        Fractioner f5 = new Fractioner (101,1111);
        Fractioner f6 = new Fractioner (3762,171);
        Fractioner f7 = new Fractioner ( -67,59);
        Fractioner f8 = new Fractioner ( 201,177);


        System.out.println((f1.add(f2).add(f3.subtract(f4)).add(f5.multiply(f6)).add(f7.divide(f8))));



    }
}
