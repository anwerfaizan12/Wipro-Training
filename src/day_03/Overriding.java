package day_03;

 class Bank {
	float roi = 5.3f;
	public void getRateOfInterest() {
		System.out.println("Rate of interrest for Bank is - "+roi);
	}
}

 class Sbi extends Bank {
	private float roi=8.4f;
}

 class Icici extends Bank {
	private float roi = 7.3f;
public void getRateOfInterest() {
	System.out.println("Rate of interrest for ICICI is - "+roi);
	}
}

 class Axis extends Bank {
	float roi = 9.7f;
public void getRateOfInterest() {
	System.out.println("Rate of interrest is - "+roi);
	}
}

public class Overriding {
  public static void main(String[] args) {
	  Bank b1=new Bank();
	  b1.getRateOfInterest();
	  
	  Sbi b2 =new Sbi();
	  b2.getRateOfInterest();
  }
}
