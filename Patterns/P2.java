package Patterns;

public class P2 {
    public static void main(String[] args) {
        int n = 5;

//        for (int i=1; i<=n; i++) {
//            for (int k=n-i; k>0; k--) {
//                System.out.print(" ");
//            }
//
//            int init = 0;
//            for (int j=1; j<=2*i-1; j++) {
//                if (j > i)
//                    System.out.print(--init);
//                else
//                    System.out.print(++init);
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }

            for (int j=i-1; j>=1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
