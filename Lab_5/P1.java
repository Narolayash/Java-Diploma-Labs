package Lab_5;

// 1) Write a program to demonstrates Widening type casting. (A)
public class P1 {
    public static void main(String[] args) {
        int num = 25;
        double d = num;   // int → double (automatic)

        System.out.println("Integer value: " + num);
        System.out.println("Converted Double value: " + d);
    }
}
