package Problem_Statements_Basic_To_String;

// 39 You are given a 0-indexed array nums consisting of positive integers. You can choose two
//indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of
//nums[j].
//Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices
//i and j that satisfy the conditions.
//Input: nums = [18,43,36,13,7]
//Output: 54
//Explanation: The pairs (i, j) that satisfy the conditions are: - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54. - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
//So the maximum sum that we can obtain is 54.

public class P39 {
    public static int[] sumOfDigit(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            int sum = 0;
            int num = arr[i];

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            ans[i] = sum;
        }

        return ans;
    }

    public static int solution(int[] arr) {
        int n = arr.length;
        int[] sumArr = sumOfDigit(arr);

        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (sumArr[i] == sumArr[j]) {
                    int sum = arr[i] + arr[j];

                    if (sum > maxSum) maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {18,43,36,13,7}));
    }
}
