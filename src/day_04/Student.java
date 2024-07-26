package day_04;

public class Student {
	int rollno;
	String name;
	String city;
	
	public Student(int rollno,String name, String city){
		this.rollno = rollno;
		this.name=name;
		this.city=city;
	}
	
	public String toString() {
		return "name-"+name+"  " +"rollno-"+rollno+"  "+"city-" + city;
	}
	
	
	
 public static void main(String[] args) {
	 Student s1 = new Student(1,"Aleena","Delhi");
	 Student s2 = new Student(2,"Mariya","Delhi");
	 
	 System.out.println(s1);
	 System.out.println(s2);
 }
}
