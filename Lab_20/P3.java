package Lab_20;

class Employee {
    int id;
    String name;

    // Parameterized Constructor
    Employee(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor
    Employee(Employee e) {
        id = e.id;
        name = e.name;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class P3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit");
        Employee e2 = new Employee(e1);

        e1.display();
        e2.display();
    }
}
