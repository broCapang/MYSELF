package exercises.sem2.Tutor.T1;

import static java.awt.PageAttributes.MediaType.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_U2000963 {

    public static void main(String[] args) {
        
       try{
            Scanner sc = new Scanner(new FileInputStream ("C:\\Users\\Ilham\\Desktop\\boco\\degree stuffs\\sem 2\\WIA1002\\ilham_u2000963.txt"));
            
            while(sc.hasNextLine())
            {
                String readme = sc.nextLine();
                System.out.println(readme);
            }
            
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        try{
            PrintWriter out = new PrintWriter (new FileOutputStream ("C:\\Users\\Ilham\\Desktop\\boco\\degree stuffs\\sem 2\\WIA1002\\ilham_u2000963.txt", true));
            out.println("\n\nThursday, 16 June 2022.\n" +
                        "It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did\n" +
                        "well in this course");
            
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    
    
}
