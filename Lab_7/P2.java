package Lab_7;

import java.util.Scanner;

// 2) Write a program to determine grade based on marks. Read marks of five subjects.
//Calculate percentage and print class accordingly. Fail below 35, Pass Class between 35 to
//45, Second Class between 45 to 60, First Class between 60 to 70, Distinction if more than
//70. (A)
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");
        for(int i=1;i<=5;i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        System.out.println("Percentage = " + percentage);

        if(percentage < 35)
            System.out.println("Fail");
        else if(percentage < 45)
            System.out.println("Pass Class");
        else if(percentage < 60)
            System.out.println("Second Class");
        else if(percentage < 70)
            System.out.println("First Class");
        else
            System.out.println("Distinction");
    }
}
