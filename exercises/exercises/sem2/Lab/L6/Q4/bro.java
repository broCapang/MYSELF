package exercises.sem2.Lab.L6.Q4;

import exercises.sem2.Lab.L6.Q1.MyStack;

import java.util.Scanner;

public class bro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Character> a = new MyStack<>();
        System.out.println("Enter : ");
        String b = sc.next();

        for (int i=0;i<b.length();i++){
            a.push(b.charAt(i));
        }
        int c=0;
        while (!a.isEmpty()){
            if (a.pop()!=b.charAt(c)){
                System.out.println("no");
                break;
            }
            c++;
        }

    }
}
