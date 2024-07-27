package day_03;

public class Rectangle {
	
	private int length = 5;
	private int width = 4;
	
	public void getter() {
		System.out.println("Length of the rectangle is - "+ length);
		System.out.println("Width of the rectangle is - "+ width);	
		}
	
	public void setter(int l,int w) {
		this.length=l;
		this.width=w;
		System.out.println("The length and width changed");
	}
	
  public static void main(String[] args) {
	  Rectangle r = new Rectangle();
	  r.setter(3, 2);
	  r.getter();
  }
}
