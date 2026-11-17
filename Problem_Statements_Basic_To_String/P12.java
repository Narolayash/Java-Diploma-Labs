package Problem_Statements_Basic_To_String;

// WAP to find weather given number is Kaprekar or not.
//A Kaprekar number is a non-negative integer that, when squared, can be split into two parts whose sum equals
// the original number.  For E.g. 45 is a Kaprekar number because 45 squared (2025) can be split into 20 and 25,
// and 20 + 25 = 45.

public class P12 {
    private static int noOfDigits(int num) {
        int countDigits = 0;

        while (num > 0) {
            countDigits++;
            num /= 10;
        }

        return countDigits;
    }

    private static boolean isKaprekar(int num) {
        if (num < 0) return false;

        int square = num * num;

        int temp = num;
        int divisor = 1;
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        int left = square / divisor;
        int right = square % divisor;

        return left + right == num;
    }

    public static void main(String[] args) {
        System.out.println(isKaprekar(45));
    }
}
