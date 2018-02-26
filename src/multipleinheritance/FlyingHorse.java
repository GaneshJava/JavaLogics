package multipleinheritance;

public class FlyingHorse {
	
	Eagle eagle = new Eagle();
	Horse horse = new Horse();
	
	public void fly(){
		eagle.fly();
	}
	
	public void run(){
		horse.run();
	}

	public static void main(String[] args) {
		FlyingHorse flyingHorse = new FlyingHorse();
		flyingHorse.fly();
		flyingHorse.run();
	}
}
