package Lab_24;

class Person {
    String name = "Parent Name";

    Person() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("Parent show() method");
    }
}

class Student extends Person {
    String name = "Child Name";

    Student() {
        super();  // calls parent constructor
        System.out.println("Child Constructor Called");
    }

    void display() {
        System.out.println("Parent name using super = " + super.name);
        super.show();  // call parent method
    }
}

public class P2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
