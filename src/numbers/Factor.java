/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author Ganesh
 */
public class Factor {
public static void main(String args[])    {
    int f = 120;
int i = 1;

   while(i <= f) {

       if(f % i == 0){

           System.out.println(i + " is a factor");

       }

   i++;

   }
}
}
