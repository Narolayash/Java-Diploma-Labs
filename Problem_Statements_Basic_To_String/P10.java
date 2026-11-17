package Problem_Statements_Basic_To_String;

//WAP to find a quotient and reminder of 2 number
// (bigger number should be divided by lower number)
// and you are not allowed to use a division and quotient operator.
public class P10 {
    private static void findQuotientAndReminder(int a, int b) {
        if (a < b)
            System.out.println("Enter valid inputs");

        int quotient = 0;
        while (a >= b) {
            a -= b;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: " + a);
    }

    public static void main(String[] args) {
        findQuotientAndReminder(15, 3);
    }
}
