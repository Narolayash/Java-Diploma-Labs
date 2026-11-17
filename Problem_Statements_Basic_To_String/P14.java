package Problem_Statements_Basic_To_String;

//WAP to find weather given number is Pronic or not.
// A Pronic Number is defined as a number that is the product of two consecutive non-negative integers.
// In other words, N is a Pronic Number if there exists a non-negative integer k such that N = k * (k + 1).
// E.g. 6 is a Pronic Number because 6=2*3

public class P14 {
    private static boolean isPronic(int num) {
        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPronic(6));
    }
}
