package Lab_6;

import java.util.Scanner;

// 1) Write a program to check if given number is Positive or Negative using the ternary
//operator. (А)
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num >= 0) ? "Positive Number" : "Negative Number";
        System.out.println(result);
    }
}
