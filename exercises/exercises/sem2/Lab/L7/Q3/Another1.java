package exercises.sem2.Lab.L7.Q3;
import exercises.sem2.Lab.L7.Q1.MyQueue;

import java.util.Scanner;

public class Another1 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        Scanner sc =  new Scanner(System.in);
        String bro = "";
        int in = 0;
        while (in >=0){
            System.out.println("Buy / Sell : ");
            bro = sc.next();

            if (bro.equals("Buy")){
                System.out.print("Enter number of shares : ");
                in =  sc.nextInt();
                queue.enqueue(in);
                System.out.println("Enter the price : ");
                in=sc.nextInt();
                queue.enqueue(in);
            }else if (bro.equals("Sell")){
                System.out.print("Enter number of shares : ");
                in =  sc.nextInt();
                while (queue.peek()<in){
                    
                }
                System.out.println("Enter the price : ");
                in=sc.nextInt();
                queue.enqueue(in);
            }else {
                break;
            }

        }

    }
}
