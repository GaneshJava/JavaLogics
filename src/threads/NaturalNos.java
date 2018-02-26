/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganesh
 */
public class NaturalNos {

    public static void main(String args[]) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i=i+2) {
                    System.out.println(i);
                    
                }
            }
        };
       
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 2; i <= 10; i=i+2) {
                    System.out.println(i);
                   
                }
            }
        };
        
        t1.start();
        t1.yield();
        t2.start();
        
    }
}
