package Lab_7;

import java.util.Scanner;

// 3) Write a program to make a Simple Calculator using switch...case. (A)
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch(op) {
            case '+': System.out.println("Result = " + (a+b)); break;
            case '-': System.out.println("Result = " + (a-b)); break;
            case '*': System.out.println("Result = " + (a*b)); break;
            case '/': System.out.println("Result = " + (a/b)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
