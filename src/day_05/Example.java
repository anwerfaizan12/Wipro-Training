package day_05;

interface Employee {
 void getSalary();
}

class Engineer implements Employee{
	public void getSalary() {
		System.out.println("Salary has been credited");
	}
	
	public class Example{
			public static void main(String[] args) {
			Engineer e =new Engineer();
			e.getSalary();
		}
	}
}
