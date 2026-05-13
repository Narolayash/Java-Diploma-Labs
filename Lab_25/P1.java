package Lab_25;

// Abstract class
abstract class Shape {
    abstract double area();
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class P1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Circle c = new Circle(3);

        System.out.println("Area of Rectangle = " + r.area());
        System.out.println("Area of Circle = " + c.area());
    }
}
