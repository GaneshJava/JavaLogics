/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
public class SecoundHighest {

    public static void main(String args[]) {
        int[] nos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int h = secondHighest(nos);
        System.out.println("2nd Highest:-" + h);
    }

    static int secondHighest(int... nums) {
//        System.out.println("min-"+ Integer.MIN_VALUE);
//        System.out.println("max-"+Integer.MAX_VALUE);
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }
    
    
}
