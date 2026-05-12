package Lab_11;

import java.util.Scanner;

// 3) Write a program to find the factorial of given number using recursion. (A)
public class P3 {
    static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.println("Factorial = "+factorial(n));
    }
}
