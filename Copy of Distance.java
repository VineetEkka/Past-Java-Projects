
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Put the coordinates in this format: (X1,Y1),(X2,Y2)");
        System.out.print("Coordinates:");
        String coordinates = sc.next();



       int x1= Integer.parseInt(coordinates.substring(1,coordinates.indexOf(',')));
       int x2= Integer.parseInt(coordinates.substring(coordinates.indexOf(',')+1, coordinates.indexOf(')')));
       int y1= Integer.parseInt(coordinates.substring(coordinates.lastIndexOf('(')+1, coordinates.lastIndexOf(',')));
       int y2= Integer.parseInt(coordinates.substring(coordinates.lastIndexOf(',')+1, coordinates.lastIndexOf(')')));
        System.out.print("The distance is:");
        System.out.println(Math.sqrt(((y1-x1)*(y1-x1)) +((y2-x2)*(y2-x2))));






    }


}
