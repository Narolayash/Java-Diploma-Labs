package Lab_28;

public class P1 {
    public static void main(String[] args) {
        try {
//            int a = 10, b = 2;
            int a = 10, b = 0;
            int c = a / b;   // Exception
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}
