package exercises.sem2.FinalExam.q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Asus\\Downloads\\staffList.txt"));
            String[] input = new String[10];
            int i=0;
            while (sc.hasNextLine()){
                input[i]="";
                input[i] += sc.nextLine();
                i++;
            }
            LinkedList<Staff> staffList1 = new LinkedList<>();
            for (int j=0;j<10;j++){
                String[] a = input[j].split(",");
                staffList1.addLast(new Staff(Integer.parseInt(a[0]),a[1],a[2]));
            }
            LinkedList<Staff> staffList2 = staffList1.clone();
            Random rand = new Random();
            // ROUND 1
            for (int j=0;j<5;j++){
                int number = rand.nextInt(10);
                ArrayList<Integer> numberTaken = new ArrayList<>();
                if (!numberTaken.contains(number)){
                    numberTaken.add(number);
                    Staff winner1 = staffList1.get(number);
                    System.out.println(winner1.getID()+ " " + winner1.getName()+" Wins a drone!");
                }else {
                    j--;
                }
            }
            // ROUND 2
            int vouncherLeft = 1000;
            while (vouncherLeft>0){
                int number2= rand.nextInt(10);
                Staff winner2 = staffList2.get(number2);
                if (winner2.getPosition().equals(" Assistant")){
                    if (vouncherLeft>=200){
                        vouncherLeft-=200;
                        System.out.println(winner2.getPosition()+" "+winner2.getName()+" wins RM200."+" Cash vounchers left RM "+vouncherLeft);
                    }
                }else if (winner2.getPosition().equals(" Supervisor")){
                    if (vouncherLeft>=100){
                        vouncherLeft-=100;
                        System.out.println(winner2.getPosition()+" "+winner2.getName()+" wins RM100."+" Cash vounchers left RM "+vouncherLeft);
                    }
                }else {
                    System.out.println(winner2.getPosition()+" "+winner2.getName()+" is the winner, but no cash vouncher will be given");
                }
            }

        }catch (FileNotFoundException a){
            System.out.println("There is no such file");
        }

    }
}
