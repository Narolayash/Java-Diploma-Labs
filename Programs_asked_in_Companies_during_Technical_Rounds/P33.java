package Programs_asked_in_Companies_during_Technical_Rounds;

// 33 Maximum Sum of Contiguous Subarray of Size k
//Program Definition
//Given an array of integers arr[] and an integer k, find the maximum sum of any contiguous subarray of
//size k.
//• A contiguous subarray is a subarray with consecutive elements.
//• The program should return the largest sum possible among all subarrays of length k.

// Input: arr = [2, 1, 5, 1, 3, 2]
//            k = 3
//Output: Maximum sum = 9
//Explanation
//• Subarray [5, 1, 3] has the highest sum of 9.

//Input: arr = [1, 2, 3, 4, 5, 6]
//k = 2
//Output: Maximum sum = 11
//Explanation
//• Subarray [5, 6] has the highest sum of 11.

public class P33 {
    public static int solution(int[] arr, int k) {
        int n = arr.length;

        if (k > n) return -1;

        int maxSum = 0;
        int i = 0;
        while (i < k) {
            maxSum += arr[i];
            i++;
        }

        int currentSum = maxSum;
        while (i < n) {
            currentSum -= arr[i - k];
            currentSum += arr[i];
            if (maxSum < currentSum) maxSum = currentSum;
            i++;
        }

        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 5, 1, 3, 2}, 3));
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6}, 2));
    }
}
