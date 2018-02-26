package polymorpishm;

public class Overriding {
public static void main(String[] args) {
	//Add a = (Add) new Values(1, 2);
	//Add a = new Add(1, 2);
	//Values a = new Add(1, 2);
	
//	int sum = ((Add) a).addition();
//	int sub = ((Sub) a).substraction();
//	int mul = ((Mul) a).multiply();
//	int div = ((Div) a).division();
	
//	Add b = (Add) new Values(1, 2);
	Values a = new Add(1,2);
	int sum = ((Add) a).addition();
	System.out.println("sum- "+sum);
        sum = ((Add) a).addition();

//	System.out.println("sum-"+sum);
//	System.out.println("sub-"+sub);
//	System.out.println("mul-"+mul);
//	System.out.println("div-"+div);
}
}
