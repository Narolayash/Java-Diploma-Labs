package Lab_8;

import java.util.Scanner;

// 2) Write a program to print sum of N numbers using for and while loop. (A)
public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        // using for loop
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println("Sum using for = "+sum);

        // using while loop
        int i=1,sum2=0;
        while(i<=n){
            sum2+=i;
            i++;
        }
        System.out.println("Sum using while = "+sum2);
    }
}
