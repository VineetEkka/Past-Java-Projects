
public class Rectangle {

    private int length;//instance variables properties that make 1 rectangle diffrent from other rectangles
    private int width;

    public Rectangle(){// constructors
        length=1;
        width=1;
    }

    public Rectangle(int l, int w){
        length=l;
        width=w;//constructors
    }

    /**
     * Changes the length of the rectangle to l if l is positive
     * @param l
     * @return
     */
    public boolean setLength(int l) {

        if (l > 0) {

            length = l;
            return true;
        }
        return false;

    }
    public boolean setWidth(int w){
        if(w>0){
            width=w;
            return true;
        }
        return false;
    }


    //setter method


    public int length(){
        return length;//getter methods

    }
    public int width(){
        return width;
    }

    public int area(){
        return length* width;
    }
    public int perimeter(){
        return 2*length+ 2* width;
    }

}
