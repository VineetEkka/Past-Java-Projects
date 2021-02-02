
public class TwoDimension {
    public static void main(String[] args) {
        int[][] matrix=new int[5][10];
        int[] row =new int[10];
        printRowMaj(matrix);

        System.out.println();
        System.out.println();

        printColMaj(matrix);

        //System.out.println("1D"+ row);
        //System.out.println("2D"+ matrix);
        //System.out.println("2D"+ matrix[0]);


    }


    public static void printRowMaj(int[][] arr){
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
    public static void printColMaj(int[][] arr){
        for(int j=0;j<arr[0].length;j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }





}
