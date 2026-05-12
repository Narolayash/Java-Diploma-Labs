package Lab_18;

import java.util.Scanner;

// 3) Write a program to check that whether the given number is Armstrong or not using Math
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, digits);
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
