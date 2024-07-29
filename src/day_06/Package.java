package day_06;

class Package2 {
	private int x=5;
	
	private void Display() {
		System.out.println("This is package2");
	}
	
	public void getValue() {
		System.out.println(x); // private variables and methods can be used within same class
	}
}
	
public class Package extends Package2{
	 public static void main(String[] args) {
		 Package2 p =new Package2();
		 Package pac = new Package();
		//  pac.Display();   // Private members can not be accessed from derived class
		 pac.getValue();
	 }
}



