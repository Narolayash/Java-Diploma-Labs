package Problem_Statements_Basic_To_String;

// 54 WAP to find whether string is palindrome or not.

public class P54 {
    public static boolean palindrome(String s1) {
        int len = s1.length();
        s1 = s1.toLowerCase();

        for (int i=0; i<=len/2; i++) {
            if (s1.charAt(i) != s1.charAt(len - i - 1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Yash";
        String str2 = "Naman";

        System.out.println(palindrome(str1));
        System.out.println(palindrome(str2));
    }
}
