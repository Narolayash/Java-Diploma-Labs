package Lab_7;

import java.util.Scanner;

// 1) Write a program to check whether a letter is a vowel or consonants. (A)
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
