package Lab_17;

import java.util.Scanner;

// 4) Write a program to implement a program to check if a string is a palindrome. (C)
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}
