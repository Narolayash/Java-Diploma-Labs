package Lab_14;

import java.util.Scanner;

// 1) Write a program to search for an element in an array using linear search. (А)
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int position = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                found = true;
                position = i;
                break;
            }
        }

        if(found)
            System.out.println("Element found at position: " + (position+1));
        else
            System.out.println("Element not found");
    }
}
