package Programs_asked_in_Companies_during_Technical_Rounds;

// 17 Check Perfect Number
//
//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the
//number itself.
//Given an integer num, determine whether it is a perfect number.
//• Return true if num is a perfect number
//• Return false otherwise
//The solution should run in O(√n) time complexity and O(1) Space Complexity
//
// Input: num = 28
//Output: true
//Input: num = 7
//Output: false

public class P17 {
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i=2; i*i<=num; i++) {

            if (num % i == 0) {
                sum += i;

                if (i != num / i)
                    sum += num / i;
            }

        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
}
