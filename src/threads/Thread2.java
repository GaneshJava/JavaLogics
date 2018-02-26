/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Ganesh
 */
public class Thread2 extends Thread {

    @Override
    public synchronized void run() {
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
              try{
               wait(); 
               notifyAll();
            }catch(InterruptedException ex){
                
            }
        }
    }
}
