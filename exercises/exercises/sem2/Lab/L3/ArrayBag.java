package exercises.sem2.Lab.L3;

public class ArrayBag <T> implements BagInterface<T>{
    private T[] bag;
    private int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    ArrayBag(){
        numberOfEntries = 0;
    }
    @Override
    public int getCurrentSize() {

        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        if (DEFAULT_CAPACITY<= numberOfEntries){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (numberOfEntries==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean add(T newEntry) {
        if (DEFAULT_CAPACITY>numberOfEntries){
            bag[numberOfEntries]=newEntry;
            numberOfEntries++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T remove() {
        if (numberOfEntries>0){
            numberOfEntries--;
            return bag[numberOfEntries+1];
        }else {
            return null;
        }
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i=0;i<numberOfEntries;i++){
            if (bag[i]==anEntry){
                for (int j = i; i < bag.length - 1; i++) {
                    bag[j] = bag[j + 1];
                }
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        numberOfEntries=0;

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int f=0;
        for (int i=0;i<numberOfEntries;i++){
            if (bag[i]==anEntry){
                f++;
            }
        }
        return f;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i=0;i<numberOfEntries;i++){
            if (bag[i]==anEntry){
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return bag;
    }

    @Override
    public ArrayBag<T> union(ArrayBag<T> object) {
        ArrayBag<T> temp;
        int length = object.getCurrentSize() + this.getCurrentSize();
        System.arraycopy(object.toArray(),object.getCurrentSize(),this.bag,this.numberOfEntries,length);
        this.numberOfEntries = length;
        temp = this;
        return temp;
    }
}
