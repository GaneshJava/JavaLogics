package arithmetic;


public class Addtion {
 public static void main(String args[]){
	 
	 int a=-10;
	 int b=0;
	 
	 System.out.println(add(a,b));
	 
 }
 static int add(int a, int b){
	 if (a==0){
		 return b;
	 }
	 else{
//		 System.out.println((a & b) << 1);
//	 	System.out.println(a ^ b);
	 return add((a & b) << 1, a ^ b);
	 }
	
}
}