package Lab_4;

// 4) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking
//your weight in kilograms and dividing by the square of your height in meters.
//Write a program that prompts the user to enter a weight in pounds and height in inches
//and displays the BMI. (Note: - 1 pound=.45359237 Kg and 1 inch=.0254 meters) (B)
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;

        double bmi = weightKg / (heightM * heightM);
        System.out.printf("BMI = %.2f",bmi);
//        System.out.println("BMI = " + bmi);
    }
}
