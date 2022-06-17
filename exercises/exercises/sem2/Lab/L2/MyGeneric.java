package exercises.sem2.Lab.L2;

public class MyGeneric <T>{
    private T t;
    MyGeneric(T t){
        this.t=t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }


}
