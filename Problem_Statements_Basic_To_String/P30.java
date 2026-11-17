package Problem_Statements_Basic_To_String;
// 30 WAP to find a sum of even number into 1D array.
public class P30 {
    public static int solution(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if ((num / 2) * 2 == num)
                sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {12, 56, 8, 5, 2, 14, 74}));
    }
}
