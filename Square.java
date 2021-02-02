
public class Square {
    /*
    non-static variables and methods belong to each individual object, not the class


    to use non-static variables and methods you must instantiate the class
     */
    public static int length;

    public Square(int l){
        length=l;

    }

    public int area(){
        return length*length;

    }

}
