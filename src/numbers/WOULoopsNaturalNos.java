package numbers;
public class WOULoopsNaturalNos {
	 

	public static void main(String args[]) {
	    PrintNext(1);
	    
	}

	private static void PrintNext(int i) {
		// TODO Auto-generated method stub
		if (i <= 100) {
		       System.out.println(i + " ");
		        PrintNext(i + 1);
		    }
		
	}
	}
	