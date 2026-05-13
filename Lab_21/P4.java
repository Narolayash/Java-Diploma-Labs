package Lab_21;

// Yes ✅
//        this refers to current object, but static variables belong to class.
//They can be accessed using object (this) but recommended way → use class name.

class TestStatic {
    static int count = 50;   // static variable

    void show() {
        // Access using this keyword
        System.out.println("Access static variable using this: " + this.count);

        // Recommended way
        System.out.println("Access static variable using class name: " + TestStatic.count);
    }
}

public class P4 {
    public static void main(String[] args) {
        TestStatic obj = new TestStatic();
        obj.show();
    }
}
