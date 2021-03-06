/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ganesh
 */
 public class EagerSingleton {
	private static volatile EagerSingleton instance = null;

	// private constructor
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		if (instance == null) {
			synchronized (EagerSingleton.class) {
				// Double check
				if (instance == null) {
					instance = new EagerSingleton();
				}
			}
		}
		return instance;
	}
}