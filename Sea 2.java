import java.util.*;
public class Sea {
    private String seag[][];
    private String guesser[][];
    Scanner sc = new Scanner(System.in);

    public Sea(String [][]arr) {

        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] number = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};


        //seag = new String[11][12];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (r == 0) {
                    for (int i = 0; i < 12; i++) {
                        arr[0][i] = number[i];
                    }
                }
                if (c == 0) {
                    for (int k = 0; k < 11; k++) {
                        arr[k][0] = alpha[k];

                    }
                } else {
                    arr[r][c] = "-";
                    if (arr[r][c] == arr[r][11]) {
                        arr[r][c] = "";
                    }

                }
            }
        }








    }





    public void setPieces() {
        int breaker = 0;

        //seag[3][5]="N";
        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int j = 2; j < 6; j++) {
            if (breaker == 0) {
                System.out.println(" The Size of Ship " + j);
                System.out.println("Enter a Row (A-J)");
                String letter = sc.next();
                letter = letter.toUpperCase();
                int index = 0;
                for (int i = 0; i < alpha.length; i++) {
                    if (alpha[i].equals(letter)) {
                        index = i;
                    }
                }
                System.out.println("Enter a column 1-10");
                int row = sc.nextInt();
                System.out.println("1)Horizontal or 2)Vertical");
                int pos = sc.nextInt();

                if (pos == 1) {
                    if (j == 2) {
                        for (int c = row; c < row + 2; c++) {
                            if (seag[index][c].equals("-")) {
                                seag[index][c] = "X";
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }

                        }
                    } else if (j == 3) {
                        for (int c = row; c < row + 3; c++) {
                            if (seag[index][c].equals("-")) {
                                seag[index][c] = "X";
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 4) {
                        for (int c = row; c < row + 4; c++) {
                            if (seag[index][c].equals("-")) {
                                seag[index][c] = "X";
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }
                    } else if (j == 5) {
                        for (int c = row; c < row + 5; c++) {
                            if (seag[index][c].equals("-")) {
                                seag[index][c] = "X";
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }
                    }


                } else if (pos == 2) {

                    if (j == 2) {
                        for (int c = 0; c < 2; c++) {
                            if (seag[index][row].equals("-")) {
                                seag[index][row] = "X";
                                index++;
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }

                        }

                    } else if (j == 3) {
                        for (int c = 0; c < 3; c++) {
                            if (seag[index][row].equals("-")) {
                                seag[index][row] = "X";
                                index++;
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 4) {
                        for (int c = 0; c < 4; c++) {
                            if (seag[index][row].equals("-")) {
                                seag[index][row] = "X";
                                index++;
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 5) {
                        for (int c = 0; c < 5; c++) {
                            if (seag[index][row].equals("-")) {
                                seag[index][row] = "X";
                                index++;
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    }


                } else {
                    System.out.println("Start Over");
                }

                System.out.println(toString());


            } else {
                break;
            }
        }


    }


    public void toGuess() {

        int hits = 0;
        guesser = new String[11][12];
        String[] alphaG = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        // Sea guess=new Sea();
        while (hits < 17) {
            System.out.println("Guess what row A-J");
            String guessAlpha = sc.next();
            guessAlpha = guessAlpha.toUpperCase();
            int indexG = 0;
            for (int i = 0; i < alphaG.length; i++) {
                if (alphaG[i].equals(guessAlpha)) {
                    indexG = i;
                }
            }
            System.out.println("Guess what column 1-10");
            int guessNum = sc.nextInt();

            if (seag[indexG][guessNum].equals("X")) {
                guesser[indexG][guessNum] = "X";
                hits++;

            } else {
                guesser[indexG][guessNum] = "O";
                System.out.println("Miss");
            }

            System.out.println("Hits:" + hits);
            board2();
           // System.out.println(guesser.toString());


        }

        System.out.println("You Won!");


    }


    public String toString() {
        String sea = "";
        for (int r = 0; r < seag.length; r++) {
            for (int c = 0; c < seag[0].length; c++) {
                sea += seag[r][c] + "\t";


            }
            sea += "\n";
        }
        return sea;
    }

    public void board2() {
        for (int r = 0; r < guesser.length; r++) {
            for (int c = 0; c < guesser[0].length; c++) {
                System.out.println(guesser[r][c] + "\t");


            }
            System.out.println();
        }



    }
}




















