package exercises.lab6;

import java.util.Random;
import java.util.Scanner;

public class lab6q5 {
    public static int compare(int a, int b, int c){
        if (a*b==c){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;

        while(true) {
            int a = r.nextInt(13);
            int b = r.nextInt(13);
            System.out.println("ENTER NEGATIVE NUMBER TO QUIT");
            System.out.print(a + " x " + b + " = ");
            int c = input.nextInt();
            if (c<0){
                break;
            }
            score += compare(a, b, c);
        }
        System.out.println("Your score is "+ score);
    }
}
