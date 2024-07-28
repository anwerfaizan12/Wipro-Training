package day_05;

abstract class Employee1{
	public abstract void calculateSalary();
	public abstract void displayInfo();
}

class Manager extends Employee1{
	
	public void calculateSalary() {
		System.out.println("Salary has been credited");
	}
	
	public void displayInfo() {
		System.out.println("Rhis is manager class");
		System.out.println();
	}
}

class Programmer extends Employee1{
	public void calculateSalary() {
		System.out.println("Salary has been credited");
	}
	
	public void displayInfo() {
		System.out.println("Rhis is programmer class");
	}
}


public class Prg4 {
  public static void main(String[] args) {
	  Manager m = new Manager();
	  m.calculateSalary();
	  m.displayInfo();
	  
	  Programmer  p =new Programmer();
	  p.calculateSalary();
	  p.displayInfo();
  }
}
