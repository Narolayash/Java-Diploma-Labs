package Lab_24;

class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class P4 {
    public static void main(String[] args) {

        // Employee object
        Employee e = new Employee();
        e.name = "Rahul";
        e.age = 25;
        e.phone = "9876543210";
        e.address = "Ahmedabad";
        e.salary = 30000;
        e.specialization = "Software Developer";

        // Manager object
        Manager m = new Manager();
        m.name = "Priya";
        m.age = 35;
        m.phone = "9999999999";
        m.address = "Surat";
        m.salary = 60000;
        m.department = "IT";

        System.out.println("---- Employee Details ----");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone: " + e.phone);
        System.out.println("Address: " + e.address);
        System.out.println("Specialization: " + e.specialization);
        e.printSalary();

        System.out.println("\n---- Manager Details ----");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone: " + m.phone);
        System.out.println("Address: " + m.address);
        System.out.println("Department: " + m.department);
        m.printSalary();
    }
}
