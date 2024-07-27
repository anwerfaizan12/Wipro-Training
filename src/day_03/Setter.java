package day_03;

public class Setter {
 final int id = 231;
 private String name;
 private int age;
 
 public Setter(String name,int age) {
	 this.name = name;
	 this.age =age;
 }
 
 public void setValues(String name,int age) {
	 this.name = name;
	 this.age =age;
 }
 
 public void display() {
	 System.out.println("name - "+this.name+" age - "+this.age +" id - "+this.id);
 }
 
 public static void main(String[] args) {
	 Setter s =new Setter("Ramesh",30);
	 s.display();
	 s.setValues("Rahul",25);
	 s.display();
 }
}
