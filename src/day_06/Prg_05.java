package day_06;

public class Prg_05 {
	 public static void main(String[] args) {
		 try {
		 int[] arr = new int[10];
		 arr[8]=30/0;
		 }
	 catch(ArithmeticException e) {
		 System.out.println("Arithmetc Exception occurs");
	 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("ArrayIndexOutOfBounds Exception occurs");
		 }
		 catch(Exception e) {
			 System.out.println("Parent Exception occurs");
		 }
		 System.out.println("rest of the code");
}
}