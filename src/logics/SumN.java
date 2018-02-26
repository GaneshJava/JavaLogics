/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
public class SumN {

    public static void main(String args[]) {
        int n, sum = 0;
        for (n = 1; n <= 100; n++) {
            sum += n;    //or sum=sum+n;
        }
        System.out.println(sum);
    }
}
