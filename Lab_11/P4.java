package Lab_11;

import java.util.Scanner;

// 4) Write a program to generate Fibonacci series of N given number using method. (B)
public class P4 {
    static void fibonacci(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");

        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();

        fibonacci(n);
    }
}
