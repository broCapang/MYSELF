package exercises;

import java.util.Scanner;

public class temp{
    static int i = 0;
    static int[][] permutationArray = new int[permutation(10)][10];
    public static void main(String[] args) {

        int k;
        int maxXOR;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of set A and set B (1 to 10): ");
        k = s.nextInt();
        if(k > 10){
            System.out.println("Please enter a value from 1 to 10, please RESTART the program");
            System.exit(0);
        }

        int[] A = new int[k];
        int[] B = new int[k];

        System.out.println("Please enter the elements of set A: ");
        for(k = 0; k < A.length; k++){
            A[k] = s.nextInt();
        }
        System.out.println("Please enter the elements of set B: ");
        for(k = 0; k < B.length; k++){
            B[k] = s.nextInt();
        }

        arrayPermutation(A, 0);

        maxXOR = XOR(B);

        System.out.println("\nThe maximum possible XOR value from both of the set is " + maxXOR);

    }
    private static int XOR(int[] fixed){
        int maxXOR = 0;
        for(int l = 0; l < permutation(fixed.length); l++){
            int sumXOR = 0;
            for(int m = 0; m < fixed.length; m++){
                sumXOR += permutationArray[l][m] ^ fixed[m];
            }
            if(sumXOR > maxXOR){
                maxXOR = sumXOR;
            }
        }
        return maxXOR;
    }
    private static int permutation(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num*permutation(num-1);
        }
    }
    private static void arrayPermutation(int[] dynamic, int index){
        if(index >= dynamic.length - 1){
            System.arraycopy(dynamic, 0, permutationArray[i], 0, dynamic.length);
            i++;
            return;
        }

        for(int i = index; i < dynamic.length; i++){ //For each index in the sub array arr[index...end]

            int temporary = dynamic[index];
            dynamic[index] = dynamic[i];
            dynamic[i] = temporary;

            arrayPermutation(dynamic, index+1);

            temporary = dynamic[index];
            dynamic[index] = dynamic[i];
            dynamic[i] = temporary;
        }
    }
}
