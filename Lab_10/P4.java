package Lab_10;

// 4) Write a program to Stop a loop when number is divisible by 7. (B)
public class P4 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println("Stopped at: "+i);
                break;
            }
            System.out.print(i+" ");
        }
    }
}
