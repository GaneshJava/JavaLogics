package oops.poly;


public class Methodoverloading {
	
	//Method overloading Same method names diff no of parameters
	int calculate(int a,int b){
		System.out.println("in method int calculate");
		return 0;
	}

	static int calculate(int a){
		int value = 1;
		System.out.println(value);
		return 0;
	}
	//Method overloading same method name diff type of parameters
	int calculate(float a){
		int value = 1;
		System.out.println(value);
		return value;
	}
	
	int calculate(float a,float b){
		int value = 1;
		System.out.println(value);
		return value;
	}
	
	public static void main(String args[]){
		Methodoverloading mo = new Methodoverloading();
		mo.calculate(1,1);
		Methodoverloading.calculate(2);
	}
	
}


