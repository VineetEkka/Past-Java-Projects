
public class Library {
    public static void main(String[] args) {
        Patron p=new Patron("Vin");
        Book one=new Book("The Code Of Truth","Alex Gentuk");
        Book two=new Book("One Step Ahead of Ya","Mr.K");
        Book three=new Book("Gimme A Five","G Nasser");
        Book four=new Book("Engima","Nullster");

        p.borrowBook(one);
        p.borrowBook(two);
        p.borrowBook(three);
        p.borrowBook(four);

        p.returnBook(two);

        System.out.println(p.toString());

        p.hasBook(one);
        p.hasBook(four);

        p.returnBook(four);

        p.borrowBook(four);

        System.out.println(p.toString());




    }
}
