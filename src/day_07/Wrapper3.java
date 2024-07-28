package day_07;

public class Wrapper3 {
 public static void main(String[] args) {
	 int a = 20;
	 Integer i = Integer.valueOf(a);  // converting int into Integer explicitly
	 Integer j =a;     // autoboxing
	 System.out.println(a+" "+j+" "+i);
 }
}
