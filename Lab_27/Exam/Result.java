package Lab_27.Exam;

import Lab_27.Student.Student;

public class Result extends Student {
    public int m1, m2, m3;

    public void getMarks(int a, int b, int c) {
        m1 = a; m2 = b; m3 = c;
    }

    public void display() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;

        System.out.println("\n--- Marksheet ---");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);
    }
}
