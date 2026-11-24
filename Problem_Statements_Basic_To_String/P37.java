package Problem_Statements_Basic_To_String;

// 37 Given an array of N integers, and an integer K, find the number of pairs of elements in the
//array whose sum is equal to K.
//e.g. Input: N = 4, K = 6
//arr[] = {1, 5, 7, 1}
//Output: 2
//Explanation:
//arr[0] + arr[1] = 1 + 5 = 6
//and arr[1] + arr[3] = 5 + 1 = 6.

import java.util.HashMap;

public class P37 {
//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 5, 7, 1};
//        int n = arr.length;
//        int k = 6;
//
//        int count = 0;
//        for (int i=0; i<n-1; i++) {
//            for (int j=i+1; j<n; j++) {
//                if (arr[i] + arr[j] == k) count++;
//            }
//        }
//
//        System.out.println("Output: " + count);
//    }


    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 7, 1};
        int n = arr.length;
        int k = 6;

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int compliment = k - num;

            if (map.containsKey(compliment))
                count += map.get(compliment);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Output: " + count);
    }
}
