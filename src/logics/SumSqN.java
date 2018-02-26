/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
class SumSqN
{
	public static void main(String args[])
	{		
		int n, sum=0;
		for(n=1;n<=10;n++)
		{
			sum+=n*n;   //or sum=sum+n;*n
		}
		System.out.println(sum);
	}
}
  