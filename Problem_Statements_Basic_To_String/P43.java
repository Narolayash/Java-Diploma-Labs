package Problem_Statements_Basic_To_String;

// 43 WAP to sort an Array using Bubble sort.
public class P43 {
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            boolean flag = false;
            for (int j=1; j<n-i; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    flag = true;
                }
            }

            if (!flag) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 7, 6, 9};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
