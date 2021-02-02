import java.io.*;
import java.io.File;
import java.util.Scanner;

public class textFile {
    public static void main(String[] args) throws IOException{
        int count;
        Scanner read=new Scanner(new File("My New Intials.txt"));
        while (read.hasNext()){
            //count = read.nextLine();
            count=read.nextInt();
                if(count>0){
                    for(int i=0; i<count; i++){
                        System.out.print("X");
                    }
                }
                else if(count<0){
                    for(int i=0;i<Math.abs(count);i++) {
                        System.out.print(" ");
                }




            }
            else{
                    System.out.println();
                }



            }





        }
    }

