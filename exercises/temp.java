package exercises;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("enter a word :");
        String word = sn.nextLine();
        int flag = 0,x = 0,y = 0,flag2 = 0;
        for(int i = 0;i<word.length()-1 ;i++){
            if((word.charAt(i) != 'a' || word.charAt(i) != 'e'|| word.charAt(i) != 'i'|| word.charAt(i) != 'o'|| word.charAt(i) != 'u') && ( word.charAt(i+1) == 'a' || word.charAt(i+1) == 'e'|| word.charAt(i+1) == 'i'|| word.charAt(i+1) == 'o'|| word.charAt(i+1) == 'u')){
                flag++;
                //System.out.println(word.charAt(i));
            }
            if(flag == 1 && flag2 == 0){
                x = i;
                flag2++;
                //  System.out.println(word.charAt(i)+" flag1");
            }
            if(flag == 2 && flag2 == 1){
                y = i;
                //System.out.println(word.charAt(i)+" flag2");
                flag2++;}
        }

        char[] ch = new char[word.length()];

        // Copy character by character into array
        for ( int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }

        ch[x] = word.charAt(y);
        ch[y] = word.charAt(x);

        // Printing content of array

        System.out.print("lebron james will say: ");
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println("");




    }
}
