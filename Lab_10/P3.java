package Lab_10;

// 3) Write a program to print numbers from 1 to 10, but skip 5 and 8 using continue. (A)
public class P3 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5 || i==8)
                continue;
            System.out.print(i+" ");
        }
    }
}
