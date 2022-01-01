package exercises.lab8.q1;

import java.util.Random;

public class Number {
    private int[] number;
    private int length, max, min;
    private double average=0;
    private Random r = new Random();

    public Number(){
        number = new int[10];
        length = 10;
        int j=0,k=0,l=0;
        for (int i=0;i<10;i++){
            number[i]=r.nextInt(101);
            average+=number[i];
        }
        average= average/length;
    }
    public Number(int a){
        number = new int[a];
        length = a;
        int j=0,k=0,l=0;
        for (int i=0;i<a;i++){
            number[i]=r.nextInt(101);
            average+=number[i];
        }
        average= average/length;
    }
    public Number(int a, int b){
        number = new int[a];
        length = a;
        int j=0,k=0,l=0;
        for (int i=0;i<a;i++){
            number[i]=r.nextInt(b+1);
            average+=number[i];
        }
        average= average/length;
    }
    public void getEvenNumber(){
        System.out.println("Even Numbers : ");
        for (int i=0;i<number.length;i++){
            if (number[i]%2==0){
                System.out.println(number[i]);
            }
        }
    }
    public void getPrimeNumber(){
        System.out.println("Prime Numbers : ");
        int bruh=0;
        for (int i=0;i<number.length;i++){
            if (number[i]==2){
                bruh=1;
            }else {
                for (int j=2;j<number[i];j++){
                    if (number[i]%j==0){
                        bruh=0;
                        break;
                    }
                    bruh=1;
                }
            }
            if (bruh==1){
                System.out.println(number[i]);
            }
        }
    }
    public void getAverage(){
        System.out.println("Average : "+average);
    }
    public void getMax(){
        max=Integer.MIN_VALUE;
        for (int i = 0;i<number.length;i++){
            if (max< number[i]){
                max=number[i];
            }
        }
        System.out.println("Max : "+max);
    }
    public void getMin(){
        min=Integer.MAX_VALUE;
        for (int i = 0;i<number.length;i++){
            if (min> number[i]){
                min=number[i];
            }
        }
        System.out.println("Min : "+min);
    }
    public void Output(){
        String str = "";
        for (int i=0;i<number.length;i++){
            str += number[i]+" ";

        }
        System.out.println(str);
        getEvenNumber();
        getPrimeNumber();
        getAverage();
        getMax();
        getMin();

    }
}
