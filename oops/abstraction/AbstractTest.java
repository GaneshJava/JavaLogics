/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Ganesh
 */
public class AbstractTest extends Test {

    int j = i;
   
    @Override
    void method1() {
        int k = i;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void method2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void method33() {
    }

    public static void main(String args[]) {
        System.out.println("in sub class - main..");
    }
}
