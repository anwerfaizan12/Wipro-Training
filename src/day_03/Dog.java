package day_03;

public class Dog {
	
 private String name;
  private String breed;
  
  public Dog(String name,String breed) {
	  this.name=name;
	  this.breed=breed;
  }
  
  public void setter(String name, String breed) {
	  this.name=name;
	  this.breed=breed;
  }
  
  public void display() {
	  System.out.println("Name of the dog is - "+name);
	  System.out.println("Name of the breed is - "+breed);
  }
  
  public static void main(String[] args) {
	  Dog d=new Dog("Rocky","Germen sephard");
	  d.display();
	  d.setter("Harry","Pitbull");
	  d.display();
  } 
}
