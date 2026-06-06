package Lab_17;

// 1) Write a program to demonstrate the built-in function of String class. (e.g. length(),
//charAt(), concat(), indexOf(), equals(), valueOf(), toString (), trim(), substring()) (A)
public class P1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println("Length: " + str1.length());
        System.out.println("charAt(1): " + str1.charAt(1));
        System.out.println("Concat: " + str1.concat(" " + str2));
        System.out.println("indexOf 'l': " + str1.indexOf('l'));
        System.out.println("Equals: " + str1.equals(str2));

        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("valueOf: " + numStr);

        System.out.println("toString: " + str1);
        System.out.println("toString: " + str1.toString());
        System.out.println("substring(1,4): " + str1.substring(1,4));
    }
}
