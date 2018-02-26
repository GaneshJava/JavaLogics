package numbers;

public class SimpleRandomNumbers {
	
	public static void main(String args[]){
		
		for(int i = 0;i<=50; i++){
		int n = (int)( 1+100*Math.random()); 
		System.out.println("n"+i+":"+n);
		
		}
		
	}

}
