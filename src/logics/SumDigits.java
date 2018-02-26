/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
import java.util.*;
class SumDigits
{
	public static void main(String args[])
	{		
		int n=0, res=0,  n2=0, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter No.: ");
		n=scan.nextInt();
		while(n>0)
		{
			res=n%10;
			n=n/10;
			sum+=res;	//sum=sum+res;
		}
		System.out.println("sum of No: " + sum);
	}
}
      