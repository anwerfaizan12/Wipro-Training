package day_06;
import demo.*;

 class DailyCustomer extends demo.Customer{
	 
	public void display() {
		System.out.println("I am dailyCustomer class");
		System.out.println(cName);
		System.out.println(cAge);
	}
	
}

public class Prg_03 {
 public static void main(String[] args) {
	 DailyCustomer d = new DailyCustomer();
	 d.display();
 }
}
