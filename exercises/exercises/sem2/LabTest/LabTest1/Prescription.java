package exercises.sem2.LabTest.LabTest1;

public class Prescription<T extends Pet> {
    private T pet;
    private String medication;
    private double dosage;
    //constructor
    public Prescription(T pet, String medication, double dosage) {
        this.pet = pet;
        this.medication = medication;
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "LabTest1.Prescription Note\n" + pet.toString() +
                "Medication: " + medication + '\n' +
                "Dosage (mL): " + dosage + "\n";
    }
}
