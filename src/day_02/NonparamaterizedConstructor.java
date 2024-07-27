package day_02;

public class NonparamaterizedConstructor {
	int age;
	public NonparamaterizedConstructor() {
		age=26;
	}
	
	public static void main(String[] args) {
		NonparamaterizedConstructor obj = new NonparamaterizedConstructor();
		System.out.println("Age of the employee - "+obj.age);
	}
}
