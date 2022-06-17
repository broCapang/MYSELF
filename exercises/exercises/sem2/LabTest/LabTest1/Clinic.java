package exercises.sem2.LabTest.LabTest1;

import java.util.ArrayList;

public class Clinic{
    private String clinic;
    private Vet vet;

    public Clinic(String clinic, Vet vet) {
        this.clinic = clinic;
        this.vet = vet;
    }

    @Override
    public String toString() {
        return "LabTest1.Clinic: "+ clinic + "\n" + vet.toString();
    }

    public static void main(String[] args) {
        //instantiate objects
        Vet vet1 = new Vet("Abu Bakar","DVM(India)");
        Clinic clinic1 = new Clinic("Happy Animal LabTest1.Clinic",vet1);
        Cat cat1 = new Cat("Dimmy","Siamese","Diarhea",5);
        Cat cat2 = new Cat("Tabby","British Shorthair","Worms",6);

        //instantiate ArrayList<LabTest1.Prescription>
        ArrayList<Prescription> prescriptionsList = new ArrayList<>();
        //create prescription objects
        Prescription prescription1 = new Prescription(new Cat(cat1),"Tylosin",5);
        Prescription prescription2 = new Prescription(new Cat(cat2),"Pyrantel",3);
        //add prescription objects to arrayList
        prescriptionsList.add(prescription1);
        prescriptionsList.add(prescription2);

        //print clinic
        System.out.println(clinic1.toString());
        //print treatments that vet1 gave
        vet1.giveTreatment(prescriptionsList);


        //compare weight
        if (cat1.compareTo(cat2)>0){
            System.out.println("WeightAnalysis: "+cat1.getName()+" is heaver than " + cat2.getName());
        }else if (cat1.compareTo(cat2)<0){
            System.out.println("WeightAnalysis: "+cat1.getName()+" is lighter than " + cat2.getName());
        }else System.out.println("WeightAnalysis: "+cat1.getName()+" has same weight with " + cat2.getName());
    }

}
