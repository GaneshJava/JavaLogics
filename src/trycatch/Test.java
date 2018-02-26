/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author Ganesh
 */
public class Test {
    public static void main(String args[]){
       
        Test t = new Test();
        try{
        t.getRuntimeException(4);
        }catch(Exception e){
            System.out.println("Exception:-"+e);
        }
    }
    
    public int getRuntimeException(int n){
        int[] array = {1,2,3};
        int no= array[n];
        System.out.println("no-"+no);
        return no;
    }
    
    
}
