/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
public class Fibonacci
{
	public static void main(String args[])
	{		
		int prev=0, next=1, sum=0;
		for(int n=1;n<=10;n++)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}
      