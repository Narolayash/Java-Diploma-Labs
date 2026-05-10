package Lab_4;

// 3) Write a program that reads a number in meters, converts it to feet, and displays the
//result. (Feet = Meters * 3.28084)(A)
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in meters: ");
        double meter = sc.nextDouble();

        double feet = meter * 3.28084;
        System.out.println("Length in feet = " + feet);
    }
}
