// name : faizan anwer
// date : 15/07/2024
//description : printing numbers from 1 to 99 divide by 3,5 and both

package day_01;

public class Prg7 {
	 public static void main(String[] args) {
		 System.out.println("Divided by 3.");
			for(int i=1;i<=99;i++) {
				if(i%3==0) {
					System.out.print(i+", ");
				}
			}
			System.out.println();
			
			System.out.println("Divided by 5.");
			for(int i=1;i<=99;i++) {
				if(i%5==0) {
					System.out.print(i+", ");
				}
			}
			
			System.out.println();
			
			System.out.println("Divided by 3 & 5.");
			for(int i=1;i<=99;i++) {
				if(i%3==0 && i%5==0) {
					System.out.print(i+", ");
				}
			}
	 }
}
