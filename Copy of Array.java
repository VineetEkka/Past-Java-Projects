    import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and how many columns?");
        int row = 0;
        int col = 0;
        int choice = 0;
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] matrix = new int[row][col];


        while (true) {
            printall(matrix);

            System.out.println("1) Change one value");
            System.out.println("2) Change a row");
            System.out.println("3) Change a column");
            System.out.println("4) Search for a value");
            System.out.println("5) Find the sum and average of a row");
            System.out.println("6) Find the sum and average of a column");
            System.out.println("7) Reset all values to 0");
            System.out.println("8) Find sum first diagonal");
            System.out.println("9)Find sum of second diagonal");
            System.out.println("10) Quit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the row:");
                row = sc.nextInt();
                System.out.println("Enter the column:");
                col = sc.nextInt();
                System.out.println("Enter the new value (" + row + "," + col + ")");
                int num = sc.nextInt();
                matrix[row][col] = num;
            }
            if (choice == 2) {
                System.out.println("What row to change?:");
                row = sc.nextInt();
                changerow(matrix, row);
            }
            if (choice == 3) {
                System.out.println("What column to change?:");
                col = sc.nextInt();
                changecol(matrix, col);

            }
            if (choice == 4) {
                System.out.println("What value to find:");
                int value = sc.nextInt();
                System.out.println(finder(matrix, value));
            }
            if (choice == 5) {
                System.out.println("What # row?:");
                int gentuk = sc.nextInt();
                System.out.println("The average of the row " + (averagerow(matrix, gentuk) / matrix.length));


            }
            if (choice == 6) {
                System.out.println("What # column?:");
                int column = sc.nextInt();
                System.out.println("The average of the column" + (averagecol(matrix, column) / matrix.length));
            }
            if (choice == 7) {
                System.out.println("RESET");
                printzero(matrix);
            }
            if (choice == 8) {
                System.out.println(diag1(matrix));
            }
            if (choice == 9) {
                System.out.println(diag2(matrix));
            }
            if (choice == 10) {
                break;
            }
        }

    }

    public static void printall(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printzero(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = 0;
            }
        }

    }

    public static void changerow(int[][] arr, int row) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("What value: ");
            value = sc.nextInt();
            arr[row][i] = value;
        }
    }

    public static void changecol(int[][] arr, int col) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("What value: ");
            value = sc.nextInt();
            arr[i][col] = value;
        }
    }


    public static int averagerow(int[][] arr, int row) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[row][j];

        }
        return sum;
    }

    public static int averagecol(int[][] arr, int col) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][col];
            }
        }
        return sum;
    }

    public static boolean finder(int[][] arr, int value) {
        boolean find = false;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == value) {
                    find = true;
                }
            }
        }
        return find;
    }

    public static int diag1(int[][] arr) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (r == c) {
                    sum += arr[r][c];
                }
            }
        }

        return sum;

    }

    public static int diag2(int[][] arr) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            int c=0;
            while(c<arr[0].length){
                if(r==(arr[0].length-c)){
                    sum+=arr[r][c-1];
                }
            }

        }

        return sum;
    }
}
