import java.util.Scanner;


public class Battle

{


    private static char[][] board1 = new char[10][10];

    private static char[][] board2 = new char[10][10];

    private static final char[] alphabet = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

    private static Scanner sc;


    public static void main(String[] args)

    {

        sc = new Scanner(System.in);


        fillWithBlanks();


        int[] sizes = new int[] { 2, 3, 3, 4, 5 };

        for (int i = 0; i < sizes.length; i++)

        {

            int size = sizes[i];

            printBoard(1);

            System.out.println("Enter coordinates for a ship of length " + size + ", [A-J][1-10]: ");

            String pos = sc.next();

            int row = getRow(pos);

            int col = getCol(pos);

            System.out.print("[H]orizontal or [V]ertical? ");

            String option = sc.next().toLowerCase();

            if (option.startsWith("h"))

            {

                if (col - 1 + size > 10)

                {

                    System.out.println("nah, try again");

                    i--;

                } else

                {

                    for (int x = col - 1; x < col - 1 + size; x++)

                    {

                        board1[row - 1][x] = 'X';

                    }

                }

            } else

            {

                if (row - 1 + size > 10)

                {

                    System.out.println("nah, try again");

                    i--;

                } else

                {

                    for (int y = row - 1; y < row - 1 + size; y++)

                    {

                        board1[y][col - 1] = 'X';

                    }

                }

            }

        }


        System.out.println("\n=================");

        int sunken = 0;

        while (true)

        {

            System.out.println("\nEnemy Board");

            printBoard(2);

            System.out.print("Guess a position: [A-J][1-10]: ");

            String guess = sc.next();

            int row = getRow(guess);

            int col = getCol(guess);

            if (board1[row - 1][col - 1] == 'X')

            {

                board2[row - 1][col - 1] = 'X';

                sunken++;

                System.out.println("Hit, find the next ships.");

            } else

            {

                board2[row - 1][col - 1] = 'O';

                System.out.println("Miss, keep guessing.");

            }

            if (sunken == 5)

            {

                System.out.println("Yay, you sunk all of the ships.");

                break;

            }

        }

        System.out.println("haaaaaaan, battleship is done.");

    }


    private static void printBoard(int board)

    {

        for (int i = 0; i < 11; i++)

        {

            for (int j = 0; j < 11; j++)

            {

                if (i == 0 && j == 0)

                {

                    System.out.print(" ");

                } else if (i == 0 && j != 0)

                {

                    System.out.print(j + " ");

                } else if (j == 0 && i != 0)

                {

                    System.out.print(alphabet[i - 1] + " ");

                } else

                {

                    if (board == 1)

                    {

                        System.out.print(board1[i - 1][j - 1] + " ");

                    } else if (board == 2)

                    {

                        System.out.print(board2[i - 1][j - 1] + " ");

                    }

                }

            }

            System.out.println();

        }

    }


    private static void fillWithBlanks()

    {

        for (int i = 0; i < 10; i++)

        {

            for (int j = 0; j < 10; j++)

            {

                board1[i][j] = '_';

                board2[i][j] = '_';

            }

        }

    }


    private static int getRow(String pos)

    {

        char c = pos.charAt(0);

        if (c == 'A' )

        {

            return 1;

        }

        if (c == 'B')

        {

            return 2;

        }

        if (c == 'C')

        {

            return 3;

        }

        if (c == 'D')

        {

            return 4;

        }

        if (c == 'E')

        {

            return 5;

        }

        if (c == 'F')

        {

            return 6;

        }

        if (c == 'G')

        {

            return 7;

        }

        if (c == 'H')

        {

            return 8;

        }

        if (c == 'I')

        {

            return 9;

        }

        if (c == 'J')

        {

            return 10;

        }

        return -1;

    }


    private static int getCol(String pos)

    {

        return Integer.parseInt(pos.substring(1));

    }


}






