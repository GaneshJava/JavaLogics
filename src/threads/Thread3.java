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
public class Thread3 extends Thread {

    public static void main(String args[]) {
        // Thread3 t = new Thread3();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        for (int i = 1; i <= 10; i++) {
            t1.start();
            t2.start();
            try{
            t1.join();
            t2.join();
            }catch(Exception ex){
                
            }
        }

    }
}
