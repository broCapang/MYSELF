package exercises.sem1.lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class lab7q5 {
    public static void main(String[] args) throws IOException {
        String bruh[][];
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
            int a = in.readInt();
            bruh = new String[a][3];
            System.out.println(a);
            for (int i = 0; i<a;i++){
                for (int j=0;j<3;j++){
                    switch (j){
                        case 0:
                            bruh[i][j]= in.readUTF();
                            break;
                        case 1:
                            bruh[i][j]=String.valueOf(in.readInt());
                            break;
                        case 2:
                            bruh[i][j]=String.valueOf(in.readChar());
                            break;
                    }
                }

            }
            for (int i = 0; i < a - 1; i++)
            {
                String temp []= new String[3];
                for (int j = 0; j < a - i - 1; j++)
                {
                    if (bruh[j][0].charAt(0)>bruh[j + 1][0].charAt(0))
                    {
                        // swap arr[j] and arr[j+1]
                        temp = bruh[j];
                        bruh[j] = bruh[j + 1];
                        bruh[j + 1] = temp;
                    }
                }

                // IF no two elements were
                // swapped by inner loop, then break

            }
            for (int i=0;i<a;i++){
                for (int j=0;j<3;j++){
                    System.out.println(bruh[i][j]);
                }
            }
            in.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("PROBLEM WITH FILE OUTPUT");
        }
    }
}
