package Lab_11;

import java.util.Scanner;

// 5) Write a program to accept a number and check whether the number is prime or not.
// Use method name check (int n). The method returns 1, if the number is prime
// otherwise, it returns 0. (C)
public class P5 {
    static int checkPrime(int n){
        if(n<=1) return 0;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int result=checkPrime(n);

        if(result==1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
