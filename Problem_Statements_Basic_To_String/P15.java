package Problem_Statements_Basic_To_String;

//WAP for following Scenario.
// Given n rupees and a chocolate price of m for each chocolate,
// with a wrapper exchange offer of 1 chocolate per k wrappers,
// calculate the total number of chocolates you can eat with n rupees.
public class P15 {
    private static int eatChocolates(int n, int m, int k) {
        int initChocolate = n / m;
        int totalNoChocolates = initChocolate;
        int wapper = initChocolate;

        while (wapper >= k) {
            totalNoChocolates += wapper / k;

            wapper = (wapper / k) + (wapper % k);
        }

        return totalNoChocolates;
    }

    public static void main(String[] args) {
        System.out.println(eatChocolates(15, 2, 3));
    }
}
