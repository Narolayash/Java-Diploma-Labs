package Problem_Statements_Basic_To_String;

// WAP to find whether a number is Odd or Even without using a % operator.
public class P4 {
    private static void isOddOrIsEven(int num) {
        if ((num & 1) == 1) //  (num / 2) * 2
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    public static void main(String[] args) {
        isOddOrIsEven(123);
        isOddOrIsEven(456);
    }
}
