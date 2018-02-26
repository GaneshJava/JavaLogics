package arithmetic;


public class AlgebraLogic {
	
	public static void main(String args[]) {
		
		int a = 20;
		int b = 10;
		int sum = 0;
		int sub = 0;
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
