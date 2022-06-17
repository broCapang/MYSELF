package exercises.sem2.LabTest.LabTest1;

import java.util.ArrayList;

public class Vet {
    private String name, qualification;

    //constructor
    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
    //print treatment history
    public void giveTreatment(ArrayList<Prescription> prescription){
        for (int i=0;i<prescription.size();i++){
            System.out.println(prescription.get(i));
        }
    }

    @Override
    public String toString() {
        return "LabTest1.Vet on duty: " + name +
                ", " + qualification + "\n";
    }
}
