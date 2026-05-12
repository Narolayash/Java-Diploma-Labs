package Lab_20;

class AreaCalculator {

    // Circle
    void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    // Square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Triangle
    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class P1 {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        obj.area(5.5);      // circle
        obj.area(4);        // square
        obj.area(5.0, 6.0); // triangle
    }
}
