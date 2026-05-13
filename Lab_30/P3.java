package Lab_30;

import java.io.*;

public class P3 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream("input.txt"));
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream("output3.txt"));

            int data;
            while((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();
            System.out.println("File copied using Buffered Streams!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
