/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.concurrent.ExecutorService;

/**
 *
 * @author Ganesh
 */
public class CloneTest implements Cloneable
{
    public void method1() {
        System.out.println("Method1..");
    }

    public static void main(String agrs[]) throws CloneNotSupportedException {
        CloneClass obj = new CloneClass();
        CloneClass obj2 =  new CloneClass();
       
        String s1 = new String("Ganesh");
        String s2 = new String("Ganesh");
        
        if(s1==s2){
            System.out.println("strings r equals");
        }
        if(s1.equals(s2)){
            System.out.println("strings r equals in equals method..");
        }
        if (obj == obj2) {
            System.out.println("obj==obj2 is true");
        }

        if (obj.equals(obj2)) {
            System.out.println("obj equals obj2 true");
        }
    }
}
