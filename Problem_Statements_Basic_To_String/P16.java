package Problem_Statements_Basic_To_String;

//WAP to convert a Decimal number to BCD.
public class P16 {

    private static String DecimalToBCD(int num) {
        if (num < 0)
            return "Plz! enter a positive integer!";
        else if (num == 0)
            return "0000";

        String bcd = "";

        while (num > 0) {
            int digit = num % 10;
            String binary = "";

            for (int i = 0; i < 4; i++) {
                binary = (digit % 2) + binary;
                digit /= 2;
            }

            bcd = binary + " " + bcd;
            num /= 10;
        }

        return bcd;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBCD(159));
    }
}
