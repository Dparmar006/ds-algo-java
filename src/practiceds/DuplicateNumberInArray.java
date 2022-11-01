/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceds;

/**
 *
 * @author dixit
 */
public class DuplicateNumberInArray {

    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1, 4};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            if (nums[index] == index) {
                index++;
            } else {
                if (nums[nums[index]] != nums[index]) {
                    swap(nums, index, nums[index]);
                } else {
                    return nums[index];
                }
            }
        }
        
        return -1;
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
