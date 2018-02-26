package trycatch;

public class SampleTryCatch {
	public static void main(String[] args) {
	try{
            System.out.println("in try");
		m1();
	}catch(Exception e){
	           System.out.println("in catch");	
	}
        finally{
            System.out.println("in finally..");
        }
	}
        
        private static void m1(){
            System.out.println("m1 method called..");
            System.exit(0);
        }
}
