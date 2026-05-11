package Lab_8;

import java.util.Scanner;

// 3) Write a program to find factorial of the given number. (A)
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;

        System.out.println("Factorial = "+fact);
    }
}
