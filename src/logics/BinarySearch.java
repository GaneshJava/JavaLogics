/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */


import java.util.Scanner;
 
class BinarySearch 
{
  public static void main(String args[])
  {
    int c, first, last, middle, n, search;
    //dynamic array
    
   /* Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int array[];
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();*/
 
    //static array
    int array[] = {1,2,3,4,5,6,7,8,9,10};
    Scanner in = new Scanner(System.in);
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    first  = 0;
    last   = array.length - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}