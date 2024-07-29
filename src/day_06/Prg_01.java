package day_06;

public class Prg_01 {
 private int age=25;
 private String name = "faizan";
 
 public void display() {
	 System.out.println("age -> "+age+"  name -> "+name);
 }
 
 // private variables and methods can be accessed within the class only.
 
 public static void main(String[] args) {
	 Prg_01 p1 = new Prg_01();
	 System.out.println(p1.name);
	 System.out.println(p1.age);
 }
}
