package Problem_Statements_Basic_To_String;

//  Implement a following pattern
//* * * * * * *
//  *       *
//    *   *
//      *
//    *   *
//  *       *
//* * * * * * *

public class P29 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++) {
            for (int k=1; k<i; k++) {
                System.out.print("  ");
            }

            for (int j=1; j<=2*(n-i)+1; j++) {
                if (i == 1 || j == 1 || j == 2*(n-i)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i=n-1; i>0; i--) {
            for (int k=1; k<i; k++) {
                System.out.print("  ");
            }

            for (int j=1; j<=2*(n-i)+1; j++) {
                if (i == 1 || j == 1 || j == 2*(n-i)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
