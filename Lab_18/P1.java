package Lab_18;

// 1) Write a program to demonstrate the built-in function of Math class. (e.g. min(), max(),
//random(), pow(), sqrt(), round(), ceil(), floor(), abs())(A)
public class P1 {
    public static void main(String[] args) {
        System.out.println("Min: " + Math.min(10, 20));
        System.out.println("Max: " + Math.max(10, 20));

        System.out.println("Random number (0-1): " + Math.random());

        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Square Root of 25: " + Math.sqrt(25));

        System.out.println("Round 5.6: " + Math.round(5.6));
        System.out.println("Ceil 5.1: " + Math.ceil(5.1));
        System.out.println("Floor 5.9: " + Math.floor(5.9));

        System.out.println("Absolute value of -10: " + Math.abs(-10));
    }
}
