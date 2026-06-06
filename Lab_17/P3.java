package Lab_17;

import java.util.Scanner;

// 3) Write a Java String program to print even length words. (B)
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i=0; i<str.length(); i++) {
            if ((i & 1) == 1) System.out.println(str.charAt(i));
        }
    }
}
