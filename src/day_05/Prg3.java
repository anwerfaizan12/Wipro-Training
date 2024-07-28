package day_05;

abstract class Animal2{
	public abstract void sleep();
	public abstract void eat();
}

class Lion extends Animal2{
	
	public void eat() {
		System.out.println("Lion eats zebra meat most");
	}
	
	public void sleep() {
		System.out.println("Lion sleep -> Zzzzz..");
		System.out.println();
	}
}

class Tiger extends Animal2{
	
	public void eat() {
		System.out.println("Tiger eats Deer meat most");
	}
	
	public void sleep() {
		System.out.println("Lion sleep -> Yyyy..");
		System.out.println();
	}
}

class Deer extends Animal2{
	
	public void eat() {
		System.out.println("Deer eats grass and leaves");
	}
	
	public void sleep() {
		System.out.println("Lion sleep -> Ssss....");
	}
}

public class Prg3 {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();
		l.sleep();
	
		Tiger t = new Tiger();
		t.eat();
		t.sleep();
		
		Deer d = new Deer();
		d.eat();
		d.sleep();
	}
}
