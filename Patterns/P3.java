package Patterns;

public class P3 {
    public static void main(String[] args) {
        int n = 5;

        int temp = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                temp = (temp == 1) ? 0 : 1;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
