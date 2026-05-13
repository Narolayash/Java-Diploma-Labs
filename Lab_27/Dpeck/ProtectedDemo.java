package Lab_27.Dpeck;

import Lab_27.Bpack.B;
import Lab_27.Cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.displayB();
        c.displayC();
    }
}
