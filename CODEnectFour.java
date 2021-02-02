
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CODEnectFour extends Applet implements MouseListener {
    int width = 0;
    int height = 0;
    Dimension dim = getSize();
    int length = Math.min(width, height);
    boolean redsTurn=true;


    Board board = new Board();

    public void init() {
        addMouseListener(this);
        setSize(800, 650);

    }

    public void paint(Graphics g) {
        setDimensions();


        board.display(g);


    }

    private void setDimensions() {
        dim = getSize();
        width = dim.width;
        height = dim.height;
        length = Math.min(width, height);
        Piece.radius = length / 14;


    }


    public void mouseClicked(MouseEvent e) {

        if(board.addPiece(findCol(e.getX()),redsTurn)){
            redsTurn=! redsTurn;//switches turn when a piece is added
            System.out.println(board.checkWin());


        }


        repaint();
    }




    private int findCol(int x) {
        for (int c = 0; c < 7; c++) {
                if(x < (2*c+2)  * Piece.radius) {
                return c;
            }

        }
        return -1;//if mouse
    }







    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent e) {

    }


    public void mouseEntered(MouseEvent e) {

    }


    public void mouseExited(MouseEvent e) {

    }
}

