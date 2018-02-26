/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.util.Random;

/**
 *
 * @author Ganesh
 */
public class RandomNumbers {

    public static void main(String args[]) {
        Random r = new Random();
        for (int i = 1; i <= 1; i++) {
//        int randomNo = r.nextInt(9);
//            System.out.println("no-"+randomNo);
            int random = rand(1, 10);
            System.out.println(random);
        }
    }

    public static void printRandomNumbers() {
        int i = 1;
        int k = 100;
        int count = 10;
        int temp = 0;

        for (int val = 0; val <= count; val++) {
            if (temp >= 1 && temp <= 100) {
            }
        }
    }

    public static int rand(int n, int m) {
        if (n == m) {
            return (n);
        }
        int span = m - n + 1;
        double r = Math.random();
        int raw = (int) (r * span);
        int ret = n + raw;
        return (ret);
    }
}
