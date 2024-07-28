package day_05;

interface Animal3{
	public void bark();
	default void speak() {
		System.out.println("Speaking from interface");
	}
}

class Dog3 implements Animal3{
	public void bark() {
		System.out.println("Dog is barking");
	}
	
	public void speak() {
		System.out.println("Speaking from subclass");
	}
}

public class Prg7 {
  public static void main(String[] args) {
	  Dog3 d = new Dog3();
	  d.bark();
	  d.speak();
  }
}
