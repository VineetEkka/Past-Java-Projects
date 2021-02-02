
import java.util.ArrayList;
import java.util.Scanner;


public class MagicSquare {
    private int Array[][];
    private int size;

    public MagicSquare(int arr) {
        Scanner sc = new Scanner(System.in);
        size=arr;
        Array = new int[arr][arr];

        for (int r = 0; r < arr; r++) {
            for (int c = 0; c < arr; c++) {
                System.out.println("Enter a value for" + r + "," + c);
                int input = sc.nextInt();
                Array[r][c] = input;

            }
        }

    }

    public boolean isMagic() {


        for (int r = 0; r < Array.length; r++) {
            for (int c = 0; c < Array[0].length; c++) {
                if(colSum(c)!=rowSum(c)){
                    return false;
                }
                if(colSum(c)!=diag1()){
                    return false;
                }
                if(colSum(c)!=diag2()){
                    return false;
                }
                if(rowSum(r)!=diag1()){
                    return false;
                }
                if(rowSum(r)!=diag2()){
                    return false;
                }
                if(diag1()!=diag2()){
                    return false;
                }
                if(valuesCheck()!=true){
                    return false;
                }

            }
        }
        return true;

    }


    public boolean isA4x4Durer() {
        if (Array.length==4) {
            if(isMagic()==true){
                if(diag1()!=centerSum()){
                    return false;
                }
                if(diag1()!=cornerSum()){
                    return false;
                }
                if(diag1()!=clockwiseSum()){
                    return false;
                }
                if(diag1()!=leftRightCenterRowSum()){
                    return false;
                }
                if(diag1()!=topBottomCenterColSum()){
                    return false;
                }
                return true;
            }
            else if(isMagic()==false){
                return false;
            }

            return true;

        }
        return true;


    }

    public int cornerSum() {
        int sum = 0;
            sum = Array[0][0] + Array[0][Array.length - 1] + Array[Array[0].length - 1][0] + Array[Array.length - 1][Array[0].length - 1];


        return sum;

    }

    public int centerSum() {
        int sum = 0;

            sum += Array[1][1] + Array[1][2] + Array[2][1] + Array[2][2];


        return sum;

    }

    public int colSum(int c) {
        int sum = 0;

            for (int i = 0; i < Array[0].length; i++) {
            sum += Array[i][c];

        }

        return sum;

    }

    public int rowSum(int r) {
        int sum = 0;
        for (int c = 0; c < Array.length; c++) {
            sum += Array[r][c];
        }
        return sum;

    }

    public int diag1() {
        int sum = 0;
        for (int r = 0; r < Array.length; r++) {
            for (int c = 0; c < Array[0].length; c++) {
                if (r == c) {
                    sum += Array[r][c];
                }
            }
        }

        return sum;

    }

    public int diag2() {

        //Jishan helped me on this method
        int r=Array.length-1;
        int c=0;
        int sum=0;
        while(r>=0 && c<=Array.length-1){
            sum+=Array[r][c];
            r--;
            c++;
        }
        return sum;

    }

    public boolean valuesCheck() {
        //Chris and I worked together on this
        boolean checker=true;
        ArrayList<Integer> arl = new ArrayList<>();
        for (int r = 0; r < Array.length; r++) {
            for (int c = 0; c < Array[0].length; c++) {
                if (Array[r][c] < 1 || Array[r][c] > (Array.length * Array.length)) {
                    checker=false;
                }
                else{
                    arl.add(Array[r][c]);
                }
            }

        }
        for(int i=1;i<arl.size();i++){
            if(arl.get(i-1)==arl.get(i)){
                checker=false;
            }
        }

        return checker;
    }




    public int topBottomCenterColSum() {
        int sum = 0;
        if(size==4){
            sum += Array[0][1] + Array[0][2] + Array[3][1] + Array[3][2];
        }

        //4
        return sum;

    }

    public int leftRightCenterRowSum() {
        int sum = 0;
        if(size==4){
            sum += Array[1][0] + Array[1][3] + Array[2][0] + Array[2][3];
        }

        return sum;

    }

    public int clockwiseSum() {
        //4
        int sum1 = 0;
        int sum2 = 0;
        int summer=0;
        if(size==4){

            sum1 += Array[0][1] + Array[1][3] + Array[3][2] + Array[2][0];
            sum2 += Array[0][2] + Array[2][3] + Array[3][1] + Array[1][0];
            if (sum1 == sum2) {
                summer+=sum1;
            }

        }
        else{
            return -1;
        }

        return summer;



    }

    public String toString() {
        for (int r = 0; r < Array.length; r++) {
            for (int c = 0; c < Array[0].length; c++) {
                System.out.print(Array[r][c] + "\t");
            }
            System.out.println();

        }
        return "";


    }
}




