package Lab_7;

import java.util.Scanner;

// 4) Write a program to find out largest number from given three numbers using nested if and
//if-else-if ladder. (B)
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b) {
            if(a > c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        }
        else {
            if(b > c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }
    }
}
