package Lab_8;

import java.util.Scanner;

// 5) Write a program to print given number in reverse order. (C)
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }

        System.out.println("Reverse = "+rev);
    }
}
