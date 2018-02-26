/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author Ganesh
 */
public class TestTry {

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3};
        try {
            System.out.println("in try");
            int first = numbers[0];
            int last = numbers[4];
        } catch (Exception e) {
            System.out.println("Exception-" + e);
        } finally {
            int l = numbers[5];
            System.out.println("in finally last");
        }

    }
}
