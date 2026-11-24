package Programs_asked_in_Companies_during_Technical_Rounds;

// 19 Check Prime Number
//
//A prime number is a natural number greater than 1 that has exactly two positive divisors: 1 and the
//number itself.
//Given an integer x, write a program to determine whether the number is prime or not.
//• Return true if x is a prime number
//• Return false otherwise
//The solution should run in O(n) time complexity and O(1) Space Complexity
// Input: x = 7
//Output: true
//
//Input: x = 10
//Output: false

public class P19 {
    public static boolean isPrime(int num) {
        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
