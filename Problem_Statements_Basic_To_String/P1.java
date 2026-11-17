package Problem_Statements_Basic_To_String;

// WAP to find a factorial of a given integer (iterative and recursive)
public class P1 {
//    private static long findFactorial(int n) {
//        long factorial = 1;
//
//        for (int i=2; i<=n; i++) {
//            factorial *= i;
//        }
//
//        return factorial;
//    }

    private static long findFactorial(int n) {
        if (n == 1 || n == 0) return 1;

        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
