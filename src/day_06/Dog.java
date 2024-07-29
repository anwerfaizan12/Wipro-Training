package day_06;

 class Animal {
	 public final void Display() {
		 System.out.println("This is Animal class");
	 }
}


public class Dog extends Animal{
	
	// Display method will show error because it is trying to override Display method of Animal class which is not possible because of final keyword
	public void Display() {
		System.out.println("This is Dog class");
	}
	 public static void main(String[] args) {
		  Dog d = new Dog();
		  d.Display();
	 }
}
