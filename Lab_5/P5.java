package Lab_5;

// 5) Write a program to accept integers as an argument, add them and print the sum. (C)
public class P5 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
