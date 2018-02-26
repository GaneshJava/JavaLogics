/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganesh
 */
public class Test {
    
   static Thread t1 = new Thread(){
       @Override
       public synchronized void run(){
           for(int i=1; i<=10;){
               System.out.println(i);
               i = i+2;
           }
       }
   };
   
  static Thread t2 = new Thread(){
       @Override
       public synchronized void run(){
           for(int i=2; i<=10; ){
               System.out.println(i);
               i = i+2;
           }
       }
   };
   
   
   
  public void executeThreads(){
     t1.start();
     t2.start();
     try {
            t1.join();
            t2.join();
            System.out.println("Main thread exited");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  }
  
   public static void main(String args[]){
//       Test t = new Test();
        t1.start();
     t2.start();
     try {
            t1.join();
            t2.join();
            System.out.println("Main thread exited");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
   }
    
}
