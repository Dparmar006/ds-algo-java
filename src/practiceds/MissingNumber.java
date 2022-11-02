package practiceds;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
    int[] arr = {3,0,1};
    cyclicSort(arr);
    }

    static void cyclicSort(int[] arr) {
    int index = 0;
        while(index < arr.length){
            if(arr[index] < arr.length && arr[index] != index){
                swap(arr, index, arr[index]);
            } else {
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                System.out.println("Missing number is : " + i);
            }
        }
    }


    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
