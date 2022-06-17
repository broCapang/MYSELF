package exercises.sem2.Lab.L1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("text1.txt"));
            Scanner in = new Scanner(new FileInputStream("text1.txt"));
            out.write("abc123def456ghi789jkl");
            out.close();
            String um = "";
            while (in.hasNextLine()){
                um+=in.nextLine();
            }
            int hah = 0;
            String exc ="";
            for (int i=0;i<um.length();i++){
                if (um.charAt(i)>='a'&&um.charAt(i)<='z'||um.charAt(i)>='A'&&um.charAt(i)<='Z'){
                    hah+=1;
                    exc+=um.charAt(i);
                }
            }
            System.out.println(hah);
            System.out.println(exc);
            in.close();
        }catch (IOException e){
            System.out.println("Bruh");
        }

    }
}
