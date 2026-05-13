package Lab_22;

import java.util.Scanner;

// Parent class → Account Details
class Account {
    double principal, rate, time;

    // Constructor
    Account(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }
}

// Child class → Interest Calculation
class Interest extends Account {

    // Constructor calling parent constructor
    Interest(double p, double r, double t) {
        super(p, r, t);
    }

    double calculateSI() {
        return (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + calculateSI());
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        Interest obj = new Interest(p, r, t);
        obj.display();
    }
}
