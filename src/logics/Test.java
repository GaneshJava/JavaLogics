/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Ganesh
 */
public class Test {

    Test() {
        System.out.println("in constr");
    }

    {
        System.out.println("in block 1");
    }

//    {
//        block1:
//        {
//            System.out.println("in side block1");
//            block2:{
//                System.out.println("in side block2");
//            }
//        }
//    }

    static {
        System.out.println("static block..");
    }

    public static void main(String args[]) {
        new Test();
       // new Test();
    }
}
