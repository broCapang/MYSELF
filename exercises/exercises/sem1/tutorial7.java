package exercises.sem1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class tutorial7 {
    public static void main(String[] args) {
        Random r = new Random();
        // QUESTION 1 A
        /*try {
            PrintWriter output = new PrintWriter(new FileOutputStream("integer.txt"));
            for (int i = 0;i<10;i++){
                output.println(r.nextInt(1001));
            }
            output.close();
        }catch (IOException e){
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }*/
        // QUESTION 1 B
        /*try {
            int max = 0;
            Scanner read = new Scanner(new FileInputStream("integer.txt"));
            while (read.hasNext()){
                int temp = read.nextInt();
                if (temp>max){
                    max = temp;
                }
            }
            System.out.println(max);
        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
        }*/
        //  QUESTION 1 C
        /*try {
            ObjectOutputStream outputBinary = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for (int i=0;i<10;i++){
                outputBinary.writeInt(r.nextInt(1001));
            }
            outputBinary.close();
        }catch (IOException e){
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }*/

        //  QUESTION 1 D
        /*int i=0, sum=0;

        try {
            ObjectInputStream inputBinary = new ObjectInputStream(new FileInputStream("integer.dat"));
            int[] binaryNumbers = new int[10];
            try {
                while (true) {
                    binaryNumbers[i] = inputBinary.readInt();
                    sum += binaryNumbers[i];
                    System.out.println(binaryNumbers[i]);
                    i++;
                }
            } catch (EOFException e) {
                int average = sum / i;
                System.out.println("average: " + average);
                inputBinary.close();
            }
        }catch (FileNotFoundException e) {
                System.out.println("File was not found");
        } catch (IOException e) {
                System.out.println("Problem with file input.");
        }*/

        // QUESTION 2 A
        /*try {
            PrintWriter out = new PrintWriter(new FileOutputStream
                    ("d:\\data\\matrix.txt"));
        }catch (IOException e){
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }*/


        // QUESTION3 BOIS
        /*try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a sentence : ");
            String sentence = input.nextLine();
            PrintWriter output = new PrintWriter(new FileOutputStream("binary.txt"));
            int[] charInt= new int[sentence.length()];
            for (int i=0;i<sentence.length();i++){
                charInt[i]=(int) sentence.charAt(i);
                output.println(Integer.toBinaryString(charInt[i]));
            }
            output.close();
        }catch (IOException e){
            System.out.println("PROBLEM WITH OUTPUT FILE");
        }
        try {
            String sentence ="";
            Scanner read = new Scanner(new FileInputStream("binary.txt"));
            while (read.hasNext()){
                int charCode = Integer.parseInt(read.next(), 2);
                sentence += (char)charCode;
            }
            read.close();
            System.out.println(sentence);
        }catch (FileNotFoundException e){
            System.out.println("no file found");
        }
*/
    }
}

