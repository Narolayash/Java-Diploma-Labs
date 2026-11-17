package Problem_Statements_Basic_To_String;

// 45 WAP to sort an Array using Selection sort.
public class P45 {
    private static void selectionSort(int[] arr)  {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 7, 6, 9};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
