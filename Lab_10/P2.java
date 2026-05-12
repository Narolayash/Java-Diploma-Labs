package Lab_10;

// 2) Write a program to print numbers from 1 to 10, but skip 5 using continue. (A)
public class P2 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5)
                continue;
            System.out.print(i+" ");
        }
    }
}
