package Lab_6;

import java.util.Scanner;

// 5) Write a program to check if given number is Odd or Even using the ternary operator. (B)
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

//        datatype variable = condition ? value1 : value2;

//        1)
//        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
//        System.out.println(result);

//        2)
        System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");
    }
}
