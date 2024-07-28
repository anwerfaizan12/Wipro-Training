package day_05;

abstract class Animal {
	
	public abstract void sound();
	
 public  void sleep() {
	 System.out.println("Sleep -> Zzzz...");
 }
}

public class Dog extends Animal{
	
	public void sound() {
		System.out.println(" sound -> Bhon Bhon ...");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.sleep();
	}
}
