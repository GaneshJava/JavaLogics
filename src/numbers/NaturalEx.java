package numbers;

public class NaturalEx {

	public static void main(String[] args)
    {
		try {
			Numbers(new int[101], 1);
			}
	    catch (Exception e) { 
	    	
	    }
	
    }

	static void Numbers(int[] array, int n)
	{
	    System.out.println(array[n] = n);
	    Numbers(array, n + 1);
	}
	
}