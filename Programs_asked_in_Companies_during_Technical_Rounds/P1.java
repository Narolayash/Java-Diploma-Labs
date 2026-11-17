package Programs_asked_in_Companies_during_Technical_Rounds;

//1 Dominant Number in an Array
//
// A dominant number is a number whose frequency of occurrence in an array is strictly
// greater than the count of unique elements present in that array. You are given an integer array. Your task is to
// identify and return all dominant numbers from the array.
//
// Input: arr = [1, 2, 3, 1, 1, 4, 5, 1, 1, 1]
// Output: [1]
//
// Input: arr = {1, 1, 1, 2, 2, 2, 3}
// Output: [1, 2]

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1 {
    private static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int size = map.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= size) {
                list.add(entry.getKey());
            }
        }

        int[] ansArr = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            ansArr[i] = list.get(i);
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
