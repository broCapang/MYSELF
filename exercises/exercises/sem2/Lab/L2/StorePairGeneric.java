package exercises.sem2.Lab.L2;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric <T>> {
    private T first, second;
    public StorePairGeneric (T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof StorePairGeneric<?>){
            if ( ((StorePairGeneric<?>)o).first.equals(this.first) && ((StorePairGeneric<?>)o).second.equals(this.second)){
                return true;
            }
        }

        return false;
    }


    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        int bruh = this.getFirst().compareTo(o.getFirst());
        if (bruh==0){
            bruh = this.getSecond().compareTo(o.getSecond());
        }
        return bruh;
    }


}
