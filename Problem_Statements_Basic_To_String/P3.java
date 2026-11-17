package Problem_Statements_Basic_To_String;

//WAP to find a total odd and total even digit of a given number.
public class P3 {
    private static void findTotalOddAndTotalEven(int num) {
        int countOdd = 0, countEven = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem % 2 == 0) countEven++;
            else countOdd++;

            num /= 10;
        }

        System.out.println("Total Odd: " + countOdd);
        System.out.println("Total Even: " + countEven);
    }

    public static void main(String[] args) {
        findTotalOddAndTotalEven(123456);
    }
}
