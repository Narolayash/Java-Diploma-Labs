package Lab_5;

// 4) Write a program to find maximum number from two number using command line
//argument. (B)
public class P4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a > b)
            System.out.println("Maximum number is: " + a);
        else
            System.out.println("Maximum number is: " + b);
    }
}
