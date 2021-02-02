/**
 * Created by 2019591 on 12/4/17.
 */
public class Patron {
    private String patron;
    private String name;
    private Book ak;
    private Book bk;
    private Book ck;

    public Patron(String patronName,Book book1,Book book2, Book book3){
        name=patronName;
        ak=book1;
        bk=book2;
        ck=book3;

    }

    public Patron(String patronName,Book book1,Book book2){
        name=patronName;
        ak=book1;
        bk=book2;
        ck=null;
    }
    public Patron(String patronName,Book book1){
        name=patronName;
        ak=book1;
        bk=null;
        ck=null;
    }
    public Patron(String patronName){
        name=patronName;
        ak=null;
        bk=null;
        ck=null;
    }




    public boolean canBorrow(){
        if(ak==null||bk==null||ck==null){
            System.out.println(this.name+ "can borrow books");
            return true;

        }
        else{
            System.out.println(this.name+"cannot borrow any more books");
            return false;
        }

    }

    public boolean returnBook(Book b){
        if(ak.equals(b)){
            ak=null;
            System.out.println(this.name+"Thanks for returning"+ak.getTitle()+"by"+ak.getAuthor());
            return true;

        }
        else if(bk.equals(b)){
            bk=null;
            System.out.println(this.name+"Thank for returning"+bk.getTitle()+"by"+bk.getAuthor());
            return true;
        }

        else if(ck.equals(b)){
            ck=null;
            System.out.println(this.name+"Thank for returning"+ck.getTitle()+"by"+ck.getAuthor());
            return true;
        }

        System.out.println(this.name+"does not have any books to return");
        return false;
    }

    public boolean hasBook(Book b){
        if(ak.equals(b)){
            System.out.println(this.name+"has"+ak.getTitle()+"by"+ak.getAuthor());
           return true;
        }
        else if(bk.equals(b)){
            System.out.println(this.name+"has"+bk.getTitle()+"by"+bk.getAuthor());
            return true;
        }
        else if(ck.equals(b)){
            System.out.println(this.name+"has"+ck.getTitle()+"by"+ck.getAuthor());
            return true;
        }
        else {
            System.out.println(this.name+" does not have this book");
            return false;
        }
    }


    public boolean borrowBook(Book b){
        if(ak==null){
            ak=b;
            System.out.println(this.name+" borrowed "+ak.getTitle());
            return true;
        }
        else if(bk==null){
            bk=b;
            System.out.println(this.name+" borrowed "+bk.getTitle());
            return true;
        }
        else if(ck==null){
            ck=b;
            System.out.println(this.name+" borrowed "+ck.getTitle());
            return true;
        }
        else{
            System.out.println(this.name+" cannot borrow books");
            return false;
        }


    }
    public String toString(){

        if(ak!=null&&bk!=null&&ck==null){
            return this.name+"has"+ak.getTitle()+bk.getTitle();
        }
        else if(ak!=null&&bk==null&&ck==null){
            return this.name+"has"+ak.getTitle();
        }
        else if(ak==null&&bk==null&&ck==null){
            return this.name+"has no books";
        }
        else if(ak==null&&bk!=null&&ck==null){
            return this.name+"has"+bk.getTitle();
        }
        else if(ak==null&&bk!=null&&ck!=null){
            return this.name+"has"+bk.getTitle()+ck.getTitle();
        }
        else if(ak!=null&&bk==null&&ck!=null){
            return this.name+"has"+ak.getTitle()+ck.getTitle();
        }
        else if(ak==null&&bk==null&&ck!=null){
            return this.name+"has"+ck.getTitle();
        }
        return this.name+"has"+ak.getTitle()+bk.getTitle()+ck.getTitle();

    }




}
