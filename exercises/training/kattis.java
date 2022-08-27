package exercises.training;

import exercises.sem2.Lab.L7.Q1.MyQueue;


import java.util.*;

public class kattis {

    public static void main(String[] args) {
        MyQueue<Character> list = new MyQueue<>();
        Stack<Character> bro = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String hm = sc.nextLine();




        for (int i=0;i<hm.length();i++){
            if (hm.charAt(i) == '('||hm.charAt(i) == ')'||hm.charAt(i) == '{'||hm.charAt(i) == '}'||hm.charAt(i) == '['||hm.charAt(i) == ']'||hm.charAt(i) == '<'||hm.charAt(i) == '>'){
                list.enqueue(hm.charAt(i));
            }
        }
        int n=list.getSize();

        for (int i=0;i< n;i++){
            if (list.peek()=='('||list.peek()=='{'||list.peek()=='['||list.peek()=='<'){
                bro.push(list.dequeue());
            }else if (list.peek()=='}'&&!bro.isEmpty()&&bro.peek()=='{'){
                bro.pop();
                list.dequeue();
            }else if (list.peek()==']'&&!bro.isEmpty()&&bro.peek()=='['){
                bro.pop();
                list.dequeue();
            }else if (list.peek()=='>'&&!bro.isEmpty()&&bro.peek()=='<'){
                bro.pop();
                list.dequeue();
            }else if (list.peek()==')'&&!bro.isEmpty()&&bro.peek()=='('){
                bro.pop();
                list.dequeue();
            }else {
                break;
            }
        }
        System.out.println(list);
        System.out.println(bro);

        if (list.isEmpty()&& bro.isEmpty()){
            System.out.println("Valid");
        }else {System.out.println("Not Valid");}
    }

}