/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consumerproducer;

/**
 *
 * @author Ganesh
 */
import java.util.Stack;

public class Thread2 implements Runnable {
    Stack<Integer> A = new Stack<>();

    public Thread2(Stack<Integer> A) {
        this.A = A;
    }

    public synchronized void consume() {
        while (A.isEmpty()) {
            System.err.println("List is empty" + A + A.size());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println(A.pop() + " Consumed " + A);
        this.notify();
    }

    @Override
    public void run() {
        System.out.println("New consumer get started");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            consume();
        }
    }
}