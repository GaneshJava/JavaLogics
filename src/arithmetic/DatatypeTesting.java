package arithmetic;

public class DatatypeTesting {
public static void main(String ganesh[]){

	float a = 10;
	double b= 10;
	int c = 10;
	long d = 10;
	char e = 10;
	String f = "10";
	
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("d="+d);
	System.out.println("e="+e);
	System.out.println("f="+f);
	Boolean b1 = a==b;
	System.out.println("a==b:" + b1);
	Boolean b2 = a==c;
	System.out.println("a==c:"+b2);
	Boolean b3 = a==d;
	System.out.println("a==d:"+b3);
	Boolean b4 = a==e;
	System.out.println("a==e:"+b4);
	Boolean b5 = f.equals(a);
	System.out.println("a==f:"+b5);
}
}
