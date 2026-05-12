package Lab_12;

import java.util.Scanner;

// 1) Write a program that create an array, take the size of array from the user, take the array
// member from the user and display it using loop. (A)
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
