package numbers;


public class Fibonic {
	
	public static  void main(String args[]) {
		int N=10;
		int f0 = 0;
		int f1 = 1;
		
		
		 for(int i = 0; i<=N; i++){
			 System.out.println(computeF(i));
		 }
	
		}

	public static int computeF(int n)
	{
	    if(n==0)
	    {
	        return 0;
	        
	    }
	    else if(n==1)
	    {
	        return 1;
	    }
	    else
	    {
	      return computeF(n-1)+computeF(n-2); 
	    }

	}


	
}
