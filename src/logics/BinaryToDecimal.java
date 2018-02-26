/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
public class BinaryToDecimal {

    public static void main(String args[]) {
        String str = "1010";
        int i = Integer.parseInt(str, 2);
        System.out.println("Decimal :" + i);
        
        String s = Integer.toBinaryString(10);
        System.out.println("Binary String:-"+s);
        
//        System.out.println("Decimal :" + getDecimal(str));
        byte a=5;
        byte b=2;
        byte c = (byte) (a/b);
        
       // System.out.println("byte-"+c);
    }

    private static int getDecimal(String str) {
        double j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                j = j + Math.pow(2, str.length() - 1 - i);
            }

        }
        return (int) j;
    }

    private static int getBinary(int num) {
        int temp = 0;
        int place = 1;
        int output = 0;

        while (num != 0) {
            temp = num % 2;
            num = num / 2;

            output += (place * temp);
            place *= 10;
        }

        return output;
    }
}
