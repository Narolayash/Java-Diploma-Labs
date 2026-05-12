package Lab_19;

class Outer {
    int outerVar = 100;

    class Inner {
        void display() {
            System.out.println("Outer variable accessed from Inner class: " + outerVar);
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner innerObj = obj.new Inner();
        innerObj.display();

//        Outer.Inner innerObj = new Outer().new Inner();
//        innerObj.display();
    }
}
