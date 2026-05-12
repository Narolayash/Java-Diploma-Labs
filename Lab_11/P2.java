package Lab_11;

import java.util.Scanner;

// 2) Write a program to find maximum number from given three numbers using method. (A)
public class P2 {
    static int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Maximum = " + max(a,b,c));
    }
}
