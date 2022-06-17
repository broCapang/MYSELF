package exercises.sem2.Lab.L2;

public class q2 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("mom");
        MyGeneric<Integer> intObj = new MyGeneric<>(2);

        System.out.println(strObj.getT());
        System.out.println(intObj.getT());
    }
}
