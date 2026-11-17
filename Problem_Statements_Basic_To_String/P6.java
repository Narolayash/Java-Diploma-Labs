package Problem_Statements_Basic_To_String;

// WAP to find weather given number is Armstrong number is not.
public class P6 {
    private static int findNoOfDigits(int num) {
        int countDigit = 0;

        while (num > 0) {
            countDigit++;
            num /= 10;
        }

        return countDigit;
    }

    private static int powerr(int num, int p) {
        int initial = 1;

        for (int i=0; i<p; i++) {
            initial *= num;
        }

        return initial;
    }

    private static boolean isArmstrong(int num) {
        int noOfDigits = findNoOfDigits(num);

        int check = 0;
        int copy = num;

        while (copy > 0) {
            check += powerr(copy % 10, noOfDigits);
            copy /= 10;
        }

        return check == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
