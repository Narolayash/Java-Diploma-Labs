package Lab_27.pack2;

import Lab_27.pack1.A;

public class B extends A {
    public void show() {
        System.out.println("Accessing in subclass from another package");

//         System.out.println(privateVar); Not allowed
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
//         System.out.println(defaultVar);  Not allowed
    }
}
