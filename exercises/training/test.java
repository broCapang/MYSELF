package training;

import exercises.sem2.Lab.L7.Q1.MyQueue;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        MyQueue<String> input = new MyQueue<>();
        Stack<String> approved = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        while (true){
            System.out.println("Enter confession (Enter exit to exit) : ");
            in= sc.nextLine();
            if (in.equals("exit")){
                break;
            }
            input.enqueue(in);
        }
        String a;
        while (input.getSize()>0){
            String z = input.dequeue();
            System.out.println(z);
            a=sc.next();
            if (a.equals("Yes")||a.equals("yes")||a.equals("y")||a.equals("Y")){
                approved.push(z);
            }
        }
        System.out.println(approved);

    }
}
