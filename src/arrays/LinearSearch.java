package arrays;

public class LinearSearch {
	
	public static void main(String[] args) {
		String[] arr = {"1","2","3","4"};
		System.out.println(arr.length);
		linearsearch(arr);
	}

	public static void linearsearch(String[] arr)
	   {
	      // Validate command line arguments count.
		System.out.println(arr.length);
	      /*if (arr.length != 2)
	      {
	         System.err.println("usage: java LinearSearch integers integer");
	         return;
	      }*/

	      // Read integers from first command-line argument. Return if integers 
	      // could not be read.

	      int[] ints = readIntegers(arr[0]);
	      if (ints == null)
	         return;

	      // Read search integer; NumberFormatException is thrown if the integer
	      // isn't valid.

	      int srchint = Integer.parseInt(arr[1]);

	      // Perform the search and output the result.

	      System.out.println(srchint + (search(ints, srchint) ? " found"
	                                                          : " not found"));
	   }

	   private static int[] readIntegers(String s)
	   {
	      String[] tokens = s.split(",");
	      int[] integers = new int[tokens.length];
	      for (int i = 0; i < tokens.length; i++)
	         integers[i] = Integer.parseInt(tokens[i]);
	      return integers;
	   }

	   private static boolean search(int[] x, int srchint)
	   {
	      for (int i = 0; i < x.length; i++)
	         if (srchint == x[i])
	            return true;

	      return false;
	   }
}
