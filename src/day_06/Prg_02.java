package day_06;
import demo.*;

class Employee5 extends demo.Employee4{
	public void display() {
		System.out.println("Employee name -> "+ name+ ",  Employee department-> "+department+ ",  Employee id -> "+id);
	}
}


public class Prg_02 {
 public static void main(String[] args) {
	 Employee5 e =new Employee5();
	 e.display();
 }
}
