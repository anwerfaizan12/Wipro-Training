package day_05;

interface Flyable {
	public void fly_obj();
}

class Airplane implements Flyable{
	public void fly_obj() {
		System.out.println("I am Airplane");
	}
}

class Helicopter implements Flyable{
	public void fly_obj() {
		System.out.println("I am Helicopter");
	}
}

class Spacecraft implements Flyable{
	public void fly_obj() {
		System.out.println("I am Spacecraft");
	}
}

public class Prg8 {
	public static void main(String[] args) {
		
		Airplane a = new Airplane();
		a.fly_obj();
		
		Helicopter h = new Helicopter();
		h.fly_obj();
		
		Spacecraft s = new Spacecraft();
		s.fly_obj();
	}

}
