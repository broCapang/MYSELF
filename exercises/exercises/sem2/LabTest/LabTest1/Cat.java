package exercises.sem2.LabTest.LabTest1;

public class Cat extends Pet{
    private String name;
    //constructor with object cat for the parameter
    public Cat(Cat o) {
        super(o.getBreed(), o.getSickness(), o.getWeight());
        this.name = o.name;
    }
    //constructor with 4 parameters
    public Cat(String name, String breed, String sickness, double weight) {
        super(breed, sickness, weight);
        this.name = name;
    }
    //name getter
    public String getName() {
        return name;
    }
    //name setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n'
                 + super.toString();// inherit pet's toString
    }
}
