package exercises.sem2.Lab.L4;

public class Node <E>{
    E element;
    Node<E> next;

    Node(){
        this.element = null;
    }

    Node(E element){
        this.element = element;
    }

}
