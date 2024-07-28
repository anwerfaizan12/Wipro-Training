package day_05;

interface Shape3{
	public double getArea();
}

class Circle3 implements Shape3{
	
	private int r = 5;
	public double getArea() {
		return Math.PI * r * r;
	}
}

class Rectangle3 implements Shape3{
	private int length=6;
	private int width=4;
	public double getArea() {
		return length*width;
	}
}

class Triangle3 implements Shape3{
	private int height=6;
	private int base = 4;
	
	public double getArea() {
		return 0.5*base*height;
	}
}

public class Prg6 {
 public static void main(String[] args) {
	 
	 Circle3 c = new Circle3();
	 System.out.println("Area of circle is -> "+c.getArea());
	 
	 Rectangle3 r = new Rectangle3();
	 System.out.println("Area of rectangle is -> "+r.getArea());
	 
	 Triangle3 t = new Triangle3();
	 System.out.println("Area of triangle is -> "+t.getArea());
 }
}
