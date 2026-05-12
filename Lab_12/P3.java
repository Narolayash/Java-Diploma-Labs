package Lab_12;

import java.util.Scanner;

// 3) Write a program to calculate sum of all the elements in an array. (A)
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
