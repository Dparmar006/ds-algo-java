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
public class PracticeDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] ans = insertSort(arr);
        System.out.println("Sorted array : " + Arrays.toString(ans));
    }

    static int[] insertSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    continue;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
}
