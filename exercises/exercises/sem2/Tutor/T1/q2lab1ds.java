
package exercises.sem2.Tutor.T1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class q2lab1ds {


    public static void main(String[] args) {
       try{
           Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Ilham\\Desktop\\boco\\degree stuffs\\sem 2\\WIA1002\\text1.txt"));
           while(sc.hasNextLine())
           {
               String a = sc.nextLine();
               
               String[] b = a.split(",");
               
               System.out.println("For "+a+", the number of characters without the comma is " + b.length);
               
               String c = "";
               for(int i=0;i<b.length;i++)
               {
                   c+=b[i];
               }
               
               System.out.println("The characters without the comma: " + c);
           }
       }catch(FileNotFoundException e){
           System.out.println("File not found.");
       }
    }
    
}
