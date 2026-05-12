package Lab_19;

// 3) Write a program to demonstrate anonymous inner class. (C)
abstract class Animal {
    abstract void sound();
}

public class P3 {
    // An Anonymous Inner Class is an inner class without a name that is created at the time of object creation.

    // new ClassOrInterface() {
    //    // methods implementation
    // };

    public static void main(String[] args) {

        // Anonymous Inner Class
        Animal dog = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound();
    }
}
