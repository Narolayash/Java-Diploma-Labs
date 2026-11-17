package Lab_29;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");

            System.out.println(fr.read());

            // int ch;
            // while((ch = fr.read()) != -1) {
            //     System.out.print((char)ch); // console output
            //     fw.write(ch);               // write to file
            // }

            fr.close();
            fw.close();
            System.out.println("\nFile Copied Successfully!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
