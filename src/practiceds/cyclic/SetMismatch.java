package practiceds.cyclic;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        findMismatchNumber(arr);
    }

    static void findMismatchNumber(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != index + 1) {
                if (arr[arr[index]] != arr[index]) {
                    swap(arr, index, arr[index] - 1);
                } else {
                    System.out.println("Missing number is : " + (arr[index] + 1) + " and duplicate number is " + arr[index]);
                    index++;
                }
            } else {
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
