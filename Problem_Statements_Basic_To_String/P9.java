package Problem_Statements_Basic_To_String;

// WAP to find a power a^b (without using power and multiplication operation)
public class P9 {
    private static long findPower(int num, int p) {
        long power = 1;

        for (int i=0; i<p; i++) {
            int temp = 0;
            for (int j=0; j<num; j++) temp += power;
            power = temp;
        }

        return power;
    }

    public static void main(String[] args) {
        System.out.println(findPower(5, 3));
    }
}
