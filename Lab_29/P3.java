package Lab_29;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P3 {
    public static void main(String[] args) {
        try {
            FileReader f1 = new FileReader("file1.txt");
            FileReader f2 = new FileReader("file2.txt");
            FileWriter fw = new FileWriter("merged.txt");

            int ch;

            // Copy file1
            while((ch = f1.read()) != -1)
                fw.write(ch);

            // Copy file2
            while((ch = f2.read()) != -1)
                fw.write(ch);

            f1.close();
            f2.close();
            fw.close();

            System.out.println("Files Merged Successfully!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
