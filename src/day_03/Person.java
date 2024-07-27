package day_03;

public class Person {
	
 private String name;
 private int age;
 
 public Person(String name,int age) {
	 this.name=name;
	 this.age=age;
 }
 
 public void display() {
	 System.out.println("Name of the person is - " + name);
	 System.out.println("Age of the person is - "+ age);
 }
 
 public static void main(String[] args) {
	 Person p1=new Person("Aleena",26);
	 Person p2 = new Person("Neha",23);
	 p1.display();
	 p2.display();
 }
 
}
