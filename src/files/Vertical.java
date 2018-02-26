package files;

import java.io.*;
class Vertical
{
     public static void main(String sachin[])
     {
         int i,j=0,max,var,arr[];
         max=var=0;
         Console con = System.console();
         arr = new int [10];
        for(i=0;i<arr.length;i++)
        {
         arr[i]= Integer.parseInt("ganeshs", 10);    
        }
        max=arr[0];
        for(i=0;i<arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
        var=max;
        for(i=0;i<var;i++)
        {
            for(j=0;j < arr.length ;j++)
                if(arr[j]<max)
                    System.out.print(" ");
                else
                    System.out.print("#");
            max--;
            System.out.println();
        }
     }
}


