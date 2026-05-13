package Lab_30;

import java.io.*;

public class P2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line); // display
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("File copied using BufferedReader/Writer!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
