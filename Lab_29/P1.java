package Lab_29;

import java.io.File;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Yash Narola\\Desktop\\lab_29.txt");

            if(file.createNewFile())
                System.out.println("File Created Successfully!");
            else
                System.out.println("File Already Exists.");
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
