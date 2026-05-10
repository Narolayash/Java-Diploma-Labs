package Lab_3;

// 5) Write a program to calculate simple interest ((principal*roi*time period)/100). (C)
public class P5 {
    public static void main(String[] args) {
        double p = 10000;   // principal
        double r = 5;       // rate
        double t = 2;       // time

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
