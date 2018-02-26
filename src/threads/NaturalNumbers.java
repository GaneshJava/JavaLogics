package threads;

public class NaturalNumbers {
	public static void main(String[] args) {
        Thread t1 = new Thread(new Odd());
        Thread t2 = new Thread(new Even());

        t1.start();
        t2.start();
		
	}

}

class LockClass {
	final static Object lock = new Object();
}

class Odd implements Runnable {
	public void run(){
		synchronized (LockClass.lock) {
		for(int i=1; i<=10; i=i+2){
			System.out.println(i);
			LockClass.lock.notify();
		try{
			LockClass.lock.wait();
		}catch(Exception e){
			
		}
		}
		LockClass.lock.notify();
		}
		
	}
};

class Even implements Runnable{
	public void run(){
		synchronized (LockClass.lock) {
		for(int i=2; i<=10; i=i+2){
			System.out.println(i);
			LockClass.lock.notify();
			try{
				LockClass.lock.wait();
			}catch(Exception e){
				
			}
		}
		LockClass.lock.notify();
		}
	}
};

