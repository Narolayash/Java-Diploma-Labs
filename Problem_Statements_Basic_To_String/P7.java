package Problem_Statements_Basic_To_String;

import java.util.Scanner;

// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user
// (Note that you are not allowed to use an array for this)
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        float avg = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Enter no. :");
            int inp = sc.nextInt();

            if (inp > max) max = inp;
            if (inp < min) min = inp;

            sum += inp;
        }

        avg = (float) sum / n;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}
