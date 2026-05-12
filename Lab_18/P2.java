package Lab_18;

import java.util.Scanner;

// 2) Write a program to print the largest number from the three given number using Math
//class function. (A)
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: " + largest);
    }

}
