package day_03;

// use of this keyword

public class Employee {
	  final int id;
	  private String name;
	  private int age;
	  
	  public  Employee(int id,String name,int age){
		  this.name = name;
		  this.age=age;
		  this.id=id;
	  }
	  
	  public void display() {
		  System.out.println("name - "+this.name+" "+" age - "+this.age+" id - "+this.id);
	  }
	  
	  public static void main(String[] args) {
		  Employee e1 = new Employee(123,"Ramesh",25);
		  e1.display();
	  }
  
}
