


package day_03;

// use of final keyword
public class Bus {
 final int highestSpeed = 120;
 private String color;
 private String owner;
 
 public Bus(String color, String owner) {
	 this.color = color;
	 this.owner = owner;
 }
 
 public void display() {
	 System.out.println("color -  "+this.color+"  owner - "+this.owner+"  Highestspeed - "+this.highestSpeed);
 }
 
 public static void main(String[] args) {
	 Bus b = new Bus("Red","Ramesh");
	 b.display();
 }
}
