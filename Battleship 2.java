
public class Battleship {
    public static void main(String[] args) {
        String [][]s =new String[11][12];
        String[][]g=new String[11][12];


         Sea guess=new Sea(g);
        Sea seaman=new Sea(s);

        System.out.print(seaman.toString());
        seaman.setPieces();
        System.out.println("Give to your enemy to guess where the ships are");
        System.out.println("Enemy Board:");
        System.out.println(guess.toString());

        //System.out.println(guess.board2(g));
        seaman.toGuess();

    }
}
