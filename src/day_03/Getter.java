package day_03;

public class Getter {
	 final int id = 231;
	 private String name;
	 private int age;
	 
	 public Getter(String name,int age) {
		 this.name = name;
		 this.age =age;
	 }
	 
	 public void display() {
		 System.out.println("name - "+this.name+" age - "+this.age +" id - "+this.id);
	 }
	 
	 public String getValue() {
		 return this.name;
	 }
	 
	 public static void main(String[] args) {
		 Getter s =new Getter("Ramesh",30);
		 s.display();
		 System.out.println(s.getValue());
	 }
}
