/**
 * Created by 2019591 on 12/4/17.
 */
public class Book {
    private String book;
    private String Title;
    private String Author;

    public Book(String bookTitle, String bookAuthor){
        Title=bookTitle;
        Author=bookAuthor;

    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }

    public String toString(){
        return  "Book: "+Title+", By "+Author;
    }


}
