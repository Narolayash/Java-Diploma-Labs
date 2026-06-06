package Lab_12;

import java.util.Scanner;

// 6) Write a program to find the second largest and second smallest number in an array. (C)

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=0; i<n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
        System.out.println("Second Smallest = " + secondSmallest);
    }
}

//public class P6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter elements:");
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i] > largest){
//                secondLargest = largest;
//                largest = arr[i];
//            }
//            else if(arr[i] > secondLargest && arr[i] != largest){
//                secondLargest = arr[i];
//            }
//        }
//
//        System.out.println("Second Largest = " + secondLargest);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for(int i=0;i<n;i++)
//            arr[i] = sc.nextInt();
//
//        Arrays.sort(arr);
//
//        int secondLargest = Integer.MIN_VALUE;
//
//        // find first element smaller than largest
//        for(int i=n-2;i>=0;i--){
//            if(arr[i] != arr[n-1]){
//                secondLargest = arr[i];
//                break;
//            }
//        }
//
//        System.out.println("Second Largest = " + secondLargest);
//    }
//}
