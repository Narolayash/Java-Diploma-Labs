package Lab_20;

class Box {
    double length, width, height;

    // Constructor 1
    Box() {
        length = width = height = 1;
    }

    // Constructor 2
    Box(double l) {
        length = width = height = l;
    }

    // Constructor 3
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    void volume() {
        System.out.println("Volume: " + (length * width * height));
    }
}

public class P4 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2,3,4);

        b1.volume();
        b2.volume();
        b3.volume();
    }
}
