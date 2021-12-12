package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class labs {
    static int[] reverse(int[] x) {
        int[] bro = new int[10];
        int j = 9;
        for (int i = 0; i < 10; i++) {
            bro[i] = x[j];
            --j;
            System.out.println("ur dad");
        }
        return bro;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + i + " : ");
            c[i] = in.nextInt();
            System.out.println();
        }
        int[] newC;
        newC = reverse(c);
        for (int i = 0; i < 10; i++) {
            System.out.print(newC[i] + " ");
        }
    }
}

