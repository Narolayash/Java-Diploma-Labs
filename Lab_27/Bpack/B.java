package Lab_27.Bpack;

import Lab_27.Apack.A;

public class B extends A {
    public void displayB() {
        System.out.println("Class B accessing A:");
        System.out.println("Protected x = " + x);
        System.out.println("Public z = " + z);
    }
}
