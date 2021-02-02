import java.util.*;
public class Sea {
    private String seag[][];
    private String guesser[][];
    Scanner sc = new Scanner(System.in);

    public Sea() {

        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] number = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};


        seag = new String[11][12];
        for (int r = 0; r < seag.length; r++) {
            for (int c = 0; c < seag[0].length; c++) {
                if (r == 0) {
                    for (int i = 0; i < 12; i++) {
                        seag[0][i] = number[i];
                    }
                }
                if (c == 0) {
                    for (int k = 0; k < 11; k++) {
                        seag[k][0] = alpha[k];

                    }
                }
                else {
                    seag[r][c] = "-";
                    if (seag[r][c] == seag[r][11]) {
                        seag[r][c] = "";
                    }

                }
            }
        }

    }


    public void GuessBoard(){
        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] number = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};


        guesser = new String[11][12];

        for (int r = 0; r < guesser.length; r++) {
            for (int c = 0; c < guesser[0].length; c++) {
                if (r == 0) {
                    for (int i = 0; i < 12; i++) {
                        guesser[0][i] = number[i];
                    }
                }
                if (c == 0) {
                    for (int k = 0; k < 11; k++) {
                        guesser[k][0] = alpha[k];

                    }
                } else {
                    guesser[r][c] = "-";
                    if (guesser[r][c] == guesser[r][11]) {
                        guesser[r][c] = "";
                    }

                }
            }
        }


    }



    public void setPieces() {
        boolean loop=true;
        int breaker = 0;

        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int j = 2; j < 7; j++) {
            if (breaker == 0) {
                if(j==6){
                    loop=false;
                    j=3;
                }
                if(j>3&&loop==false){
                    j+=4;
                }
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
                                if(j==3&&loop==false){
                                    j+=4;
                                }
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 4&&loop==true) {
                        for (int c = row; c < row + 4; c++) {
                            if (seag[index][c].equals("-")) {
                                seag[index][c] = "X";
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }
                    } else if (j == 5&&loop==true) {
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
                                if(j==3&&loop==false){
                                    j+=4;
                                }
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 4&&loop==true) {
                        for (int c = 0; c < 4; c++) {
                            if (seag[index][row].equals("-")) {
                                seag[index][row] = "X";
                                index++;
                            } else {
                                System.out.println("CANNOT DO THAT PLAY AGAIN");
                                breaker++;

                            }
                        }

                    } else if (j == 5&&loop==true) {
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
        GuessBoard();

        int hits = 0;
        guesser = new String[11][12];
        String[] alphaG = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

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

            board();

        }

        System.out.println("YOU WON!");


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

    public void board() {
        String[] number = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", ""};
        String[] alpha = {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};



        for (int r = 0; r < guesser.length; r++) {
            for (int c = 0; c < guesser[0].length; c++) {
                if (r == 0) {
                    for (int i = 0; i < 12; i++) {
                        guesser[0][i] = number[i];
                    }
                }
                if (c == 0) {
                    for (int k = 0; k < 11; k++) {
                        guesser[k][0] = alpha[k];

                    }
                }
                if(guesser[r][c]==null){
                    guesser[r][c]="-";
                }
                if(guesser[r][c]==guesser[r][11]){
                    guesser[r][c]="";
                }


                System.out.print(guesser[r][c]+"\t");


            }
            System.out.println();
        }


    }


}




















