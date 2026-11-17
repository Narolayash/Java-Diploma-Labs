package Problem_Statements_Basic_To_String;

// WAP to find a prime number between range (range should be entered by user).
public class P5 {
    private static boolean isPrimeNo(int num) {
        if (num <= 1) return false;

        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    private static void findPrimeNoInRange(int start, int end) {
        if (start > end)
            System.out.println("Plz enter valid range!");

        for (int i=start; i<=end; i++) {
            if (isPrimeNo(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        findPrimeNoInRange(1, 100);
    }
}
