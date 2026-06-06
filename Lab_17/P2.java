package Lab_17;

// 2) Write a program to use of StringBuffer class methods. ( e.g.
//append(), insert(), delete(), reverse(), charAt(), capacity(), toString() and replace()). (А)
public class P2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        System.out.println("Append: " + sb);

        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        sb.delete(5, 11);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("first character: " + sb.charAt(0));

        sb.replace(0, 1, "Y");
        System.out.println("after replace: " + sb);

        // Default capacity = 16 characters
        // capacity() returns total storage allocated to StringBuffer, not current size.
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("toString: " + sb.toString());
    }
}
