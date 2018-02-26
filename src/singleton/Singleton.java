/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ganesh
 */
public class Singleton {
  private static Singleton singleInstance;
    private Singleton() {}
  public static Singleton getSingleInstance() {
      synchronized (Singleton.class) {
        if (singleInstance == null) {
          singleInstance = new Singleton();
        }
      }
    return singleInstance;
  }
}