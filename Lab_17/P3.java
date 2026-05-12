package Lab_17;

import java.util.Scanner;

// 3) Write a Java String program to print even length words. (B)
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if(str.length() % 2 == 0)
            System.out.println("String length is EVEN");
        else
            System.out.println("String length is ODD");
    }
}
