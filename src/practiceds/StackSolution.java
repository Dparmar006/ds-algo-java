/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceds;
import java.util.Iterator;
import java.util.Stack;
/**
 *
 * @author dixit
 */
public class StackSolution {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(3);
        s1.push(2);
        Iterator it = s1.iterator();
        
        while(it.hasNext()){
            Object obj = it.next();
            System.out.print(obj + " ");
        }
        
        s1.sort(null);
        
        System.out.println(s1);
        
        
    }
}
