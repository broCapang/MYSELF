package exercises.sem1.lab7;

import java.io.*;
import java.util.Scanner;

public class lab7q6 {
    public static void main(String[] args) {
        try{
            Scanner order = new Scanner(new FileInputStream("order.txt"));
            int totalOrder=0;
            double price;
            System.out.println();
            while (order.hasNextLine()){
                totalOrder++;
                String line = order.nextLine();
                String orderSplit[] = line.split(",");
                Scanner product = new Scanner(new FileInputStream("product.txt"));
                while (product.hasNextLine()){
                    String productSplit[]=product.nextLine().split(",");
                    if (orderSplit[1].equals(productSplit[0])){
                        price = Integer.valueOf(orderSplit[2])*Double.valueOf(productSplit[2]);
                        String priceF = String.format("%.2f",price);
                        System.out.println(orderSplit[1] + " " + productSplit[1] + " " + orderSplit[2] + " " + productSplit[2] + " " + priceF);
                    }
                }
                product.close();
            }
            order.close();

        } catch (IOException w) {
            System.out.println("not file found");
        }
    }
}
