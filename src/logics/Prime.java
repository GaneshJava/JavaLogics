/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
//Note: Scanner class work with JDK1.5 or above
import java.util.*;
class Prime
{
	public static void main(String args[])
	{		
		int n, i, res;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=2;i<=n/4;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}
}
      