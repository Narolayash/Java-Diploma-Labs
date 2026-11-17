package Programs_asked_in_Companies_during_Technical_Rounds;

// 2 Find Maximum, Second Maximum, Minimum, and Second Minimum from an Array
//
// This program takes an array of integers as input and identifies:
// • the Maximum element,
// • the Second Maximum element,
// • the Minimum element, and
// • the Second Minimum element.
// The array must contain at least four distinct elements to determine all four values correctly.
//
// Input: Array = [10, 5, 20, 8, 15]
// Output: Maximum = 20
//          Second Maximum = 15
//          Minimum = 5
//          Second Minimum = 8
//
// Input: Array = [3, 7, 1, 9, 4]
// Output: Maximum = 9
//          Second Maximum = 7
//          Minimum = 1
//          Second Minimum = 3

public class P2 {
    private static void solution(int[] arr) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            }
            else if (num > secMax && num != max)
                secMax = num;


            if (num < min) {
                secMin = min;
                min = num;
            }
            else if (num < secMin && num !=  min)
                secMin = num;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secMax);
        System.out.println("Minimum = " + min);
        System.out.println("Second Minimum = " + secMin);
    }

    public static void main(String[] args) {
        solution(new int[] {3, 7, 1, 9, 4});
    }
}
