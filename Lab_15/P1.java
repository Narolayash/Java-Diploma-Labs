package Lab_15;

// 1) Write a program in java to use of class, object and method. (A)
class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class P1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Rahul";

        s1.display();
    }
}
