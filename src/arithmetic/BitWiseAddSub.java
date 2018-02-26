package arithmetic;

public class BitWiseAddSub {
	
	static void add(int x, int y)
	{
	int tmp;
	if(y==0)
	{
	System.out.println("Addition Result: "+x);
	System.exit(0);
	}
	tmp = x^y;
	y = (x&y)<<1;
	x = tmp;
	add(x,y);
	}

	public static void main(String args[]){
		int a=20,b=10;
		add(a,b);
		
	}
	
}
