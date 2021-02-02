
public class Battleship{
    public static void main(String[] args) {
        Sea seaman=new Sea();
        System.out.print(seaman.toString());
        seaman.setPieces();

        System.out.println("Give to your enemy to guess where the ships are");
        System.out.println("Enemy Board:");
        seaman.GuessBoard();
        seaman.board();
        seaman.toGuess();

    }

}
