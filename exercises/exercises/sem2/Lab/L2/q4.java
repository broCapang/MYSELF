package exercises.sem2.Lab.L2;

public class q4 {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }

    public static <T extends Comparable> String minmax(T t[]){
        T max = t[0];
        T min = t[0];
        for(int i=0; i<t.length; i++ ) {
            if(t[i].compareTo(max)>0) {
                max = t[i];
            }
            if (t[i].compareTo(max)<0){
                min = t[i];
            }
        }
        return "Min = "+min+" Max = "+max+"\n";
    }
}
