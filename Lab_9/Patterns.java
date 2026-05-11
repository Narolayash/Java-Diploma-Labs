package Lab_9;

public class Patterns {
    public static void main(String[] args) {
        // 1)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2)
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++) {
            int k=1;
            for(int j=1;j<=5-i+1;j++){
                System.out.print(k++);
            }
            System.out.println();
        }

        // 3)
        int num = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = (num==1)?0:1;
            }
            System.out.println();
        }

        // 4)
        int num1=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
        }

        // 5)
        for(int i=1;i<=5;i++){
            for (int k=1; k<=5-i; k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // 6)
        for(int i=5;i>=1;i--){
            for (int k=1; k<=5-i; k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
