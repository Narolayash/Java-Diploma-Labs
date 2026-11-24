package Programs_asked_in_Companies_during_Technical_Rounds;

// 7 Simqual String Problem
//
//Two strings are called Simqual strings if they satisfy the following conditions:
//1. Both strings must have the same length
//2. Both strings must contain the same characters
//3. The frequency of each character must be equal in both strings
//4. Order of characters does not matter
//The program should check whether the given two strings are Simqual or Not Simqual.
//
// Input: String 1 = "listen"
//            String 2 = "silent"
//Output: Strings are Simqual
//

//Input: String 1 = "hello"
//             String 2 = "world"
// Output: Strings are NOT Simqual

import java.util.HashMap;

public class P7 {
//    public static boolean isSimqual(String s1, String s2) {
//        int n1 = s1.length();
//        int n2 = s2.length();
//
//        if (n1 != n2) return false;
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char ch : s1.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : s2.toCharArray()) {
//            if(!map.containsKey(ch)) return false;
//
//            if (map.getOrDefault(ch, 0) <= 0) return false;
//
//            map.put(ch, map.get(ch) - 1);
//        }
//
//        return true;
//    }

    public static boolean isSimqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];

        for (int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i : freq) {
            if (i != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSimqual("listen", "silent"));
        System.out.println(isSimqual("hello", "world"));
    }
}
