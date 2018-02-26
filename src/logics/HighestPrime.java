/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class HighestPrime 
{
     public static void main(String args[])
   {
      int status = 1, num = 1000000000;
 
      for ( int count = 2 ; ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.println(num);
            count++;
         }
         status = 1;
         num++;
      }         
   }
}