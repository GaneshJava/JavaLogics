/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.inherit;

import java.io.Serializable;

/**
 *
 * @author Ganesh
 */
public abstract class Class1 implements Interface1 {
    Class1(){
    
    }
       

    @Override
    public void method1() {
        System.out.println("Class1 - method 1..");
    }

    @Override
    public void method2() {
        System.out.println("Class1 - method 2..");
    }
    
    public void method3(){
        
    }
}
