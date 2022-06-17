package exercises.sem2.Lab.L2;

public class q1 {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


    }
}
