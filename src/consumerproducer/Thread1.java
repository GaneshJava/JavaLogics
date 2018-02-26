/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consumerproducer;

/**
 *
 * @author Ganesh
 */
import java.util.Random;
import java.util.Stack;

public class Thread1 implements Runnable {
    int result;
    Random rand = new Random();
    Stack<Integer> A = new Stack<>();

    public Thread1(Stack<Integer> A) {
        this.A = A;
    }

    public synchronized void produce()
    {
        while (A.size() >= 5) {
            System.out.println("List is Full");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result = rand.nextInt(10);

        System.out.println(result + " produced ");
        A.push(result);
        System.out.println(A);

        this.notify();
    }

    @Override
    public void run() {
        System.out.println("Producer get started");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            produce();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}