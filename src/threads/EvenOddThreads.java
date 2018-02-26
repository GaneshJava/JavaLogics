/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Ganesh
 */
public class EvenOddThreads {

    public static void main(String[] args) {
        Thread odd = new Thread(new OddThread(), "oddThread");

        Thread even = new Thread(new EvenThread(), "Even Thread");


        odd.start();
        even.start();

        try {
            odd.join();
            even.join();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class OddThread implements Runnable {

    @Override
    public void run() {
        synchronized (CommonUtil.mLock) {
//            System.out.println(Thread.currentThread().getName()+"---> job starting");
            int i = 1;
            while (i <= 10) {
                System.out.println(i);
                i = i + 2;
                CommonUtil.mLock.notify();
                try {
                    CommonUtil.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println("OddThread---> job completed");
            CommonUtil.mLock.notify();

        }
    }
}

class EvenThread implements Runnable {

    @Override
    public void run() {
        synchronized (CommonUtil.mLock) {
//            System.out.println(Thread.currentThread().getName()+"---> job started");
            int i = 2;
            while (i <= 10) {
                System.out.println(i);
                i = i + 2;
                CommonUtil.mLock.notify();
                try {
                    CommonUtil.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println("EvenThread---> job completed");
            CommonUtil.mLock.notify();
        }
    }
}

class CommonUtil {

    static final Object mLock = new Object();
}