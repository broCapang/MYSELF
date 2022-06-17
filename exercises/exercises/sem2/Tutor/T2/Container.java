package exercises.sem2.Tutor.T2;

public class Container <T>{
    private T t;
    boolean contain;

    public Container() {
        contain = false;
    }
    public void Add(T t){
        this.t = t;
        contain = true;
    }
    public T Retrieve(){
        return this.t;
    }
}
