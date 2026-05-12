package Lab_19;

public class P1 {
    public static void main(String[] args) {

        // Autoboxing (int → Integer)
        int a = 10;
        Integer obj = a;

        System.out.println("Autoboxing:");
        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + obj);

        // Unboxing (Integer → int)
        Integer num = 50;
        int b = num;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper object: " + num);
        System.out.println("Primitive value: " + b);
    }
}
