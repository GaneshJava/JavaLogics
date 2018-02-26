/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.poly;

/**
 *
 * @author Ganesh
 */
public class C extends B{
    
    @Override
    public void method1(){
        System.out.println("Class C-Method1");
    }
    
    public static void method4(){
        System.out.println("Class C-Method4");
    }
    
    public static void main(String args[]){
        C c = new C();
        c.method1();
        c.method2();
        c.method3("in C");
        c.method3(3);
        c.method4();
        
        System.out.println("------------------");
        B b = new C();
        b.method1();
        b.method2();
        b.method3("in C");
        b.method3(3);
    }
}
