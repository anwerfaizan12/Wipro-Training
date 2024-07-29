package day_06;

public class ExceptioHandling2 {
	 public static void main(String[] args) {
		 try {
		 int[] arr = new int[5];
		 arr[5]=30/0;
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
