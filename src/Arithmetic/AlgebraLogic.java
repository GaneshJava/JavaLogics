package Arithmetic;
import Arithmetic.ExampleClass;

public class AlgebraLogic {
	
	public static void main(String args[]) {
		
		int a = 20;
		int b = 10;
		int sum = 0;
		int sub = 0;
		ExampleClass.sampleMethod();
		System.out.println("in main method");
		sum = sum(a,b);
		System.out.println("Addition:"+sum);
		sub = sub(a,b);
		System.out.println("Subtraction:"+sub);
		
	}
private static int sum(int a, int b){
	int c = 0;
	c = a - ~b -1;
	return c;
}

private static int sub(int a,int b){
	int c = 0;
	c = a + ~b +1;
	return c;
}

}
