package day_05;

abstract class Shape3D{
	public abstract void calculateVolume();
	public abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D{
	
	private int r =5;
	
	public void calculateVolume() {
		double volume = 4/3 * Math.PI * r*r*r;
		System.out.println("Volume of the sphere is -> "+volume);
		System.out.println();
	}
	
	
	public void calculateSurfaceArea() {
		double surfaceArea = 4 * Math.PI * r*r;
		System.out.println("Volume of the sphere is -> "+surfaceArea);
	
	}
}

class Cube extends Shape3D{
	private int a =6;
	
	public void calculateVolume() {
		int volume = a*a*a;
		System.out.println("Volume of the cube is -> "+volume);
	}
	
	
	public void calculateSurfaceArea() {
		int surfaceArea = 6*a*a;
		System.out.println("Surface area of the cube is -> "+surfaceArea);
	}
}

public class Prg5 {

	public static void main(String[] args) {
		
		Sphere s = new Sphere();
		s.calculateSurfaceArea();
		s.calculateVolume();
		
		Cube c = new Cube();
		c.calculateSurfaceArea();
		c.calculateVolume();
	}
}
