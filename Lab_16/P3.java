package Lab_16;

import java.util.Scanner;

// 3) Write a program to create Circle class with area and perimeter function to find area and
//perimeter of circle. (C)
class Circle {
    double radius;

    void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class P3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getRadius();

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Perimeter of Circle: " + c.perimeter());
    }
}
