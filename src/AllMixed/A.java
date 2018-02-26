package AllMixed;
class A extends Thread {
	private int i;
	public void run() {i = 2;}
	public static void main(String[] args) {
	A a = new A();
	a.run();
	System.out.print(a.i);
	}}
