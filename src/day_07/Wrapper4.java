package day_07;

public class Wrapper4 {
	 public static void main(String[] args) {
		 Integer a = 60;
		 int i = a.intValue();  // converting Integer into int explicitly
		 int j =a;     // unboxing
		 System.out.println(a+" "+j+" "+i);
	 }
}
