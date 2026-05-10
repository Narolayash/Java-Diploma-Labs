package Lab_4;

// 1) Write a program to print addition of 2 numbers (with Scanner). (A)
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

//        int sum = a + b;
//        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + (a + b));
    }
}
