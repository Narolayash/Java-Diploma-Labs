package Lab_22;

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}

class Triangle extends Shape {
    void area() {
        double b = 4, h = 3;
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}

class Square extends Shape {
    void area() {
        int side = 4;
        System.out.println("Area of Square = " + (side * side));
    }
}

public class P2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();

        c.display();
        c.area();

        t.display();
        t.area();

        s.display();
        s.area();
    }
}
