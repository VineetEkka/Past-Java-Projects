import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int choice = 0;
        int counter = 0;
        char letter = 'o';
        char lettern = 'x';
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println("Player one is x and player two is o and choose numbers between 1-3");
        System.out.println("Choose between playing against a friend1 or a computer player 2");
       choice=sc.nextInt();




                System.out.println("1 2 3");
                board.PrintBoard();


                while (choice==1&&counter<9) {


                    if (counter % 2 == 0) {
                        counter++;

                        System.out.println("Enter the row player one:");
                        row = sc.nextInt() - 1;

                        System.out.println("Enter the column player one:");
                        col = sc.nextInt() - 1;
                        System.out.println("Enter x for (" + (row+1) + "," + (col+1) + ")");
                        board.add(row, col, lettern);
                        if(board.add(row,col,lettern)!=true){
                            System.out.println("The spot has been already taken. Choose another spot");
                            counter++;

                        }
                        board.PrintBoard();

                        if (board.CheckWin() == 'x') {
                            System.out.print("Player X wins ");
                            board.ResetBoard();

                        }


                    } else {
                        counter ++;
                        System.out.println("Enter the row player two:");
                        row = sc.nextInt() - 1;
                        System.out.println("Enter the column player two:");
                        col = sc.nextInt() - 1;
                        System.out.println("Enter o for (" + (row+1) + "," + (col+1) + ")");
                        board.add(row, col, letter);
                        board.PrintBoard();
                        if(board.add(row,col,letter)!=true){
                            System.out.println("The spot has been already taken. Choose another spot");
                            counter++;

                        }

                        if (board.CheckWin() == 'o') {
                            System.out.print("Player O wins");
                            board.ResetBoard();

                        }




                    }

                }
                /*
                while(choice==2&& counter<9){
                    if (counter % 2 == 0) {
                        counter++;

                        System.out.println("Enter the row player one:");
                        row = sc.nextInt() - 1;

                        System.out.println("Enter the column player one:");
                        col = sc.nextInt() - 1;
                        System.out.println("Enter x for (" + row + "," + col + ")");
                        board.add(row, col, lettern);
                        if(board.add(row,col,lettern)!=true){
                            System.out.println("The spot has been already taken. Choose another spot");
                            counter++;

                        }
                        board.PrintBoard();

                        if (board.CheckWin() == 'x') {
                            System.out.print("Player X wins ");
                            board.ResetBoard();
                            break;
                        }
                        else {
                            counter += 1;
                            System.out.println("Enter the row player two:");
                            row = sc.nextInt() - 1;
                            System.out.println("Enter the column player two:");
                            col = sc.nextInt() - 1;
                            System.out.println("Enter o for (" + row + "," + col + ")");
                            board.add(row, col, letter);
                            board.PrintBoard();
                            if(board.add(row,col,letter)!=true){
                                System.out.println("The spot has been already taken. Choose another spot");
                                counter++;

                            }

                            if (board.CheckWin() == 'o') {
                                System.out.print("Player O wins");
                                board.ResetBoard();
                                break;
                            }
                            */


                }
            }




