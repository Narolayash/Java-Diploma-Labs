package Programs_asked_in_Companies_during_Technical_Rounds;

// 32 Print a Pyramid Star Pattern
//
//Write a program to print a pyramid pattern of stars (*) using a for loop.
// Input: 5
//Output:
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

public class P32 {
    public static void printPyramid() {
        for (int i=0; i<5; i++) {
            for (int k=5-1-i; k>0; k--) {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid();
    }
}
