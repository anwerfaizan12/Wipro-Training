package day_05;

// default method in interface
interface Shape {
	default void color() {
		System.out.println("Color is Teal");
	}
	 double area();
}

class Circle implements Shape{
	double radius = 3.5;
	public double area() {
		return 3.14*radius*radius;
	}
}

public class Demo{
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Area is - "+c.area());
		c.color();
	}
}
	
	
