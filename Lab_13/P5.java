package Lab_13;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of matches: ");
        int matches = sc.nextInt();

        int[][] score = new int[players][matches];
        int total;

        for(int i=0;i<players;i++){
            System.out.println("Enter scores of Player " + (i+1));
            for(int j=0;j<matches;j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Score Card ---");
        for(int i=0;i<players;i++){
            total = 0;
            System.out.print("Player " + (i+1) + " : ");
            for(int j=0;j<matches;j++){
                System.out.print(score[i][j] + " ");
                total += score[i][j];
            }
            System.out.println(" | Total = " + total);
        }
    }
}
