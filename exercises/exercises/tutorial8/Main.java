package exercises.tutorial8;

public class Main {
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println(myObj.number);
        Student myObj2 = new Student("yes");

        System.out.println(myObj2.number);
    }
}
