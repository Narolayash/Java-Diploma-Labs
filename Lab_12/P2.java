package Lab_12;

import java.util.Scanner;

// 2) Write a program to count number of even or odd number from an array of N number.(A)
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0, odd=0;

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
