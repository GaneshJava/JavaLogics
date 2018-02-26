/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consumerproducer;

import java.util.Stack;

/**
 *
 * @author Ganesh
 */
public class MainClass {
public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Thread1 thread1 = new Thread1(stack);// p
        Thread2 thread2 = new Thread2(stack);// c
        Thread A = new Thread(thread1);
        Thread B = new Thread(thread2);
        Thread C = new Thread(thread2);
        A.start();

        B.start();
        C.start();     
    }    
}
