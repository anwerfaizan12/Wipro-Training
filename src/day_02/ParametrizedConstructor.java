package day_02;

public class ParametrizedConstructor {
		int age;
		String name;
		int id;
		public ParametrizedConstructor(String name,int age,int id) {
			this.age=age;
			this.name=name;
			this.id=id;
		}
		
		public void display() {
			System.out.println("Details of the employee -> ");
			System.out.println("name - " + this.name);
			System.out.println("age - " + this.age);
			System.out.println("id - " + this.id);
		}
		
		public static void main(String[] args) {
			ParametrizedConstructor obj = new ParametrizedConstructor("faizan",26,1233245);
			obj.display();
		
}
}
