package exercises.sem2.FinalExam.q2;

import java.util.Stack;

public class q2 {

    static <T> void insertBottom(Stack<T> stack,T x) {
        if (stack.isEmpty()) {
            stack.push(x);
        }
        else {
            T a = stack.peek();
            stack.pop();
            insertBottom(stack,x);
            stack.push(a);
        }
    }
    static <T> void reverseOrder(Stack<T> stack) {
        if (stack.size() > 0) {
            T x = stack.peek();
            stack.pop();
            reverseOrder(stack);
            insertBottom(stack,x);
        }
    }
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String a [] ={"Switch", "Motherboard", "RAM", "SSD", "CPU", "GPU", "Router"};
        for (String i: a){
            st.push(i);
        }
        System.out.println("---Original Stack---");
        System.out.println(st);
        reverseOrder(st);
        System.out.println("---Reversed Stack---");
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        Integer b [] ={17,21,45,23,1,99};
        for (int i=0;i<b.length;i++){
            st2.push(b[i]);
        }
        System.out.println("---Original Stack---");
        System.out.println(st2);
        reverseOrder(st2);
        System.out.println("---Reversed Stack---");
        System.out.println(st2);
    }

}
