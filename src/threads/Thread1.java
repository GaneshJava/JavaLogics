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
public class Thread1 extends Thread {

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
            try{
               wait(); 
               notifyAll();
            }catch(InterruptedException ex){
                
            }
           
        }
    }
}
