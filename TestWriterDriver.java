/**
 * Created by 2019591 on 11/20/17.
 */
public class TestWriterDriver {
    public static void main(String[] args) {
        TextWriter tw1=new TextWriter();
        TextWriter tw2=new TextWriter("Hello Mami");
        TextWriter tw3=new TextWriter("Ok");
        tw1.setTextToDisplay("This linea is from the homies");
        tw1.display();
        System.out.println(tw2.getTextToDisplay());
        tw3.clear();
        System.out.println(tw3.clear());


    }
}
