package polymorpishm;

public class Sub extends Values{
	Sub(int i, int j){
		super(i,j);
	}
	public int substraction(){
		return i-j;
	}
	public void printValues(){
		System.out.println("in Sub class:-");
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
