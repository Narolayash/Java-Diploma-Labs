package Problem_Statements_Basic_To_String;

//WAP to find weather given number is Ugly or not.
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
// Input: n = 6 Output: true Explanation: 6 = 2 × 3
public class P11 {
    private static boolean isUgly(int num) {
        if (num < 0) return false;

        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;

        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
}
