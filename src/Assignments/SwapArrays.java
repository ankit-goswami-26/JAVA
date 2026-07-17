package Assignments;

import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        swap(arr, 0, 4);

        System.out.print(Arrays.toString(arr));
    }
    static void swap (int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
}
