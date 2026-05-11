package Lab_8;

// 1) Write a program to print numbers from 1 to 10 using a for, while and do...while loop. (A)
public class P1 {
    public static void main(String[] args) {

        // for loop
        System.out.println("Using for loop:");
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");

        // while loop
        System.out.println("\nUsing while loop:");
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }

        // do while loop
        System.out.println("\nUsing do-while loop:");
        i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);
    }
}
