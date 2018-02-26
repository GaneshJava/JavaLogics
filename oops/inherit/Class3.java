/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.inherit;

/**
 *
 * @author Ganesh
 */
public class Class3 extends Class2{

    public static void main(String args[]){
        Class3 c3 = new Class3();
        c3.method1();
        c3.method2();
        
        Class1 c1 = new Class3();
        c1.method1();
        c1.method2();
        
        Class2 c2 = new Class3(); 
        c2.method1();
        
        Interface1 i1 = new Class2();
        i1.method1();
        i1.method2();
        
        Class2 obj1 = new Class2();
        Class3 obj2 = new Class3();
        
        obj1 = obj2;
        obj2 =  (Class3)obj1;
        
        Object o = new Object();
        String s = new String();
        
        o=s;
        s=(String) o;
        
        
    }
    
}
