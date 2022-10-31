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
class LLUsingArray {

    static int[] ll;

    int head = -1;

    LLUsingArray(int size) {
        ll = new int[size];
    }

    void add(int num) {
        head++;
        ll[head] = num;
    }
    
    void removeLast() {
        
    }
}

public class LinkedListSOlution {

}
