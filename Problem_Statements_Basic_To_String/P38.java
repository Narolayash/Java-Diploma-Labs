package Problem_Statements_Basic_To_String;

//38 Write a Function that returns either 1 or 0 based on following condition if the array is in
//ascending order and occurrence of that number at least 3 then it should return 1 otherwise
//it should return 0.

// e.g.
//if A=[1,1,1,2,2] it should return 0
//if A=[1,1,1,3,3,3,3] it should return 1
//if A=[2,2,2,1,1,1] it should return 0

public class P38 {
    public static boolean solution(int[] arr) {
        int count = 0;
        int currentNo = arr[0];

        for (int num : arr) {
            if (num != currentNo) {
                if (num < currentNo || count < 3) return false;
                currentNo = num;
                count = 0;
            }

            count++;
        }

        return count >= 3;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,2,2,1,1,1}));
    }
}
