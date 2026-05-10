package Lab_5;

// 2) Write a program to demonstrates Narrowing type casting. (A)
public class P2 {
    public static void main(String[] args) {
        double d = 25.75;
        int num = (int) d;   // double → int (manual)

        System.out.println("Double value: " + d);
        System.out.println("Converted Integer value: " + num);
    }
}
