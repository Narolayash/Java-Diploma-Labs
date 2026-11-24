package Problem_Statements_Basic_To_String;

// 31 WAP to enter an element at specific position into array. (Do not take a new array)

public class P31 {
    public static void addEleAtSpecificPosition(int[] arr, int ele) {
        addEleAtSpecificPosition(arr, ele, 0);
    }

    public static void addEleAtSpecificPosition(int[] arr, int ele, int position) {
        for (int i=arr.length - 2; i>=position; i--) {
            arr[i + 1] = arr[i];
        }

        arr[position] = ele;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        addEleAtSpecificPosition(arr, 5);
        addEleAtSpecificPosition(arr, 15);
        addEleAtSpecificPosition(arr, 25);
        addEleAtSpecificPosition(arr, 25, 7);

        for (int num : arr) {
            System.out.println(num);
        }

    }
}
