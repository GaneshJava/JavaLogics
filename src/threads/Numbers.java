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
public class Numbers {

    public static void main(String args[]) {
        Thread t1 = new Thread(new OddNos());
        Thread t2 = new Thread(new EvenNos());

        t1.start();
        t2.start();
    }
}

class OddNos implements Runnable {

    @Override
    public void run() {
        synchronized (LockObject.lock) {
            for (int i = 1; i <= 10; i = i + 2) {
                System.out.println(i);
                LockObject.lock.notify();
                try {
                    LockObject.lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(OddNos.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            LockObject.lock.notify();
        }

    }
}

class EvenNos implements Runnable {

    @Override
    public void run() {
        synchronized (LockObject.lock) {
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.println(i);
                LockObject.lock.notify();
                try {
                    LockObject.lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(OddNos.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            LockObject.lock.notify();
        }
    }
}

class LockObject {
    final static Object lock = new Object();
}