package exercises;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int n=in.nextInt();

        int[][] pascal=new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0||j==i){
                    pascal[i][j]=1;
                    continue;
                }else if (j>i){
                    pascal[i][j]=0;
                    continue;
                }
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
