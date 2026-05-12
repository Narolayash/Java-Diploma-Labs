package Lab_13;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] mul = new int[3][3];

        System.out.println("Enter Matrix A:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                mul[i][j] = 0;
                for(int k=0;k<3;k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication Result:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(mul[i][j] + " ");
            System.out.println();
        }
    }
}
