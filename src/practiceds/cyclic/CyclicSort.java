/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceds.cyclic;

import java.util.Arrays;

/**
 *
 * @author dixit
 */
public class CyclicSort {

    public static void main(String[] args) {
//        int[] arr = {4, 2, 1, 3, 0};
        int[] arr = {4, 2, 1, 3};
//        cyclicSort(arr);
        cyclicSortPlusOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
    }
    
    static void cyclicSortPlusOne(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}
