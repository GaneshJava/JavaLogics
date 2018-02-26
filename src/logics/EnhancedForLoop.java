/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author Ganesh
 */
class EnhancedForLoop {
  public static void main(String[] args) {
    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    getNumber(primes);
    //String names[] = {"ganesh","prasad"};
    
    for (int t: primes) {
      System.out.println(t); 
    }
  }
  
  public static void getNumber(int...i){
      
  }
}