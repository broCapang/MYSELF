package exercises.sem1.lab7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

public class lab7q2 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("index.htm"));
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            while (in.hasNext()){
                output.println(in.next());
            }
            output.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
