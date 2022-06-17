package exercises.sem2.Tutor.T2;

public class q1 {
    public static void main(String[] args) {
        Container<Integer> integer = new Container<>();
        Container<String> string = new Container<>();

        integer.Add(50);
        string.Add("Java");

        System.out.println(integer.Retrieve());
        System.out.println(string.Retrieve());
    }
}
