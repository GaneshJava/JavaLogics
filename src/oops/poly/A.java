/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.poly;

/**
 *
 * @author Ganesh
 */
public class A implements I{
    static int i=10;
    
    public void method1(){
        System.out.println("Class A-Method1");
    }
     public void method2(){
        System.out.println("Class A-Method2");
    }
     public void method3(int v1){
        System.out.println("Class A Method3-with int"+v1);
      
    }
     public static void method4(){
         System.out.println("class A Method4");
         
     }
    
}
