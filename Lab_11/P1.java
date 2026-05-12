package Lab_11;

import java.util.Scanner;

// 1) Write a program to calculate simple interest using method. (А)
public class P1 {
    static double simpleInterest(double p,double r,double t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal, Rate, Time: ");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();

        double si=simpleInterest(p,r,t);
        System.out.println("Simple Interest = "+si);
    }
}
