package exercises.sem2.Lab.L4;

public class MyLinkedList<E> {
    Node<E> head, tail;
    int size = 0;

    public MyLinkedList(E head){
        this.head = new Node<>(head);
        tail=this.head;
        size++;
    }
    public MyLinkedList(){
        this.head = new Node<>();
        head = tail;
        size++;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        if (head==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        ++size;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
    }

    public void add(int index, E e){
        Node<E> temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        Node<E> temp2 = temp.next;
        temp.next = new Node<>(e);
        temp.next.next = temp2;
    }

    public void add(E e){
        addLast(e);
    }

    public E removeFirst(){
        if (head==null){
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        return temp.element;
    }

    public E removeLast(){
        Node<E> temp = head;
        if (head==null){
                return null;
        }
        while (temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        return temp.next.element;
    }

    public E remove(int index){
        Node<E> temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        E val = temp.next.element;
        temp.next = temp.next.next;
        return val;
    }

    public boolean contain(E e){
        Node<E> temp = head;
        while (temp.next!=null){
            if (temp.element==e){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index){
        Node<E> temp = head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp.next.element;
    }

    public E getFirst(){
        return head.element;
    }

    public E getLast(){
        return tail.element;
    }

    public int indexOf(E e){
        if (contain(e)){
            int i=0;
            Node<E> temp = head;
            while (temp.next!=null){
                if (temp.element==e){
                    return i;
                }
                i++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e){
        if (contain(e)){
            int i=0,last=0;
            Node<E> temp = head;
            while (temp.next!=null){
                if (temp.element==e){
                    last = i;
                }
                i++;
                temp = temp.next;
            }
            return last;
        }
        return -1;
    }

    public E set(int index, E e){
        Node<E> temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        E lol=temp.next.element;
        temp.next.element=e;
        return lol;
    }

    public void clear(){
        head=null;
        tail=head;
    }

    public void print(){
        Node<E> temp = head;
        while (temp!=null){
            System.out.println(temp.element);
            temp=temp.next;
        }
    }

    public void reverse(){
        Node<E> temp,prev=null,current = head;
        while (current != null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        tail=head;
        head = prev;
        temp = head;
        while (temp!=null){
            System.out.println(temp.element);
            temp=temp.next;
        }
    }
}

