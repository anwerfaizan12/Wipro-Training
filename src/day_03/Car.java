package day_03;

 class Vehicl {
  public void drive() {
	  System.out.println("This car has been repared");
  }
}

public class Car extends Vehicl{
	public void drive() {
		System.out.println("Repairing a car");
	}
	public static void main(String[] args) {
		Car c =new Car();
		c.drive();
	}
}