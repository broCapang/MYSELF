package exercises.sem2.LabTest.LabTest2;

public class Q2 {
    public static void main(String[] args) {
        MyStack<String> tag = new MyStack<>();
        String test = "<note> </note>";

        int j = test.indexOf('<');
        while (j!=-1){
            int k = test.indexOf('>');
            if (k == -1)
                System.out.println("Wrong"); // invalid tag
            String inside = test.substring(j+1, k);
            if (!inside.startsWith("/")){
                tag.push(inside);
            }else {
                if (tag.isEmpty()){
                    System.out.println("Wrong");
                }
                if (!inside.substring(1).equals(tag.pop())){
                    System.out.println("Wrong");
                }
            }
            j=test.indexOf('<');
        }
        System.out.println("End");

    }
}
