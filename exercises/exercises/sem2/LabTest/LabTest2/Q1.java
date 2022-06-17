package exercises.sem2.LabTest.LabTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(new FileInputStream("labtest2.txt"));
            String input="";
            while (read.hasNextLine()){
                input += read.nextLine();
            }

            String split[] = input.split(" ");

            MINEQueue<String> codes = new MINEQueue<>();
            MINEQueue<String> products = new MINEQueue<>();
            MINEQueue<Integer> size = new MINEQueue<>();

            for (int i=0;i<split.length;i+=2){
                if (!codes.contains(split[i])){
                    codes.enqueue(split[i]);
                }
            }
            int n = codes.getSize();
            for (int j=0;j<n;j++){
                int nP=0;
                for (int i=0;i<split.length-1;i++){
                    if (codes.peek().equals(split[i])){
                        products.enqueue(split[i+1]);
                        nP++;
                    }
                    codes.enqueue(codes.dequeue());
                    size.enqueue(nP);
                }
            }

            while (!codes.isEmpty()){
                System.out.println(codes.dequeue());
                n=size.dequeue();
                for (int i=0;i<n;i++){
                    System.out.println(products.dequeue());
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("No file found");
        }


    }
}
