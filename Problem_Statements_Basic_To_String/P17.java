package Problem_Statements_Basic_To_String;

// WAP to convert a Binary to Decimal.
public class P17 {
    private static int BinaryToDecimal(long binary) {
        int decimal = 0;
        int init = 1;
        while (binary > 0) {
            decimal += (int) (init * (binary % 10));
            init *= 2;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal(1111));
    }
}
