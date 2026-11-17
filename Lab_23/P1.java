package Lab_23;

// 1) Design a class named MyPoint to represent a point with x- and y-coordinates. The class
//contains: The data fields x and y that represent the coordinates with getter methods. (A)
// a no-arg constructor that creates a point (0, 0).
// a constructor that constructs a point with specified coordinates.
// a method named distance that returns the distance from this point to a specified
// point of the MyPoint type.
// a method named distance that returns the distance from this point to another
// point with specified x- and y-coordinates.

class MyPoint {
    private double x;
    private double y;

    // No-arg constructor
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    double getX() { return x; }
    double getY() { return y; }

    // Distance to another MyPoint
    double distance(MyPoint p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    // Distance to specified coordinates
    double distance(double x, double y)  {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}

class ThreeDPoint extends MyPoint {
    private double z;

    // No-arg constructor
    ThreeDPoint() {
        super(0, 0);
        this.z = 0;
    }

    // Parameterized constructor
    ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    double getZ() { return z; }

    // Override distance method (3D distance)
    double distance(ThreeDPoint p) {
        return Math.sqrt(
                Math.pow(getX() - p.getX(), 2) +
                Math.pow(getY() - p.getY(), 2) +
                Math.pow(getZ() - p.getZ(), 2)
        );
    }
}

public class P1 {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        double dist = p1.distance(p2);

        System.out.println("Point 1: (0,0,0)");
        System.out.println("Point 2: (10,30,25.5)");
        System.out.println("Distance between two points = " + dist);
    }
}
