/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceds;
import java.util.Arrays;
/**
 *
 * @author dixit
 */
public class SortingSolutions {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void insertSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
