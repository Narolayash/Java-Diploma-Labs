package Lab_24;

// final variable
class FinalVariableDemo {
    final int SPEED_LIMIT = 90;   // final variable (constant)

    void display() {
        // SPEED_LIMIT = 120;      ERROR: cannot change value
        System.out.println("Speed Limit = " + SPEED_LIMIT);
    }
}


// final method
class Parent {
    final void show() {   // final method
        System.out.println("This is final method from Parent class");
    }
}
class Child extends Parent {
    // void show() { }    ERROR: cannot override final method
}


// final class
final class FinalClass {
    void display() {
        System.out.println("This is a final class");
    }
}
// class Test extends FinalClass { }   ERROR: cannot inherit final class

public class P3 {
}
