package Lab_5;

// 3) Write a program that prints each argument passed from the command line. (A)
public class P3 {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments are:");

        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }
}
