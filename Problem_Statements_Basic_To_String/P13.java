package Problem_Statements_Basic_To_String;

// WAP to find weather given number is Automorphic or not. An automorphic number is a number whose square ends
// with the same digits as the number itself.  For example, 5 is automorphic because 5² = 25, which ends in 5.
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76.

public class P13 {
    private static boolean isAutomorphic(int num) {
        int square = num * num;

        int divisor = 1;
        int temp = num;
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        int lastDigits = square % divisor;

        return num == lastDigits;
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(76));
    }
}
