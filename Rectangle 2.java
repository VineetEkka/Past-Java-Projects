
public class Rectangle {
    private int length;
    private int width;




    public  Rectangle(){
        length=1;
        width=1;


    }

    public Rectangle(int l,int w){
        length=l;
        width=w;



    }

    public boolean isSquare(){
        return length==width;
    }

    public  String toString(){
        return "Rectangle: length "+ length+" width "+width;
    }

    public void multiply(int n){
        width*=n;
        length*=n;
    }


}
