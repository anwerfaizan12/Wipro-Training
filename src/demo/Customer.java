package demo;

 public class Customer{
	protected String cName = "faizan";
	protected int cAge = 25;
	
	void display() {
		System.out.println("name -> "+cName+",  age -> "+cAge);
	}
	
	

	public static void main(String[] args) {
		 Customer c = new Customer();
		 c.display();
	 }
}

