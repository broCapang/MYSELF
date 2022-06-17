package exercises.sem2.Lab.L2;

public class FindMax {
    public static void main(String[] args) {
        Integer a[] = {1,2,3};
        String b[] = {"red","green","blue"};
        Circle c[] = {new Circle(3),new Circle(2.9),new Circle(5.9)};

        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c).getRadius());
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int i=0;i<list.length;i++){
            if (list[i].compareTo(max)>0){
                max = list[i];
            }
        }
        return max;
    }
}
