package day_03;

 class Vehicle {
	  protected String brand = "Porsche";
	   
	  public void price() {
		  System.out.println("Price is 300000$");
	  }
	}

	public class Suv extends Vehicle{
		private String modelName = "BMW";
		public static void main(String[] args) {
			Suv myCar = new Suv();
			myCar.price();
		}
	}