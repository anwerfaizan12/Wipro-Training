package day_05;

interface Resizeable{
	public void resizeWidth(int width);
	public void resizeHeight(int height);
}

class Rectangle implements Resizeable{
	private int height = 6;
	private int width =4;
	
	public void resizeWidth(int width) {
		this.width=width;
	}
	
	public void resizeHeight(int height) {
		this.height = height;
	}
	
	public void display() {
		System.out.println("Height -> "+height);
		System.out.println("Width -> "+width);
	}
}

public class Prg9 {
 public static void main(String[] args) {

		Rectangle r =  new Rectangle();
		System.out.println("Width and Height before resize");
		r.display();
		System.out.println();
		System.out.println("Width and Height after resize");
		r.resizeHeight(10);
		r.resizeWidth(8);
		r.display();
 }
}
