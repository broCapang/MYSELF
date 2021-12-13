package exercises;

import java.util.Scanner;

public class lab6q4 {
    static void gcd(int first, int second){
        int remainder=first%second;
        if (remainder!=0){
            first = second;
            second = remainder;
            gcd(first, second);
        }else {
            System.out.println(second);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first=input.nextInt();
        System.out.print("Enter second integer: ");
        int second=input.nextInt();

        gcd(first,second);
    }
}
