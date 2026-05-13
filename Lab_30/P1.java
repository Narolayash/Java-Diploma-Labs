package Lab_30;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            int data;
            while((data = fis.read()) != -1) {
                System.out.print((char)data); // print on console
                fos.write(data);             // write to file
            }

            fis.close();
            fos.close();
            System.out.println("\nFile copied using byte stream!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
