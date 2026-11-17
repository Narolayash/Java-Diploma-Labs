package Programs_asked_in_Companies_during_Technical_Rounds;

// 40 Find the difference between the second largest element and the second smallest element of an array.
// Input: Enter the size of array: 7
//Enter 7 elements: 5 1 9 7 1 5 3
//Output: Difference: 4

public class P40 {
    public static int solutions(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num != max)
                secondMax = num;

            if (num < min) {
                secondMin = min;
                min = num;
            }
            else if (num < secondMin && num != min)
                secondMin = num;
        }

        return secondMax - secondMin;
    }

    public static void main(String[] args) {
        System.out.println(solutions(new int[] {5, 1, 9, 7, 1, 5, 3}));
    }
}
