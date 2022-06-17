package exercises.sem2.Tutor.T2;

public class Duo <A,B>{
    private A a;
    private B b;

    Duo(A a,B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Duo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
