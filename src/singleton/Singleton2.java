/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ganesh
 */
public class Singleton2 {
  private static Singleton2 singleInstance = new Singleton2();
  private Singleton2() {}
  public static Singleton2 getSingleInstance() {
    return singleInstance;
  }
}
