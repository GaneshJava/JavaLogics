/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.Serializable;

/**
 *
 * @author Ganesh
 */
public class DemoSingleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private DemoSingleton() {
		// private constructor
	}

	private static class DemoSingletonHolder {
		public static final DemoSingleton INSTANCE = new DemoSingleton();
	}

	public static DemoSingleton getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}