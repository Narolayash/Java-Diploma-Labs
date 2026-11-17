package Problem_Statements_Basic_To_String;

//44 WAP to sort an Array using insertion sort.
public class P44 {
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 7, 6, 9};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
