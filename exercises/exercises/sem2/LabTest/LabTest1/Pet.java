package exercises.sem2.LabTest.LabTest1;

public class Pet implements Comparable<Pet> {
    private String breed, sickness;
    private double weight;
    //constructor with 4 parameters
    public Pet(String breed, String sickness, double weight) {
        this.breed = breed;
        this.sickness = sickness;
        this.weight = weight;
    }
    //breed getter
    public String getBreed() {
        return breed;
    }
    //breed setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
    //sickness getter
    public String getSickness() {
        return sickness;
    }
    //sickness setter
    public void setSickness(String sickness) {
        this.sickness = sickness;
    }
    //weight getter
    public double getWeight() {
        return weight;
    }
    //weight setter
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    /**@param object LabTest1.Pet tocompare weight**/
    public int compareTo(Pet o) {
        if (this.weight>o.weight){
            return 1;
        }else if (this.weight<o.weight){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                "Breed: " + breed + '\n' +
                "Weight (KG): " + weight + "\n" +
                "Sickness: " + sickness + '\n';
    }
}
