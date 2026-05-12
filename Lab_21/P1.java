package Lab_21;


// This keyword
// uses :
// Refer current object variables
// Invoke current class constructor
class Student {
    int id;
    String name;

    // Parameterized constructor using this keyword
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class P1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        s1.display();
    }
}
