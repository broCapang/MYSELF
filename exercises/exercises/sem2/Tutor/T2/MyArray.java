package exercises.sem2.Tutor.T2;

public class MyArray <T>{

    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        String b[] = {"Jane","Tom","Bob"};
        Character c[] = {'a','b','c'};

        listALl(a);
        listALl(b);
        listALl(c);

    }

    public static <T> void listALl(T a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
