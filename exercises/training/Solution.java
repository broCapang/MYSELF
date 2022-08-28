package exercises.training;

import java.util.*;
import java.io.*;
public class Solution {

    static BitSet[] rowBitsets;   // m horizontal bitset
    static BitSet[] colBitsets;   // n vertical bitsets

    public static void init(int rows, int cols) {
        // initilize m + n bitsets
        rowBitsets = new BitSet[rows + 1];
        colBitsets = new BitSet[cols + 1];
        for (int i = 1; i <= rows; i++) rowBitsets[i] = new BitSet(cols + 1);
        for (int i = 1; i <= cols; i++) colBitsets[i] = new BitSet(rows + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            int C = sc.nextInt();
            int Sr = sc.nextInt();
            int Sc = sc.nextInt();
            sc.nextLine();  // skip \n at end of previous line
            String seq = sc.nextLine();

            init(R, C);
            for (int j = 0; j < N; j++) {
                rowBitsets[Sr].set(Sc);
                colBitsets[Sc].set(Sr);

                switch(seq.charAt(j)) {
                    case 'W': Sc = rowBitsets[Sr].previousClearBit(Sc); break;
                    case 'E': Sc = rowBitsets[Sr].nextClearBit(Sc); break;
                    case 'N': Sr = colBitsets[Sc].previousClearBit(Sr); break;
                    case 'S': Sr = colBitsets[Sc].nextClearBit(Sr); break;
                    default: break;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + Sr + " " + Sc);
        }
    }
}