package Lab_4;

// 2) Write a program to convert temperature from Fahrenheit to Celsius.
//(°C = [(°F - 32) * 5]/9). (A)
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + c);
    }
}
