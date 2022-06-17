package exercises.sem2.Lab.L4;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList('a');
        test.add('b');
        test.add('c');
        test.add('d');
        test.add('e');
        test.print();
        test.reverse();
        System.out.println(test.getFirst());
        System.out.println(test.getLast());
        System.out.println(test.remove(2));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.contain('c'));


    }
}
