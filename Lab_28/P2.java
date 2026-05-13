package Lab_28;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int[] arr = {1,2,3};
//            System.out.println("Array value = " + arr[5]); // Array exception
            System.out.println("Array value = " + arr[0]);

            int result = 100 / num; // Arithmetic exception
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
        finally {
            System.out.println("Exit");
        }
    }
}
