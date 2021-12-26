package exercises.lab7;

import java.io.*;
import java.util.Scanner;

public class lab7q3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("notreversed.txt"));
            Scanner read = new Scanner(new FileInputStream("notreversed.txt"));
            PrintWriter output2 = new PrintWriter(new FileOutputStream("reversed.txt"));

            output.println("UR MOM");
            output.println("HEHEHEHHE");
            output.close();
            while (read.hasNext()){
                String lesgo = read.next();
                String reverse = "";
                for (int i=lesgo.length()-1;i>=0;i--){
                    reverse+=lesgo.charAt(i);
                }
                output2.println(reverse);
            }
            read.close();
            output2.close();
        }catch (IOException e){
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }




    }
}
