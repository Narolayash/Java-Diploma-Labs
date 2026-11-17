package Problem_Statements_Basic_To_String;

// 33 WAP to check weather number is present in array or not (using recursion only) and the
//function’s syntax is given be low
//Int isInArray(int a[],int m);
//Where int a[] is Array of integer and m is element to be searched.

public class P33 {
    public static boolean isInArray(int a[], int m, int i) {
        if (i >= a.length) return false;

        if (a[i] == m) return true;

        return isInArray(a, m, i+1);
    }

    public static void main(String[] args) {
        System.out.println(isInArray(new int[] {15, 2, 58, 52, 4, 2, 6}, 5, 0));
    }
}
