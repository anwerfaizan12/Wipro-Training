package day_03;

public class Student {
	private String name;
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	private int EnglishMarks;
	private int hindiMarks;
	int sum;
	float avg;
	
	public Student(String name,int pMarks,int cMarks, int mMarks, int eMarks, int hMarks) {
		this.physicsMarks = pMarks;
		this.chemistryMarks = cMarks;
		this.mathMarks = mMarks;
		this.EnglishMarks = eMarks;
		this.hindiMarks = hMarks;
	}
	
	public void findSum() {
		 sum =  physicsMarks + chemistryMarks + mathMarks + EnglishMarks + hindiMarks;
		System.out.println(sum); 
	}
	
	
	public void findAverage() {
	     avg = sum/5;
	    System.out.println(avg);
	}
	
	public void grade() {
		int s =  physicsMarks + chemistryMarks + mathMarks + EnglishMarks + hindiMarks;
		float avg = s/5;
		if(avg>90.0) {
			System.out.println("Grade is A");
		}
		else if(avg>70.0) {
			System.out.println("Grade is B");
		}
		else if(avg>60.0) {
			System.out.println("Grade is c");
		}
		else if(avg>40.0) {
			System.out.println("Grade is D");
		}
		
	}
	
 public static void main(String[] args) {
	 Student s1= new Student("Rahul",67,87,89,96,48);
	 s1.findSum();
	 s1.findAverage();
	 s1.grade();
 }
}
