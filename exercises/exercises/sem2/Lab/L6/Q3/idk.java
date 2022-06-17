package exercises.sem2.Lab.L6.Q3;

import exercises.sem2.Lab.L6.Q1.MyStack;

public class idk {
    public static void main(String[] args) {
        MyStack<Integer> a = new MyStack<>();
        for (int i=0; i<10;i++){
            a.push(i);
        }
        int b=0;
        while (!a.isEmpty()){
            b+=a.pop();
        }
        System.out.println(b);
    }
}
