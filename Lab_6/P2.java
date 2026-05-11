package Lab_6;

import java.util.Scanner;

// 2) Write a program in to find maximum number from given three numbers using conditional
//operator. (A)
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//        int max = (a > b) ? (Math.max(a, c)) : (Math.max(b, c));

        System.out.println("Maximum number = " + max);
    }
}
