/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author Ganesh
 */
public class LCM {
    
    public static void main(String args[]){
        long l=lcm(2,17);
        System.out.println("LCM-"+l);
    }
    
private static long gcd(long a, long b)
{
    while (b > 0)
    {
        long temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    System.out.println("GCD-"+a);
    return a;
}

private static long gcd(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
    return result;
}  

private static long lcm(long a, long b)
{
    return a * (b / gcd(a, b));
}

private static long lcm(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
    return result;
}
}
