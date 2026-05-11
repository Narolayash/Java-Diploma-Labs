package Lab_8;

import java.util.Scanner;

// 4) Write a program to check whether the given number is prime or not without using
//function. (B)
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        boolean isPrime=true;

        if(n<=1) isPrime=false;
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
