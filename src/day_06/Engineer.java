package day_06;

 final class Employee {
 public void Display() {
	 System.out.println("I am an Employee");
 }
}

 
 // This code will show error because Employee class can not be inherited because of final class.
public class Engineer extends Employee{
	public void Display() {
		  System.out.println("I am an Engineer");
	  }
	 public static void main(String[] args) {
		  Engineer e = new Engineer();
		  e.Display();
	 }
}