package exercises.lab8.q1;

import java.util.Random;

public class Number {
    private int[] number, evenNumber, primeNumber, squareNumber;
    private int length, max, min;
    private double average;
    private Random r = new Random();

    public Number(){
        number = new int[10];
        evenNumber = new int[10];
        primeNumber = new int[10];
        squareNumber = new int[10];
        length = 10;
        int j=0,k=0,l=0;
        for (int i=0;i<10;i++){
            number[i]=r.nextInt(101);
            if (number[i]%2==0){
                evenNumber[j]=number[i];
                j++;
            }

        }
    }
    public Number(int a){
        number = new int[a];
        evenNumber = new int[a];
        primeNumber = new int[a];
        squareNumber = new int[a];
        length = a;
        int j=0,k=0,l=0;
        for (int i=0;i<a;i++){
            number[i]=r.nextInt(101);
        }
    }
    public Number(int a, int b){
        number = new int[a];
        evenNumber = new int[a];
        primeNumber = new int[a];
        squareNumber = new int[a];
        length = a;
        int j=0,k=0,l=0;
        for (int i=0;i<a;i++){
            number[i]=r.nextInt(b+1);
        }
    }
    public void Output(){

    }
}
