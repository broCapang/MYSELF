package exercises.sem1.lab7;

import java.io.*;
import java.util.Scanner;

public class lab7q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            ObjectOutputStream outputBinary = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            outputBinary.writeUTF("WXES1116");

            outputBinary.writeUTF("Programming I");
            outputBinary.writeUTF("WXES1115");
            outputBinary.writeUTF("Data Structure");
            outputBinary.writeUTF("WXES1110");
            outputBinary.writeUTF("Operating System");
            outputBinary.writeUTF("WXES1112");
            outputBinary.writeUTF("Computing Mathematics I");
            outputBinary.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("coursename.dat"));
            System.out.print("ENTER COURSE CODE : ");
            String code = input.next();
            while (true){
                String bruh = in.readUTF();
                if (bruh.equals(code)){

                    System.out.println(in.readUTF());
                    break;
                }
                in.readUTF();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }
    }
}
