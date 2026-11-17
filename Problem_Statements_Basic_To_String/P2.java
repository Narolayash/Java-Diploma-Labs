package Problem_Statements_Basic_To_String;

//WAP to find a summation of a digit of a given number. (Iterative and recursive)
public class P2 {
//    private static long findSumOfDigits(int num) {
//        long sum = 0;
//
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//
//        return sum;
//    }

    private static long findSumOfDigits(int num) {
        if (num == 0) return num;

        return num % 10 + findSumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfDigits(123));
    }
}
