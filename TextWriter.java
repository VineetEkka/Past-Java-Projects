
public class TextWriter {

    private String textToDisplay;//texter

    public TextWriter(){
        textToDisplay="";
    }
    public TextWriter(String inputText){
        textToDisplay=inputText;
    }


    public void setTextToDisplay(String inputText){
        textToDisplay=inputText;

    }

    public String getTextToDisplay() {
        return textToDisplay;
    }

    public void display(){
        System.out.println(textToDisplay);

    }
    public String clear(){
        textToDisplay="";
        return textToDisplay;
    }

}
