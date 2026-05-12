package Lab_10;

// 1) Write a program to print numbers from 1 to 10, but stop when it reaches 5 using break.(A)
public class P1 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5)
                break;
            System.out.print(i+" ");
        }
    }
}
