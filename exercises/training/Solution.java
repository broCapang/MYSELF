package exercises.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    // Object for Input
    static Scanner inputObject = new Scanner(System.in);

    public static void main(String args[]) {
//        int T = inputObject.nextInt();
//        for (int i = 1; i<=T;++i){
//            solve(i);
//        }

        solve(0);

    }

    public static void solve(int I){
        int N = inputObject.nextInt();
        int R = inputObject.nextInt();
        int C = inputObject.nextInt();
        int r = inputObject.nextInt();
        int c = inputObject.nextInt();
        String instruction = inputObject.next();
        char a[] = instruction.toCharArray();
        HashSet<Coordinate> visited = new HashSet<>();
        Coordinate next = null;
        System.out.println(visited.add(new Coordinate(r,c)));

        for (int i=0;i<a.length;i++){
            next = move(a[i],r,c);
//            if (visited.contains(next)){
//                System.out.println("a");
//                i-=1;
//            }else {
//                System.out.println("b");
//                visited.add(next);
//            }
            for (Coordinate hm : visited){
                System.out.println(hm);
                if (hm.compareTo(next)==1){
                    System.out.println("a");
                    i-=1;
                    break;
                }else {
                    System.out.println("b");
                    visited.add(next);
                }
            }
            r=next.getR();
            c=next.getC();
        }
        System.out.println(visited);
        System.out.println(next);



    }

    public static Coordinate move(char a,int r,int c){
        switch (a){
            case 'N': return new Coordinate(r+1,c);
            case 'S': return new Coordinate(r-1,c);
            case 'W': return new Coordinate(r,c-1);
            case 'E': return new Coordinate(r,c+1);
            default:
                return null;
        }
    }

}
class Coordinate implements Comparable<Coordinate>{
    int R;
    int C;

    public Coordinate(int r, int c) {
        R = r;
        C = c;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (o.getC()==this.C && o.getR()==this.R){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return R + " "+ C;
    }
}


