package exercises.lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab7q4 {
    public static void main(String[] args) {
        try {
            int lines=0;
            int words = 0;
            int characters = 0;
            Scanner read = new Scanner(new FileInputStream("notreversed.txt"));
            while (read.hasNext()){
                lines++;
                String bruh = read.nextLine();
                String[] lesgo = bruh.split(" ");
                words+= lesgo.length;
                for (String s : lesgo) {
                    characters += s.length();
                }
            }
            System.out.println("lines : "+lines+"\nWords : "+words+"\nCharacters : "+characters);
            read.close();
        }catch (FileNotFoundException a){
            System.out.println("PROBELM WITH FILE");
        }

    }
}
