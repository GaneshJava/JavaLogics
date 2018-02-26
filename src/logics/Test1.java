/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.util.Stack;

/**
 *
 * @author Ganesh
 */
public class Test1 {

    public Test1() {
        System.out.println("in constructor..");
    }

    static {
        System.out.println("in static");
    }

    public int recurciveMethod(int i) {
        return recurciveMethod(i++);

    }

    public static void main(String args[]) {
        Stack s;
        Test1 t = new Test1();
        Integer i = 1;
        i.longValue();
        System.out.println("number-" + t.recurciveMethod(1));

    }
}
